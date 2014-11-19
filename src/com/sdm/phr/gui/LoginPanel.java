package com.sdm.phr.gui;

import com.sdm.phr.CryptoUtil;
import com.sdm.phr.DatabaseClient;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JPanel {

    Main parent;
    String publicKey;
    String privateKey;
    String name;

    Map<String, Integer> orgnMap = null;

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
    }

    public LoginPanel(Main parent) {
        initComponents();
        this.parent = parent;
    }

    public void updateOrgnList() {
        orgnMap = DatabaseClient.getInstance().getOrgnMap();
        Vector orgnNameVector = new Vector();
        for (String name : orgnMap.keySet()) {
            orgnNameVector.add(name);
        }
        final DefaultComboBoxModel model = new DefaultComboBoxModel(orgnNameVector);
        jOrgnCombo.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserRead = new javax.swing.JFileChooser();
        jFileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jOrgnCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jReadSecretKey = new javax.swing.JTextField();
        btnReadSecretKeyBrowser = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jWriteSecretKey = new javax.swing.JTextField();
        btnWriteSecretKeyBrowser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("Name");

        jFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFullNameActionPerformed(evt);
            }
        });
        jFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFullNameFocusLost(evt);
            }
        });

        jLabel2.setText("Organization");

        jLabel3.setText("Read Secret Key");

        jReadSecretKey.setText("N/A");

        btnReadSecretKeyBrowser.setText("Browse");
        btnReadSecretKeyBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadSecretKeyBrowserActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("User Login");

        jLabel5.setText("Write Secret Key");

        jWriteSecretKey.setText("N/A");

        btnWriteSecretKeyBrowser.setText("Browse");
        btnWriteSecretKeyBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteSecretKeyBrowserActionPerformed(evt);
            }
        });

        jLabel6.setText("Note: Write N/A if you don't have key");

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
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jWriteSecretKey, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFullName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jOrgnCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                    .addComponent(jReadSecretKey, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReadSecretKeyBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWriteSecretKeyBrowser))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jOrgnCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jReadSecretKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadSecretKeyBrowser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWriteSecretKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWriteSecretKeyBrowser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(jButton5))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadSecretKeyBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadSecretKeyBrowserActionPerformed
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            jReadSecretKey.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnReadSecretKeyBrowserActionPerformed

    private void jFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFullNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String fullName = jFullName.getText();
        String orgnName = (String) jOrgnCombo.getSelectedItem();
        int orgnId = orgnMap.get(orgnName);
        String readSecretKeyPath = jReadSecretKey.getText();
        String writeSecretKeyPath = jWriteSecretKey.getText();

        if (fullName.isEmpty() || orgnName.isEmpty() || readSecretKeyPath.isEmpty() || writeSecretKeyPath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String readSecretKeyChecksum = CryptoUtil.getFileChecksum(readSecretKeyPath, "SHA1");
        String writeSecretKeyChecksum = CryptoUtil.getFileChecksum(writeSecretKeyPath, "SHA1");
        System.out.println(readSecretKeyChecksum + "," + writeSecretKeyChecksum);
        System.out.println("-------------------");
        boolean isValidUser = DatabaseClient.getInstance().validateUserLogin(fullName, orgnId, readSecretKeyChecksum, writeSecretKeyChecksum);
        if (isValidUser) {
            JOptionPane.showMessageDialog(null, "Login successful", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
            parent.nextPanel(Main.USER_HOME);
        } else {
            JOptionPane.showMessageDialog(null, "Check full name, organization, or secret key, and try again", "Login Failure", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        parent.nextPanel(Main.FIRST_SCREEN);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnWriteSecretKeyBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteSecretKeyBrowserActionPerformed
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            jWriteSecretKey.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnWriteSecretKeyBrowserActionPerformed

    private void jFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFullNameFocusLost

    }//GEN-LAST:event_jFullNameFocusLost

    private void jFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFullNameFocusGained
         if(orgnMap==null){
            updateOrgnList();
        }
    }//GEN-LAST:event_jFullNameFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReadSecretKeyBrowser;
    private javax.swing.JButton btnWriteSecretKeyBrowser;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JFileChooser jFileChooserRead;
    private javax.swing.JTextField jFullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jOrgnCombo;
    private javax.swing.JTextField jReadSecretKey;
    private javax.swing.JTextField jWriteSecretKey;
    // End of variables declaration//GEN-END:variables
}
