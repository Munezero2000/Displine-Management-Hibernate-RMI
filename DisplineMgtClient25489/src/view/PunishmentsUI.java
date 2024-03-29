/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import service.FaulteService;
import service.PunishmentService;
import service.StudentService;

/**
 *
 * @author Munezero
 */
public class PunishmentsUI extends javax.swing.JFrame {
    DefaultTableModel punishmentModel = new DefaultTableModel();
    /**
     * Creates new form PunishmentsUI
     */
    public PunishmentsUI() {
        if (Session.id == null) {
            this.dispose();
            return;
        }
        initComponents();
        fillClassCombo();
        addColumnsPunishment();
        addRowsPunishment();
    }
    private Student getStudent() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StudentService service = (StudentService) registry.lookup("student");
            Student staff = new Student(Integer.parseInt(punishIdBox.getText()));
            Student st = service.searchStudent(staff);
            if (st != null) {
                return st;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PermissionsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PunishStudentBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        punishIdBox = new javax.swing.JTextField();
        StudSearchButton = new javax.swing.JButton();
        studNameBox = new javax.swing.JTextField();
        studLevelBox = new javax.swing.JTextField();
        DaysBox = new javax.swing.JFormattedTextField();
        sanctionCombo = new javax.swing.JComboBox<>();
        ExpellBtn = new javax.swing.JButton();
        HomeBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(241, 253, 253));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        PermissionsTable.setBackground(new java.awt.Color(241, 253, 253));
        PermissionsTable.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        PermissionsTable.setForeground(new java.awt.Color(0, 102, 102));
        PermissionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(PermissionsTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(241, 253, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Reasons");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Days Punished");

        PunishStudentBtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        PunishStudentBtn.setForeground(new java.awt.Color(0, 102, 102));
        PunishStudentBtn.setText("Punish");
        PunishStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunishStudentBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        StudSearchButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        StudSearchButton.setForeground(new java.awt.Color(0, 102, 102));
        StudSearchButton.setText("Search");
        StudSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studLevelBox)
                    .addComponent(studNameBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(StudSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(punishIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StudSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(punishIdBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studLevelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DaysBox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        ExpellBtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        ExpellBtn.setForeground(new java.awt.Color(0, 102, 102));
        ExpellBtn.setText("Print Expell");
        ExpellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpellBtnActionPerformed(evt);
            }
        });

        HomeBtn1.setBackground(new java.awt.Color(0, 102, 102));
        HomeBtn1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        HomeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn1.setText("Go Home");
        HomeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sanctionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DaysBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PunishStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ExpellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sanctionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DaysBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PunishStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(HomeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void fillClassCombo() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
          FaulteService service =(FaulteService) registry.lookup("sanction");
            List<Faulte> faultes = service.getAllFaulte();
            for (Faulte faulte : faultes) {
                sanctionCombo.addItem(faulte);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void updateStudent(Faulte faulte) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            StudentService service = (StudentService) registry.lookup("student");
            Student stud = getStudent();
            Integer newMarks = stud.getMarks() - faulte.getFaulteId();
            stud.setMarks(newMarks);
            stud.setStatus(faulte.getResult());
            Student updatedStudent = service.updateStudent(stud);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

 
    private void PunishStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunishStudentBtnActionPerformed
        try {
            Student student = getStudent();
            if(student.getStatus() == Status.EXPELLED){
                JOptionPane.showMessageDialog(this, "Student has been AlreadyExpelled");
                return;
            }
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            PunishmentService service = (PunishmentService) registry.lookup("punish");
            
            Punishment punish = new Punishment();
            punish.setStudent(student);
            punish.setReason((Faulte)sanctionCombo.getSelectedItem());
            punish.setDaysofPunishment(Integer.parseInt(DaysBox.getText()));
            punish.setDateDone(new Date());
            
            Punishment st = service.AddPunishment(punish);
            if (st != null) {
                updateStudent(st.getReason());
                generatePDF(student, punish);
                JOptionPane.showMessageDialog(this, "Student punished Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Student not Permitted");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PunishStudentBtnActionPerformed

    private void StudSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudSearchButtonActionPerformed
        Student student = getStudent();
        if(student != null){
            studNameBox.setText(student.getStudentNames());
            studLevelBox.setText(student.getStatus().toString());
        }
    }//GEN-LAST:event_StudSearchButtonActionPerformed

    private void ExpellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpellBtnActionPerformed
    
    }private void generatePDF(Student student, Punishment punish) {
        try {
            // Create a PDF document
            Document document = new Document();

            // Get the current date and time for the filename
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String timestamp = dateFormat.format(new Date());

            // Customize the filename with date and time
            String pdfFileName = "Permit_" + timestamp + "_" + student.getStudentId() + ".pdf";

            // Set the path where you want to save the PDF
            String pdfFilePath = "C:\\Users\\Munezero\\Documents\\StudentsDocuments\\" + pdfFileName;  // Update the path

            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
            document.open();

            // Add content to the PDF
            document.add(new Paragraph("Indatwa n'Inkesha School (GSOB)"));
            document.add(new Paragraph("Phone: +2507888123123"));
            document.add(new Paragraph("Email: indatwa@gmail.com"));
            document.add(new Paragraph("P.O Box: 789 Kigali"));

            // Add empty lines for spacing
            document.add(new Paragraph("\n\n"));

            // Center-align the permit details
            Paragraph permitDetails = new Paragraph("Permit Details for Student: " + student.getStudentNames());
            // Line for signature
            permitDetails.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(permitDetails);
            document.add(new Paragraph("___________________________________________________________________\n"));
            document.add(new Paragraph("Permit Days: " + punish.getDaysofPunishment()));
            document.add(new Paragraph("Permit Reason: " + punish.getReason().getDescription()));

            document.add(new Paragraph("\n"));  // Add empty line for spacing

            // Signature section
            document.add(new Paragraph("_________________________"));
            document.add(new Paragraph("Stamp and Signature"));
            document.add(new Paragraph("Discipline In Charge: " + punish.getInCharge().getFullNames()));
            // Close the document
            document.close();

            JOptionPane.showMessageDialog(this, "Permission has been generated: " + pdfFileName + "\n You can now print!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
           
    }//GEN-LAST:event_ExpellBtnActionPerformed

    private void HomeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtn1ActionPerformed
        this.dispose();
        HomeUI form = new HomeUI();
        form.setVisible(true);
    }//GEN-LAST:event_HomeBtn1ActionPerformed
    public void addColumnsPunishment() {
        punishmentModel = new DefaultTableModel();
        punishmentModel.addColumn("ID");
        punishmentModel.addColumn("NAMES");
        punishmentModel.addColumn("CLASS");
        punishmentModel.addColumn("PERMITED ON");
        punishmentModel.addColumn("DAYS OF PUNISHMENT");
        PermissionsTable.setModel(punishmentModel);
    }

    public void addRowsPunishment() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            PunishmentService service = (PunishmentService) registry.lookup("punish");
            List<Punishment> punishmentList = service.getAllPunishment();
            for (Punishment perm : punishmentList) {
                System.out.println(perm.getStudent().getStudentNames());
                punishmentModel.addRow(new Object[]{perm.getStudent().getStudentId(), perm.getStudent().getStudentNames(), perm.getStudent().getStudentClass().getLevelName(), perm.getDateDone(), perm.getDaysofPunishment()});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
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
            java.util.logging.Logger.getLogger(PunishmentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PunishmentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PunishmentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PunishmentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PunishmentsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DaysBox;
    private javax.swing.JButton ExpellBtn;
    private javax.swing.JButton HomeBtn1;
    private javax.swing.JTable PermissionsTable;
    private javax.swing.JButton PunishStudentBtn;
    private javax.swing.JButton StudSearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField punishIdBox;
    private javax.swing.JComboBox<Faulte> sanctionCombo;
    private javax.swing.JTextField studLevelBox;
    private javax.swing.JTextField studNameBox;
    // End of variables declaration//GEN-END:variables
}
