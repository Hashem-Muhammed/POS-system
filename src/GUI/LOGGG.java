/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import pos.Cashier;
import pos.Manager;
import pos.SCM;
import pos.log;

/**
 *
 * @author hesha_000
 */
public class LOGGG extends javax.swing.JFrame {

    /**
     * Creates new form LOGGG
     */
    public LOGGG() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(200, 500));
        setMinimumSize(new java.awt.Dimension(415, 465));
        setResizable(false);
        setSize(new java.awt.Dimension(200, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("System Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 121, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 220, 59, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 170, 59, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 170, 180, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(120, 220, 180, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 363, 90, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 363, 80, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -30, 460, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("sadasd");
        if ((!jTextField1.getText().equals("") && !jPasswordField1.getText().equals(""))) {
                    log c = new Manager();
                    if (c.login(jTextField1.getText(), jPasswordField1.getText())) {
                        try {
                            Stage s = new Stage();
                            new manager().start(s);

                        } catch (Exception ex) {
                            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);

                        }
                    } else {
                        log c2 = new Cashier();
                        if (c2.login(jTextField1.getText(), jPasswordField1.getText())) {
                            try {
                                Stage s2 = new Stage(); // hena ba2olo ye3ml stage gdeda 34an yefta7li fiha el casheir
                                new Cashierframe().start(s2);
                            } catch (Exception ex) {
                                Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);

                            }
                        } else {
                            log c3 = new SCM();
                            if (c3.login(jTextField1.getText(), jPasswordField1.getText())) {
                                try {
                                    Stage s3 = new Stage(); // hena ba2olo ye3ml stage gdeda 34an yefta7li fiha el manager
                                  
                                    new scm().start(s3);
                                } catch (Exception ex) {
                                    Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);

                                }

                            } else {
                            JOptionPane.showMessageDialog(null, "Invaild Username Or Password !");   //invaild 
                            }
                        }
                    }
                } else {
                  JOptionPane.showMessageDialog(null, "Enter Username And Password !");  //enter username and pas
                }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
