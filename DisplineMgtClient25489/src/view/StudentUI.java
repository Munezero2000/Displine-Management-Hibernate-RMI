/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Status;
import model.Student;
import model.StudentLevel;
import service.LevelService;
import service.StudentService;

/**
 *
 * @author Munezero
 */
public class StudentUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentUI
     */
    public StudentUI() {
        if (Session.id == null) {
            this.dispose();
            return;
        }
        initComponents();
        fillClassCombo();
        fillStatusCombo();
        System.out.println(Session.fullNames);
    }
    
    private void fillClassCombo(){
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            LevelService service = (LevelService) registry.lookup("level");
            List<StudentLevel> classes = service.getAllLevel();
            for (StudentLevel level : classes) {
                classCombo.addItem(level);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void fillStatusCombo() {
        statusCombo.setModel(new DefaultComboBoxModel<>(Status.values()) );
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registerStaffButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        stIdBox = new javax.swing.JTextField();
        stSearchButton = new javax.swing.JButton();
        stNameBox = new javax.swing.JTextField();
        StudentUpdateBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();
        dobBox = new com.toedter.calendar.JDateChooser();
        classCombo = new javax.swing.JComboBox<>();
        HomeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(241, 253, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Class");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("DateofBirth");

        registerStaffButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        registerStaffButton.setForeground(new java.awt.Color(0, 102, 102));
        registerStaffButton.setText("Add Student");
        registerStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStaffButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        stSearchButton.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        stSearchButton.setForeground(new java.awt.Color(0, 102, 102));
        stSearchButton.setText("Search");
        stSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(stSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stIdBox)
                    .addComponent(stSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        StudentUpdateBtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        StudentUpdateBtn.setForeground(new java.awt.Color(0, 102, 102));
        StudentUpdateBtn.setText("Update");
        StudentUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentUpdateBtnActionPerformed(evt);
            }
        });

        deleteStudentBtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        deleteStudentBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteStudentBtn.setText("Delete");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Status");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registerStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StudentUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(62, 62, 62)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dobBox, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(classCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stNameBox)
                            .addComponent(statusCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dobBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registerStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StudentUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteStudentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void registerStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStaffButtonActionPerformed
        if (stNameBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name must have a certain value");
        } else if (dobBox.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select a valid Date of Birth");
        } else if (classCombo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a Student Class");
        } else {
            try {
                // Additional validations can be added if needed

                Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
                StudentService service = (StudentService) registry.lookup("student");

                // Creating a Student instance
                Student stud = new Student();

                // Validating and setting the Name
                String studentName = stNameBox.getText().trim(); // Trim to remove leading/trailing spaces
                if (studentName.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Name must not be empty");
                    return; // Exit the method if validation fails
                }
                stud.setStudentNames(studentName);

                // Validating and setting the Date of Birth
                Date dob = dobBox.getDate();
                if (dob == null) {
                    JOptionPane.showMessageDialog(this, "Please select a valid Date of Birth");
                    return; // Exit the method if validation fails
                }
                stud.setDateOfBirth(dob);

                // Validating and setting the Student Class
                StudentLevel studentClass = (StudentLevel) classCombo.getSelectedItem();
                if (studentClass == null) {
                    JOptionPane.showMessageDialog(this, "Please select a Student Class");
                    return; // Exit the method if validation fails
                }
                stud.setStudentClass(studentClass);
                stud.setStatus(Status.ACTIVE);
                stud.setMarks(40);

  
                Student st = service.AddStudent(stud);
                if (st != null) {
                    JOptionPane.showMessageDialog(this, "Student Added Successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Student not added");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_registerStaffButtonActionPerformed

    private void stSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stSearchButtonActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StudentService service = (StudentService) registry.lookup("student");
            Student staff = new Student(Integer.parseInt(stIdBox.getText()));
           Student st = service.searchStudent(staff);
            if (st != null) {
                stNameBox.setText(st.getStudentNames());
                classCombo.setSelectedItem(st);
                dobBox.setDate(st.getDateOfBirth());
                statusCombo.setSelectedItem(st.getStatus());
            } else {
                JOptionPane.showMessageDialog(this, "Staff not added");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_stSearchButtonActionPerformed

    private void StudentUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentUpdateBtnActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StudentService service = (StudentService) registry.lookup("student");
            Student stud = new Student();
            stud.setStudentId(Integer.parseInt(stIdBox.getText().trim()));
            stud.setStudentNames(stNameBox.getText());
            stud.setDateOfBirth(dobBox.getDate());
            stud.setStudentClass((StudentLevel)classCombo.getSelectedItem());
            stud.setStatus((Status)statusCombo.getSelectedItem());
            Student st = service.updateStudent(stud);
            if (st != null) {
                JOptionPane.showMessageDialog(this, "Student Updated Succefully");
            } else {
                JOptionPane.showMessageDialog(this, "Student not Updated");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_StudentUpdateBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StudentService service = (StudentService) registry.lookup("student");
            Student stud = new Student();
            stud.setStudentId(Integer.parseInt(stIdBox.getText().trim()));
            Student st = service.deleteStudent(stud);
            if (st != null) {
                JOptionPane.showMessageDialog(this, "Student Deleted Succefully");
            } else {
                JOptionPane.showMessageDialog(this, "Student not Deleted ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton StudentUpdateBtn;
    private javax.swing.JComboBox<StudentLevel> classCombo;
    private javax.swing.JButton deleteStudentBtn;
    private com.toedter.calendar.JDateChooser dobBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton registerStaffButton;
    private javax.swing.JTextField stIdBox;
    private javax.swing.JTextField stNameBox;
    private javax.swing.JButton stSearchButton;
    private javax.swing.JComboBox<Status> statusCombo;
    // End of variables declaration//GEN-END:variables
}
