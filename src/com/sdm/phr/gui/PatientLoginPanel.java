package com.sdm.phr.gui;

import com.sdm.phr.CryptoUtil;
import com.sdm.phr.DatabaseClient;
import com.sdm.phr.KeyConfig;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PatientLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientLoginPanel
     */
    Main parent;

    public PatientLoginPanel() {
        initComponents();

        //set default key paths
        setDefaultKeyPath();
    }

    public PatientLoginPanel(Main parent) {
        this.parent = parent;
        initComponents();

        //set default key paths
        setDefaultKeyPath();
    }

    public void setDefaultKeyPath() {
        // Default key location
        jReadMasterKey.setText(KeyConfig.getInstance().getPatientReadMasterKeyPath());
        jReadPublicKey.setText(KeyConfig.getInstance().getPatientReadPublicKeyPath());
        jWriteMasterKey.setText(KeyConfig.getInstance().getPatientWriteMasterKeyPath());
        jWritePublicKey.setText(KeyConfig.getInstance().getPatientWritePublicKeyPath());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jReadMasterKey = new javax.swing.JTextField();
        btnReadMasterKey = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jReadPublicKey = new javax.swing.JTextField();
        btnReadPublicKey = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnPatientLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jWriteMasterKey = new javax.swing.JTextField();
        btnWriteMasterKey = new javax.swing.JButton();
        btnWritePublicKey = new javax.swing.JButton();
        jWritePublicKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("Full Name");

        jLabel2.setText("Read Master Key");

        btnReadMasterKey.setText("Browse");
        btnReadMasterKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadMasterKeyActionPerformed(evt);
            }
        });

        jLabel3.setText("Read Public Key");

        btnReadPublicKey.setText("Browse");
        btnReadPublicKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadPublicKeyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Patient Login");

        btnPatientLogin.setText("Login");
        btnPatientLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientLoginActionPerformed(evt);
            }
        });

        jLabel5.setText("Write Master Key");

        btnWriteMasterKey.setText("Browse");
        btnWriteMasterKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteMasterKeyActionPerformed(evt);
            }
        });

        btnWritePublicKey.setText("Browse");
        btnWritePublicKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWritePublicKeyActionPerformed(evt);
            }
        });

        jLabel6.setText("Write Public Key");

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFullName)
                            .addComponent(jReadMasterKey)
                            .addComponent(jReadPublicKey, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReadMasterKey)
                            .addComponent(btnReadPublicKey)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPatientLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jWriteMasterKey, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jWritePublicKey))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnWriteMasterKey)
                                    .addComponent(btnWritePublicKey))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReadMasterKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadMasterKey)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jReadPublicKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadPublicKey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jWriteMasterKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnWriteMasterKey))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jWritePublicKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWritePublicKey))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatientLogin)
                    .addComponent(jButton5))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientLoginActionPerformed
        String fullName = jFullName.getText();
        String readMasterKeyPath = jReadMasterKey.getText();
        String readPublicKeyPath = jReadPublicKey.getText();
        String writeMasterKeyPath = jWriteMasterKey.getText();
        String writePublicKeyPath = jWritePublicKey.getText();

        if (fullName.isEmpty() || readMasterKeyPath.isEmpty() || readPublicKeyPath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String readMasterKeyChecksum = CryptoUtil.getFileChecksum(readMasterKeyPath, "SHA1");
        String writeMasterKeyChecksum = CryptoUtil.getFileChecksum(writeMasterKeyPath, "SHA1");

        boolean isUserValid = DatabaseClient.getInstance().validatePatientLogin(fullName, readMasterKeyChecksum, writeMasterKeyChecksum);
        if (isUserValid) {
            JOptionPane.showMessageDialog(null, "Login successful", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
//            int response = JOptionPane.showConfirmDialog(null, "You are registered now. Would you like to login now?", "Login successful",
//                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            if (response == JOptionPane.NO_OPTION) {
//                System.out.println("No button clicked");
//            } else if (response == JOptionPane.YES_OPTION) {
//                System.out.println("Yes button clicked");
            parent.nextPanel(Main.PATIENT_HOME);
//            } else if (response == JOptionPane.CLOSED_OPTION) {
//                System.out.println("JOptionPane closed");
//            }
        } else {
            JOptionPane.showMessageDialog(null, "Check full name, master key, or public key, and try again", "Login Failure", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnPatientLoginActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        parent.nextPanel(Main.FIRST_SCREEN);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnReadMasterKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadMasterKeyActionPerformed
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            jReadMasterKey.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnReadMasterKeyActionPerformed

    private void btnReadPublicKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadPublicKeyActionPerformed
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            jReadPublicKey.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnReadPublicKeyActionPerformed

    private void btnWriteMasterKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteMasterKeyActionPerformed
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            jWriteMasterKey.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnWriteMasterKeyActionPerformed

    private void btnWritePublicKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWritePublicKeyActionPerformed
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            jWritePublicKey.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnWritePublicKeyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientLogin;
    private javax.swing.JButton btnReadMasterKey;
    private javax.swing.JButton btnReadPublicKey;
    private javax.swing.JButton btnWriteMasterKey;
    private javax.swing.JButton btnWritePublicKey;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JTextField jFullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jReadMasterKey;
    private javax.swing.JTextField jReadPublicKey;
    private javax.swing.JTextField jWriteMasterKey;
    private javax.swing.JTextField jWritePublicKey;
    // End of variables declaration//GEN-END:variables
}
