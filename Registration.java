/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melodina
 */
public class Registration extends javax.swing.JFrame {

    public static Database db = new Database();
    public static String firstName, middleName, lastName, address, placeOfBirth, dateOfBirth, gender, nationality, phoneNumber, username;
    public static String regTblRowFirstName, regTblRowMiddleName, regTblRowLastName, regTblRowAddress, regTblRowPlaceOfBirth, regTblRowDateOfBirth, regTblRowGender, regTblRowNationality, regTblRowPhoneNumber, regTblRowUsername;
    public static int regId = 1001, regTblRowID;
    public static Update upd;

    public Registration() {
        initComponents();
        tableData();
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
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReg = new javax.swing.JTable();
        txtFieldLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldAddress = new javax.swing.JTextField();
        txtFieldPhoneNumber = new javax.swing.JTextField();
        txtFieldDateOfBirth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldPlaceOfBirth = new javax.swing.JTextField();
        txtFieldFirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFieldMiddleName = new javax.swing.JTextField();
        txtFieldNationality = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFieldGender = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFieldUsername = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Basic Registration in Java");

        addBtn.setBackground(new java.awt.Color(51, 51, 255));
        addBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        tblReg.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReg);

        txtFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldLastNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Last Name");

        jLabel6.setText("Address");

        txtFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAddressActionPerformed(evt);
            }
        });

        txtFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPhoneNumberActionPerformed(evt);
            }
        });

        txtFieldDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDateOfBirthActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number");

        jLabel8.setText("Date of Birth");

        jLabel9.setText("Nationality");

        jLabel4.setText("First Name");

        txtFieldPlaceOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPlaceOfBirthActionPerformed(evt);
            }
        });

        txtFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFirstNameActionPerformed(evt);
            }
        });

        jLabel10.setText("Place of Birth");

        txtFieldMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldMiddleNameActionPerformed(evt);
            }
        });

        txtFieldNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNationalityActionPerformed(evt);
            }
        });

        jLabel11.setText("Middle Name");

        txtFieldGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldGenderActionPerformed(evt);
            }
        });

        jLabel12.setText("Gender");

        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });

        jLabel13.setText("Username");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Mark Mallari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtFieldPlaceOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtFieldDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(txtFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(16, 16, 16)))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(402, 402, 402))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldPlaceOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(txtFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        firstName = txtFieldFirstName.getText();
        middleName = txtFieldMiddleName.getText();
        lastName = txtFieldLastName.getText();
        address = txtFieldAddress.getText();
        placeOfBirth = txtFieldPlaceOfBirth.getText();
        dateOfBirth = txtFieldDateOfBirth.getText();
        gender = txtFieldGender.getText();
        nationality = txtFieldNationality.getText();
        phoneNumber = txtFieldPhoneNumber.getText();
        username = txtFieldUsername.getText();

        if (txtFieldFirstName.getText().isEmpty() || txtFieldLastName.getText().isEmpty()
                || txtFieldAddress.getText().isEmpty() || txtFieldPlaceOfBirth.getText().isEmpty()
                || txtFieldDateOfBirth.getText().isEmpty() || txtFieldGender.getText().isEmpty()
                || txtFieldNationality.getText().isEmpty() || txtFieldPhoneNumber.getText().isEmpty()
                || txtFieldUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You must fill all fields!", "Required", JOptionPane.ERROR_MESSAGE);

            return;
        }
        String[] regDatas = {firstName, middleName, lastName, address, placeOfBirth, dateOfBirth, gender, nationality, phoneNumber, username};

        db.hm.put(regId, regDatas);
        regId++;
        txtFieldFirstName.setText(null);
        txtFieldMiddleName.setText(null);
        txtFieldLastName.setText(null);
        txtFieldAddress.setText(null);
        txtFieldPlaceOfBirth.setText(null);
        txtFieldDateOfBirth.setText(null);
        txtFieldGender.setText(null);
        txtFieldNationality.setText(null);
        txtFieldPhoneNumber.setText(null);
        txtFieldUsername.setText(null);

        JOptionPane.showMessageDialog(this, "ADDED SUCCESSFULLY!");
        tableData();

    }//GEN-LAST:event_addBtnActionPerformed

    private void txtFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldLastNameActionPerformed

    private void txtFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAddressActionPerformed

    private void txtFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPhoneNumberActionPerformed

    private void txtFieldDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDateOfBirthActionPerformed

    private void txtFieldPlaceOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPlaceOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPlaceOfBirthActionPerformed

    private void txtFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFirstNameActionPerformed

    private void txtFieldMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMiddleNameActionPerformed

    private void txtFieldNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNationalityActionPerformed

    private void txtFieldGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldGenderActionPerformed

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsernameActionPerformed
    private void tableData() {
        String[] colums = {"ID", "First Name", "Middle Name", "Last Name", "Address", "Place of Birth", "Date of Birth", "Gender", "Nationality", "Phone Number", "Username"};

        DefaultTableModel model = new DefaultTableModel(colums, 0);

        for (Integer tblId : db.hm.keySet()) {
            String[] regDatas = db.hm.get(tblId);

            if (regDatas != null) {
                model.addRow(new Object[]{
                    tblId,
                    regDatas[0],
                    regDatas[1],
                    regDatas[2],
                    regDatas[3],
                    regDatas[4],
                    regDatas[5],
                    regDatas[6],
                    regDatas[7],
                    regDatas[8],
                    regDatas[9]

                });
            }
        }

        tblReg.setModel(model);

        tblReg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tblReg.getSelectedRow();

                if (row != -1) {
                    regTblRowID = (Integer) tblReg.getValueAt(row, 0);
                    regTblRowFirstName = (String) tblReg.getValueAt(row, 1);
                    regTblRowMiddleName = (String) tblReg.getValueAt(row, 2);
                    regTblRowLastName = (String) tblReg.getValueAt(row, 3);
                    regTblRowAddress = (String) tblReg.getValueAt(row, 4);
                    regTblRowPlaceOfBirth = (String) tblReg.getValueAt(row, 5);
                    regTblRowDateOfBirth = (String) tblReg.getValueAt(row, 6);
                    regTblRowGender = (String) tblReg.getValueAt(row, 7);
                    regTblRowNationality = (String) tblReg.getValueAt(row, 8);
                    regTblRowPhoneNumber = (String) tblReg.getValueAt(row, 9);
                    regTblRowUsername = (String) tblReg.getValueAt(row, 10);

                    if (upd == null || !upd.isVisible()) {
                        upd = new Update(regTblRowID, regTblRowFirstName, regTblRowMiddleName,
                                regTblRowLastName, regTblRowAddress, regTblRowPlaceOfBirth, regTblRowDateOfBirth,
                                regTblRowGender, regTblRowNationality, regTblRowPhoneNumber, regTblRowUsername);
                        upd.setVisible(true);
                        disposeForm();
                    }
                }
            }
        });
    }

    private void disposeForm() {
        this.dispose();
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReg;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldDateOfBirth;
    private javax.swing.JTextField txtFieldFirstName;
    private javax.swing.JTextField txtFieldGender;
    private javax.swing.JTextField txtFieldLastName;
    private javax.swing.JTextField txtFieldMiddleName;
    private javax.swing.JTextField txtFieldNationality;
    private javax.swing.JTextField txtFieldPhoneNumber;
    private javax.swing.JTextField txtFieldPlaceOfBirth;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
