package com.alphaben.xrocketemail.email;

import java.util.Set;

/**
 *
 * @author ebennamr
 */
public class Email {

    public static String TEXT_TYPE = "TEXT";
    public static String HTML_TYPE = "HTML";

    private final String subject;
    private final String content;
    private final String to;
    private final boolean isHasAttchaments;
    private final String from;
    private Set<String> ListAttachament;

    private String contentType;

    public Email(String from, String to, String subject, String content, Set<String> listAttachament) {
        this.subject = subject;
        this.content = content;
        this.from = from;
        this.to = to;
        this.contentType = Email.TEXT_TYPE;
        this.isHasAttchaments = true;
        this.ListAttachament = listAttachament;
    }

    public String getFrom() {
        return from;
    }

    public Email(String from, String to, String Subject, String Content) {

        this.subject = Subject;
        this.content = Content;
        this.to = to;
        this.contentType = Email.TEXT_TYPE;
        this.from = from;
        this.isHasAttchaments = false;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getTo() {
        return to;
    }

    public String getContentType() {
        return contentType;
    }

    public boolean isIsHasAttchaments() {
        return isHasAttchaments;
    }

    public Set<String> getListAttachament() {
        return ListAttachament;
    }

}
