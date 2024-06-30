package UserInterface.SysAdmin;

import java.awt.Color;
import ProjModel.SystemAdmin;

public class SysAdminJPanel extends javax.swing.JPanel {

    SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public SysAdminJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame3 = new javax.swing.JFrame();
        btnmanageFranchise = new javax.swing.JButton();
        enterpriseBtn = new javax.swing.JButton();
        btnmanagecustomers = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        btnmanagemanagers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        setLayout(null);

        btnmanageFranchise.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnmanageFranchise.setForeground(new java.awt.Color(20, 20, 64));
        btnmanageFranchise.setText("MANAGE FRANCHISE");
        btnmanageFranchise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageFranchiseActionPerformed(evt);
            }
        });
        add(btnmanageFranchise);
        btnmanageFranchise.setBounds(650, 160, 230, 117);

        enterpriseBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        enterpriseBtn.setForeground(new java.awt.Color(20, 20, 64));
        enterpriseBtn.setText("MANAGE SERVICES");
        enterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseBtnActionPerformed(evt);
            }
        });
        add(enterpriseBtn);
        enterpriseBtn.setBounds(650, 320, 230, 117);

        btnmanagecustomers.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnmanagecustomers.setForeground(new java.awt.Color(20, 20, 64));
        btnmanagecustomers.setText("MANAGE CUSTOMERS");
        btnmanagecustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagecustomersActionPerformed(evt);
            }
        });
        add(btnmanagecustomers);
        btnmanagecustomers.setBounds(650, 640, 230, 118);

        lblsysadmin.setBackground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");
        add(lblsysadmin);
        lblsysadmin.setBounds(520, 90, 475, 44);

        btnmanagemanagers.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnmanagemanagers.setForeground(new java.awt.Color(20, 20, 64));
        btnmanagemanagers.setText("MANAGE MANAGERS");
        btnmanagemanagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagemanagersActionPerformed(evt);
            }
        });
        add(btnmanagemanagers);
        btnmanagemanagers.setBounds(650, 480, 230, 110);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SysAdmin/392561-blurred-gradient-748x421.jpg"))); // NOI18N
        jLabel1.setText("jlabel2");
        add(jLabel1);
        jLabel1.setBounds(0, -20, 1700, 1130);
        add(jPanel1);
        jPanel1.setBounds(1170, 380, 10, 10);
        add(jPanel2);
        jPanel2.setBounds(1130, 350, 10, 10);
        add(jPanel3);
        jPanel3.setBounds(1110, 380, 320, 300);

        jInternalFrame1.setVisible(true);
        add(jInternalFrame1);
        jInternalFrame1.setBounds(1140, 330, 190, 36);

        jScrollPane1.setViewportView(jEditorPane1);

        add(jScrollPane1);
        jScrollPane1.setBounds(1170, 400, 115, 260);
        add(jLayeredPane1);
        jLayeredPane1.setBounds(1089, 310, 230, 280);
        add(jPanel4);
        jPanel4.setBounds(1170, 140, 10, 10);
        add(jPanel5);
        jPanel5.setBounds(1150, 220, 10, 10);
        add(jPanel6);
        jPanel6.setBounds(1160, 440, 180, 200);

        jScrollPane2.setViewportView(jEditorPane2);

        add(jScrollPane2);
        jScrollPane2.setBounds(1170, 380, 115, 110);
        add(jPanel7);
        jPanel7.setBounds(1020, 80, 70, 30);
        add(jPanel8);
        jPanel8.setBounds(1070, 180, 120, 80);
        add(jPanel9);
        jPanel9.setBounds(1080, 160, 180, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanagecustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagecustomersActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnmanagecustomersActionPerformed

    private void btnmanagemanagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagemanagersActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnmanagemanagersActionPerformed

    private void btnmanageFranchiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageFranchiseActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnmanageFranchiseActionPerformed

    private void enterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_enterpriseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanageFranchise;
    private javax.swing.JButton btnmanagecustomers;
    private javax.swing.JButton btnmanagemanagers;
    private javax.swing.JButton enterpriseBtn;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
