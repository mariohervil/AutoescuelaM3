/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlm3hernandez;

import java.awt.Color;

/**
 *
 * @author mariohervil
 */
public class FrameStats extends javax.swing.JFrame {
static double benS, benT, benE, benTotal;
    /**
     * Creates new form FrameStats
     */
    public FrameStats() {

        initComponents();
        this.getContentPane().setBackground(new Color(4, 23, 40, 255));
        this.setLocationRelativeTo(this);
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonBenefits = new javax.swing.JButton();
        jButtonApproved = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonBenefits.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButtonBenefits.setText("School's Benefits");
        jButtonBenefits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBenefitsActionPerformed(evt);
            }
        });

        jButtonApproved.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButtonApproved.setText("Approved %");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBenefits)
                            .addComponent(jButtonApproved)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100)
                        .addComponent(jButtonBenefits)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonApproved))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DataClass.gotoJF(this, DataClass.jFmain);
    }//GEN-LAST:event_jButton1ActionPerformed
private double showBenefits() {
       
        benS = 0;
        benT = 0;
        benE = 0;
        benTotal = 0;
        for (Student s : DataClass.ALstudent) {
                
            
            benS += s.getEnroll();
        }
        for (Teacher t : DataClass.ALteacher) {
                
            
            benT += t.getSalary();
        }
        for (Employee e : DataClass.ALemployee) {
                
            
            benE += e.getSalary();
        }
       
        
        benTotal = benS - (benE + benT);
        return benTotal;

    }
    private void jButtonBenefitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBenefitsActionPerformed

        
        jTextArea1.setText("===========\n BENEFIT\n===========\n" + "Student's Tuitions: " + benS + "\nEmployee's Salaries: " + benE + "\nTeacher's Salaries: " + benT + "\n" + showBenefits() + "€");
        
    }//GEN-LAST:event_jButtonBenefitsActionPerformed

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameStats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonApproved;
    private javax.swing.JButton jButtonBenefits;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}