package com.alphaben.xrocketemail.ui;

import com.alphaben.xrocketemail.Output;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ebennamr
 */
public class JDialogAbout extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAbout
     */
    public JDialogAbout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Image img = new javax.swing.ImageIcon(getClass().getResource("/com/alphaben/xrocketemail/src/icon.png")).getImage().getScaledInstance(128,128, Image.SCALE_SMOOTH);
        
      lblAppIcon.setIcon(new ImageIcon(img));
     getContentPane().setBackground(new Color(0,0,102));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextArea1 = new javax.swing.JTextArea();
        lblAppIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGithub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 204, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Rocket Email is a user-friendly tool  developed  by Alphaben Student at 1337 \nto simplify sending emails to multiple recipients.\n\nVersion: 1.0 (2024)");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);

        lblAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/alphaben/xrocketemail/src/icon.png"))); // NOI18N
        lblAppIcon.setLocation(new java.awt.Point(48, 48));
        lblAppIcon.setMaximumSize(new java.awt.Dimension(48, 48));
        lblAppIcon.setMinimumSize(new java.awt.Dimension(48, 48));
        lblAppIcon.setPreferredSize(new java.awt.Dimension(48, 48));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("XRocketEmail");

        btnGithub.setBackground(new java.awt.Color(0, 0, 102));
        btnGithub.setForeground(new java.awt.Color(0, 204, 0));
        btnGithub.setText("Github");
        btnGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGithubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGithubActionPerformed
      
        try 
        {
             Desktop.getDesktop().browse(new URI("https://github.com/bennamrouche/xrocketemail"));    
        } catch (Exception e) 
        {
            Output.getInstance().error("Failed to open GitHub link");
        }
       
    }//GEN-LAST:event_btnGithubActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGithub;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAppIcon;
    // End of variables declaration//GEN-END:variables
}
