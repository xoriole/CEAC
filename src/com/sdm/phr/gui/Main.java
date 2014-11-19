/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdm.phr.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel cardPanel, jp1, jp2, buttonPanel;
    private JLabel jl1, jl2;
    private JButton btn1, btn2;

    private CardLayout cardLayout = new CardLayout();

    public Main() {
        setTitle("Patient Health Record System");
        setSize(800, 500);
        JDialog.setDefaultLookAndFeelDecorated(true);

        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);

        FirstScreen firstScreen = new FirstScreen(this);
        PatientRegister patientRegisterPanel = new PatientRegister(this);
        PatientLoginPanel patientLoginPanel = new PatientLoginPanel(this);
        AddUser addUserPanel = new AddUser(this);
        LoginPanel loginPanel = new LoginPanel(this);
        HomePanel homePanel = new HomePanel(this);
        PatientHome patientHomePanel = new PatientHome(this);

        cardPanel.add(firstScreen, Main.FIRST_SCREEN);
        cardPanel.add(patientRegisterPanel, Main.PATIENT_REGISTER);
        cardPanel.add(patientLoginPanel, Main.PATIENT_LOGIN);
        cardPanel.add(addUserPanel, Main.USER_ADDD);
        cardPanel.add(loginPanel, Main.USER_LOGIN);
        cardPanel.add(homePanel, Main.USER_HOME);
        cardPanel.add(patientHomePanel, Main.PATIENT_HOME);

        add(cardPanel, BorderLayout.NORTH);
    }

    public void nextPanel(String panelName) {
        cardLayout.show(cardPanel, panelName);
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BrowseTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowseTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowseTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowseTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main frame = new Main();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    public static String FIRST_SCREEN = "firstScreenPanel";
    public static String PATIENT_REGISTER = "patientRegisterPanel";
    public static String PATIENT_LOGIN = "patientLoginPanel";
    public static String USER_ADDD = "userAddPanel";
    public static String USER_LOGIN = "userLoginPanel";
    public static String PATIENT_HOME = "patientHomePanel";
    public static String USER_HOME = "userHomePanel";
}
