/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlm3hernandez;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mariohervil
 */
public class FrameEmployee extends javax.swing.JFrame {

    JobEnum jobEnum;

    /**
     * Creates new form FrameEmployee
     */
    public FrameEmployee() {
        initComponents();
        this.getContentPane().setBackground(new Color(65, 105, 225));
        this.setLocationRelativeTo(this);
        curDateTime();
    }

    public final void curDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateTime.setText(dtf.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textName = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        labelSurname = new javax.swing.JLabel();
        textSurname = new javax.swing.JTextField();
        labelDni = new javax.swing.JLabel();
        textDni = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelSalary = new javax.swing.JLabel();
        textSalary = new javax.swing.JTextField();
        labelPosition = new javax.swing.JLabel();
        comboPosition = new javax.swing.JComboBox<>();
        buttonCreate = new javax.swing.JButton();
        buttonGoBack = new javax.swing.JButton();
        labelEmployee = new javax.swing.JLabel();
        textDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        dateTime = new javax.swing.JLabel();
        buttonShow = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textShow = new javax.swing.JTextArea();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        labelName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        labelName.setText("Name");

        labelSurname.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        labelSurname.setText("Surname");

        textSurname.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        labelDni.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        labelDni.setText("DNI");

        textDni.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        labelEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        labelEmail.setText("Email");

        textEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        labelSalary.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        labelSalary.setText("Salary");

        textSalary.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        labelPosition.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        labelPosition.setText("Position");

        comboPosition.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{jobEnum.ADMINISTRATIVO.toString(),jobEnum.CONTABILIDAD.toString(),jobEnum.LIMPIEZA.toString(),jobEnum.MANTENIMIENTO.toString(),jobEnum.MARKETING.toString(),jobEnum.RECEPCIONISTA.toString()}));
        comboPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPositionActionPerformed(evt);
            }
        });

        buttonCreate.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        buttonCreate.setText("Create");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        buttonGoBack.setText("Back");
        buttonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoBackActionPerformed(evt);
            }
        });

        labelEmployee.setFont(new java.awt.Font("NSimSun", 0, 36)); // NOI18N
        labelEmployee.setText("Employee");

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Date");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        dateTime.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        dateTime.setText("jLabel2");

        buttonShow.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        buttonShow.setText("Show employees");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });

        textShow.setColumns(20);
        textShow.setRows(5);
        jScrollPane2.setViewportView(textShow);

        buttonDelete.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonGoBack)
                .addGap(334, 334, 334)
                .addComponent(labelEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateTime)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSurname)
                    .addComponent(labelDni)
                    .addComponent(labelName)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textSurname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textName)
                    .addComponent(textDni, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(textDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(labelSalary)
                            .addGap(62, 62, 62))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelEmail)
                            .addGap(68, 68, 68)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPosition)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textEmail)
                        .addComponent(textSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(buttonCreate)
                .addGap(36, 36, 36)
                .addComponent(buttonDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonShow)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonGoBack)
                    .addComponent(labelEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSurname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDni)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSalary))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPosition)
                            .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreate)
                    .addComponent(buttonShow)
                    .addComponent(buttonDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPositionActionPerformed

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        Employee emp = new Employee();
        emp.setName(textName.getText());
        emp.setSurname(textSurname.getText());
        emp.setSalary(Float.parseFloat(textSalary.getText()));
        emp.setDni(textDni.getText());
        emp.setEmail(textEmail.getText());
        emp.setPuesto(comboPosition.getSelectedItem().toString());
        emp.setDateAlta(textDate.getText());
        jTextArea1.setText(emp.toString());
        
        if (DataClass.validateEMDni(emp) == true) {
            DataClass.ALemployee.add(emp);
            
        } else if(DataClass.validateEMDni(emp) == false) {
          
            JOptionPane.showMessageDialog(rootPane, "That DNI already exists.", "EMPLOYEE DNI DUPLICATION", HEIGHT);
            textDni.setText("");
           
        }
        
        
        for (Employee e : DataClass.ALemployee) {
            
        }


    }//GEN-LAST:event_buttonCreateActionPerformed


    private void buttonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBackActionPerformed
        DataClass.gotoJF(this, DataClass.jFmain);

    }//GEN-LAST:event_buttonGoBackActionPerformed

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        for (Employee e : DataClass.ALemployee) {
            textShow.setText("There's " + DataClass.ALemployee.size() + " employees \n\n" + e.toString());
        }
    }//GEN-LAST:event_buttonShowActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int yesorno = JOptionPane.showConfirmDialog(null, "Delete Employee?", "Delete Employee", JOptionPane.YES_NO_OPTION);
        if (yesorno == 0) {
            DataClass.ALemployee.remove(search(textDni.getText()));
        } else {

        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    public static Employee search(String dni) {
        Employee resultado = null;
        for (Employee employee : DataClass.ALemployee) {
            if (employee.getDni().equals(dni)) {

                resultado = employee;
                break;
            }
        }
        return resultado;
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
            java.util.logging.Logger.getLogger(FrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonGoBack;
    private javax.swing.JButton buttonShow;
    private javax.swing.JComboBox<String> comboPosition;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmployee;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPosition;
    private javax.swing.JLabel labelSalary;
    private javax.swing.JLabel labelSurname;
    private javax.swing.JTextField textDate;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textSalary;
    private javax.swing.JTextArea textShow;
    private javax.swing.JTextField textSurname;
    // End of variables declaration//GEN-END:variables
}
