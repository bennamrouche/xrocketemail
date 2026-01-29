package com.alphaben.xrocketemail.ui;

import com.alphaben.xrocketemail.email.Email;
import com.alphaben.xrocketemail.email.EmailManager;
import com.alphaben.xrocketemail.email.EmailValidator;
import com.alphaben.xrocketemail.files.FileChooser;
import com.alphaben.xrocketemail.files.FileLoader;


import com.alphaben.xrocketemail.Main;
import com.alphaben.xrocketemail.Output;
import com.alphaben.xrocketemail.Utils;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author ebennamr
 */

public class MainFrame extends javax.swing.JFrame {

    private Output out; 
    public MainFrame(String title)
    {
        super(title);
        initComponents();
      
       DefaultListModel<String>     listmodel   = new DefaultListModel<>();
       
       out = Output.getInstance(jTextOutput);
        BufferedImage buffImage;
        try {
            buffImage = ImageIO.read( Main.class.getResource("/icon.png"));
            setIconImage(buffImage);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
 
       
      jListatch.setModel(listmodel);
      jTextOutput.setSelectedTextColor(Color.YELLOW);
      ProgressBar.setVisible(false);
      
      
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextOutput = new javax.swing.JTextArea();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtextEmailContent = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSubject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextRecipients = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboContentType = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnAttachDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        checkAttachments = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListatch = new javax.swing.JList<>();
        btnAttachAdd = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextOutput = new javax.swing.JTextPane();

        TextOutput.setEditable(false);
        TextOutput.setBackground(new java.awt.Color(5, 0, 102));
        TextOutput.setColumns(20);
        TextOutput.setForeground(new java.awt.Color(51, 204, 0));
        TextOutput.setLineWrap(true);
        TextOutput.setRows(5);
        TextOutput.setText("🚧❗");
        TextOutput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 204)), "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14), new java.awt.Color(246, 244, 235))); // NOI18N
        jScrollPane1.setViewportView(TextOutput);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar.setFont(new java.awt.Font("Helvetica Neue", 1, 11)); // NOI18N
        ProgressBar.setStringPainted(true);
        getContentPane().add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 568, 221, 20));

        jLabel1.setBackground(new java.awt.Color(246, 244, 235));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 85, 24));

        jLabel2.setBackground(new java.awt.Color(246, 244, 235));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 85, 30));

        jTextFieldEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextFieldEmail.setText("alphaben@example.com");
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 300, 30));

        jPasswordField.setText("hello123");
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 51, 300, 30));

        jLabel3.setBackground(new java.awt.Color(246, 244, 235));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Conetet :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 30));

        jtextEmailContent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jtextEmailContent.setForeground(new java.awt.Color(255, 255, 255));
        jtextEmailContent.setCaretColor(new java.awt.Color(255, 255, 255));
        jtextEmailContent.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane2.setViewportView(jtextEmailContent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 410, 200));

        jLabel4.setBackground(new java.awt.Color(246, 244, 235));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Subject");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jTextFieldSubject.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextFieldSubject.setText("hello ");
        getContentPane().add(jTextFieldSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 300, 30));

        jLabel5.setBackground(new java.awt.Color(246, 244, 235));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Recipients List: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 120, 30));

        jTextRecipients.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextRecipients.setForeground(new java.awt.Color(255, 255, 255));
        jTextRecipients.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextRecipients.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextRecipients.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane3.setViewportView(jTextRecipients);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 202, 410, 200));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("From File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 30));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setText("From File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 150, 30));

        jLabel6.setText("Send As");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 90, 30));

        comboContentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT", "HTML" }));
        comboContentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboContentTypeActionPerformed(evt);
            }
        });
        getContentPane().add(comboContentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 30));

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton3.setText("about");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, 30));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 90, 30));

        btnAttachDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAttachDelete.setText("delete");
        btnAttachDelete.setEnabled(false);
        btnAttachDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAttachDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 90, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        checkAttachments.setText("Attachments");
        checkAttachments.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkAttachmentsStateChanged(evt);
            }
        });
        getContentPane().add(checkAttachments, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 30));

        jListatch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jListatch.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListatch.setEnabled(false);
        jScrollPane4.setViewportView(jListatch);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 270, 110));

        btnAttachAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAttachAdd.setText("add");
        btnAttachAdd.setEnabled(false);
        btnAttachAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAttachAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 90, 30));

        jTextOutput.setEditable(false);
        jTextOutput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N
        jTextOutput.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(jTextOutput);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 830, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttachDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachDeleteActionPerformed
       int i = jListatch.getSelectedIndex();
       if(i >=  0)
       {
            DefaultListModel<String>  model = (DefaultListModel<String>) jListatch.getModel();
            model.remove(i);
             i = i < model.getSize() ?  i : model.getSize() - 1;
             
            jListatch.setSelectedIndex(i);

       }
        
    }//GEN-LAST:event_btnAttachDeleteActionPerformed

    private void btnAttachAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachAddActionPerformed
           
        HashSet<String> files = FileChooser.choose("Select Attachements");
           
           DefaultListModel<String> jlistModel = (DefaultListModel<String>) jListatch.getModel();
        
           files.forEach(e->{
                jlistModel.add(0,e);
           });
        
           jListatch.setModel(jlistModel);
    }//GEN-LAST:event_btnAttachAddActionPerformed

    private void checkAttachmentsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkAttachmentsStateChanged
        boolean state = checkAttachments.isSelected();
        
        btnAttachAdd.setEnabled(state);
        btnAttachDelete.setEnabled(state);
         jListatch.setEnabled(state);
        
    }//GEN-LAST:event_checkAttachmentsStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       Optional<String> Optpath = FileChooser.choose();
       EmailValidator validator;
       if(Optpath.isPresent())
       {
          try 
            {
               
              Set<String> emails = FileLoader.LoadEmailsFromFile(Optpath.get());
              validator = new EmailValidator();
              Set<String> corrected = new HashSet<>();
              int invalid = 0;
              
            for(String e : emails){
                  e = e.trim();
                  if(e.isEmpty())
                    continue;
                  
                  if(validator.isValidEmail(e))
                  {
                        corrected.add(e);
                  }
                  else
                  {
                    invalid ++;
          
                  }
                  
                  
                  } // end for emails 
              
           if(invalid > 0)
           {
               int res = JOptionPane.showConfirmDialog(
                    null, 
                    "File contains " + invalid + " invalid email(s).\nDo you want to continue?",
                    "Confirmation", 
                    JOptionPane.YES_NO_OPTION 
                   );
               
               if(res == JOptionPane.NO_OPTION)
                    return;
           }
                   
                   StringBuilder strBuild= new StringBuilder();
                   for (String string : corrected)
                   {
                       strBuild.append(string);
                        strBuild.append("\n");
                   }
                   jTextRecipients.setText(strBuild.toString());
                  
                   Output.getInstance().info(" Loaded successfully\n");

                  
              
               
          
           
           }
           catch(FileNotFoundException  e) 
           {
                  Output.getInstance().error("File not found error");
           }
           catch (IOException ex) {
             Output.getInstance().error(" Can't read file ");
           }
           
           
           
       }
       
       
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboContentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboContentTypeActionPerformed
       
   
     
    }//GEN-LAST:event_comboContentTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Optional<String>  Optpath = FileChooser.choose();
        
        if(Optpath.isPresent())
            FileLoader.loadFileTo(Optpath.get(), jtextEmailContent);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            jTextOutput.setText("");
            EmailValidator validator    = new EmailValidator();
            List<Email> emailQeue        = new LinkedList<>();
            
            String email = jTextFieldEmail.getText().trim().toLowerCase();
            String passowrd = new String(jPasswordField.getPassword());
            
            String subject = jTextFieldSubject.getText(); // check
            String content = jtextEmailContent.getText();
            
            String ContentType = (String) comboContentType.getSelectedItem();
            
            Set<String> attachmentList = new HashSet<>();
            
            if(checkAttachments.isSelected())
            {
                DefaultListModel<String> model = (DefaultListModel<String>) jListatch.getModel();
                for(Object file : model.toArray())
                    attachmentList.add((String)file);
            }
            
            Set<String> recipeintsList   = Utils.StringEmailToSet(jTextRecipients.getText());
            
            
            
