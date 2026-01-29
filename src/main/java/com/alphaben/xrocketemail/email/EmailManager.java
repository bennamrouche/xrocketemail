package com.alphaben.xrocketemail.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import com.alphaben.xrocketemail.Output;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.JProgressBar;

public class EmailManager extends Thread {

    private final Properties props;
    private final Authenticator auth;
    private final Output out;
    private final List<Email> emailQueue;
    private int success = 0;
    private int fail = 0;

    JProgressBar ProgressBar;

    public EmailManager(String username, String password, List<Email> emailQueue, JProgressBar ProgressBar) {
        this.emailQueue = emailQueue;
        this.out = Output.getInstance();
        this.auth = getAuthenticator(username, password);
        this.ProgressBar = ProgressBar;

        props = new Properties();

        //        props.put("mail.smtp.auth", "true");
        //        props.put("mail.smtp.starttls.enable", "true");
        //        props.put("mail.smtp.host", "smtp.gmail.com");
        //        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "false");  // MailHog doesn't require auth
        props.put("mail.smtp.starttls.enable", "false"); // TLS not needed
        props.put("mail.smtp.host", "localhost"); // MailHog default host
        props.put("mail.smtp.port", "1025");

    }

    public synchronized void success() {
        this.success++;
    }

    public synchronized void fail() {

        this.fail++;
    }

    @Override
    public void run() {

        this.success = 0;
        this.fail = 0;
        ProgressBar.setVisible(true);
        ProgressBar.setMaximum(emailQueue.size());

        out.info("Start sending emails at " + new Date().toString());

        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {

            for (Email email : emailQueue) {

                executorService.submit(() -> {

                    try {

                        sendEmail(email);
                        success();
                        out.info("Email Sent Successfully " + email.getTo());

                    } catch (IOException | MessagingException e) {
                        out.error("Failed to send email to " + email.getTo() + " because " + e.getMessage());
                        fail();
                    }

                    ProgressBar.setValue(fail + success);
                });
            }

            executorService.shutdown();

            try {

                boolean b = executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException ex) {
            }
        }

        out.info("Finish Send   Emails at " + new Date().toString());
        out.info("Success  " + success + "   Fail :  " + fail);

        ProgressBar.setVisible(false);
        emailQueue.clear();
    }

    private void sendEmail(Email email) throws MessagingException, IOException {

        Session session = Session.getInstance(props, auth);

        Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(email.getFrom()));

        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getTo()));

        message.setSubject(email.getSubject());

        Multipart multipart = new MimeMultipart();

        MimeBodyPart textPart = new MimeBodyPart();

        if (email.getContentType().equals(Email.TEXT_TYPE)) {
            textPart.setText(email.getContent());
        } else if (email.getContentType().equals(Email.HTML_TYPE)) {
            textPart.setContent(email.getContent(), "text/html");
        }

        multipart.addBodyPart(textPart);

        if (email.isIsHasAttchaments()) {
            for (String attachment : email.getListAttachament()) {
                MimeBodyPart attachmentPart = new MimeBodyPart();
                attachmentPart.attachFile(attachment);
                multipart.addBodyPart(attachmentPart);
            }
        }

        message.setContent(multipart);
        Transport.send(message);

    }

    public static Authenticator getAuthenticator(String email, String password) {

        return new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        };

    }

}
