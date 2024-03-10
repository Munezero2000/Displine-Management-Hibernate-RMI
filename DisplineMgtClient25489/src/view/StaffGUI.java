/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import  service.*;
import model.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author Munezero
 */
public class StaffGUI extends javax.swing.JFrame {

    /**
     * Creates new form StaffGUI
     */
    public StaffGUI() {
        if (Session.id == null) {
            this.dispose();
            return;
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordBox = new javax.swing.JTextField();
        registerStaffButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        idBox = new javax.swing.JTextField();
        StaffSearchButton = new javax.swing.JButton();
        nameBox = new javax.swing.JTextField();
        StaffUpdate = new javax.swing.JButton();
        deleteStaffBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(241, 253, 253));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Email");

        jLabel3.setText("Password");

        registerStaffButton.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        registerStaffButton.setForeground(new java.awt.Color(0, 102, 102));
        registerStaffButton.setText("Register");
        registerStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStaffButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(241, 253, 253));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        StaffSearchButton.setText("Search");
        StaffSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(StaffSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idBox)
                    .addComponent(StaffSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        StaffUpdate.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        StaffUpdate.setForeground(new java.awt.Color(0, 102, 102));
        StaffUpdate.setText("Update");
        StaffUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffUpdateActionPerformed(evt);
            }
        });

        deleteStaffBtn.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        deleteStaffBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteStaffBtn.setText("Delete");
        deleteStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaffBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Name");

        HomeBtn.setBackground(new java.awt.Color(0, 102, 102));
        HomeBtn.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Go Home");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(passwordBox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameBox)
                            .addComponent(emailBox))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(StaffUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(deleteStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registerStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StaffUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
    }
    
    private void registerStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStaffButtonActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StaffService service = (StaffService) registry.lookup("staff");
            Staff staff = new Staff();

            String fullNames = nameBox.getText().trim();
            if (fullNames.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Full Names must not be empty");
                return;
            }
            staff.setFullNames(fullNames);

            String email = emailBox.getText().trim();
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email must not be empty");
                return; 
            } else if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(this, "Please enter a valid Email address");
                return; 
            }
            staff.setEmail(email);

            String password = passwordBox.getText();
            if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password must not be empty");
                return; 
            } else if (password.length() < 8) {
                JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long");
                return; 
            }
            staff.setPassword(password);

            Staff st = service.AddStaff(staff);
            if (st != null) {
                JOptionPane.showMessageDialog(this, "Staff Added Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Staff not added");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_registerStaffButtonActionPerformed

    private void StaffSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffSearchButtonActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StaffService service = (StaffService) registry.lookup("staff");
            Staff staff = new Staff(Integer.parseInt(idBox.getText()));
            Staff st = service.searchStaff(staff);
            if (st != null) {
                nameBox.setText(st.getFullNames());
                emailBox.setText(st.getEmail());
                passwordBox.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Staff not added");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_StaffSearchButtonActionPerformed

    private void StaffUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffUpdateActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StaffService service = (StaffService) registry.lookup("staff");
            Staff staff = new Staff();
            staff.setId(Integer.parseInt(idBox.getText().trim()));
            staff.setFullNames(nameBox.getText().trim());
            staff.setEmail(emailBox.getText().trim());
            Staff st = service.updateStaff(staff);
            if (st != null) {
                JOptionPane.showMessageDialog(this, "Staff Updated Succefully");
            } else {
                JOptionPane.showMessageDialog(this, "Staff not Updated");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_StaffUpdateActionPerformed

    private void deleteStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaffBtnActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StaffService service = (StaffService) registry.lookup("staff");
            Staff staff = new Staff();
            staff.setId(Integer.parseInt(idBox.getText().trim()));
            staff.setFullNames(nameBox.getText().trim());
            staff.setEmail(emailBox.getText().trim());
            Staff st = service.deleteStaff(staff);
            if (st != null) {
                JOptionPane.showMessageDialog(this, "Staff Deleted Succefully");
            } else {
                JOptionPane.showMessageDialog(this, "Staff not ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteStaffBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        this.dispose();
        HomeUI form = new HomeUI();
        form.setVisible(true);
    }//GEN-LAST:event_HomeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton StaffSearchButton;
    private javax.swing.JButton StaffUpdate;
    private javax.swing.JButton deleteStaffBtn;
    private javax.swing.JTextField emailBox;
    private javax.swing.JTextField idBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField passwordBox;
    private javax.swing.JButton registerStaffButton;
    // End of variables declaration//GEN-END:variables
}