//===============  check ================
if (!validator.isValidEmail(email))
{
    out.error("Invalid Email "+ email);
    return;
}

if (recipeintsList.isEmpty())
{
    out.warning("No Recpients ");
    out.info("Task canceled  ");
    return;
}


if (subject.isEmpty())
{
    out.warning("Empty Subejct");
    return;
}


if (content.isEmpty())
{
    out.error("No Email Content !!");
    out.info("Task canceled");
    return;
}

for(String  to : recipeintsList)
{
    Email tmp ;
    
    if(checkAttachments.isSelected()) {
        tmp =  new Email(email, to, subject, content, attachmentList);
    }
    else
    {
        tmp =  new Email(email, to, subject, content);
    }
    
    tmp.setContentType(ContentType);
    emailQeue.add(tmp);
}

    EmailManager mangaer = new EmailManager(email, passowrd, emailQeue, ProgressBar);
    
    mangaer.start();
    mangaer.join();
    mangaer = null;
        } catch (InterruptedException ex) {
            System.getLogger(MainFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
     }
    
    }//GEN-LAST:event_btnSendActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new JDialogAbout(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JTextArea TextOutput;
    private javax.swing.JButton btnAttachAdd;
    private javax.swing.JButton btnAttachDelete;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox checkAttachments;
    private javax.swing.JComboBox<String> comboContentType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListatch;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSubject;
    private javax.swing.JTextPane jTextOutput;
    private javax.swing.JEditorPane jTextRecipients;
    private javax.swing.JEditorPane jtextEmailContent;
    // End of variables declaration//GEN-END:variables
}
