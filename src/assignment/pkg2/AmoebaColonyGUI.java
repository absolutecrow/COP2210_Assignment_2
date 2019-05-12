/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author AbsoluteCrow
 */
public class AmoebaColonyGUI extends javax.swing.JFrame
{
    
    private final AmoebaFunctions amoebaColony;

    /**
     * Creates new form AmoebaColonyGUI
     * @param passer
     */
    public AmoebaColonyGUI(AmoebaFunctions passer)
    {
        initComponents();
        this.amoebaColony = passer;
        
        colonyName.setText(amoebaColony.getColonyName());
        fedAmount.setText(String.valueOf(amoebaColony.getDaysFed()));
        caretakerName.setText(amoebaColony.getCaretakerName());
        startingSize.setText(String.valueOf(amoebaColony.getStartingSize()));
        attemptedBred.setText(String.valueOf(amoebaColony.getRequestedBreed()));
        numberOfDeath.setText(String.valueOf(amoebaColony.getNumberOfDeaths()));     
        successfulBred.setText(String.valueOf(amoebaColony.getSuccessfulBred()));
        finalSize.setText(String.valueOf(amoebaColony.getFinalColonySize()));
        totalSickness.setText(String.valueOf(amoebaColony.getSicknessCounter()));
       
    }

   

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        javax.swing.JTextField startingSize1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        colonyName = new javax.swing.JTextField();
        caretakerName = new javax.swing.JTextField();
        startingSize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        finalSize = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        attemptedBred = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        successfulBred = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numberOfDeath = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fedAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totalSickness = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jTextPane1);

        startingSize1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        colonyName.setEditable(false);
        colonyName.setText("jTextField1");
        colonyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colonyNameActionPerformed(evt);
            }
        });

        caretakerName.setEditable(false);
        caretakerName.setText("jTextField1");
        caretakerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caretakerNameActionPerformed(evt);
            }
        });

        startingSize.setEditable(false);
        startingSize.setText("jTextField1");

        jLabel1.setText("Colony");

        jLabel2.setText("Caretaker");

        jLabel3.setText("Starting Size");

        finalSize.setEditable(false);
        finalSize.setText("jTextField1");
        finalSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalSizeActionPerformed(evt);
            }
        });

        jLabel4.setText("Final Size");

        attemptedBred.setEditable(false);
        attemptedBred.setText("jTextField1");

        jLabel5.setText("Attempted to Breed");

        jLabel6.setText("Successful Bred");

        successfulBred.setEditable(false);
        successfulBred.setText("jTextField1");

        jLabel7.setText("Death");

        numberOfDeath.setEditable(false);
        numberOfDeath.setText("jTextField2");

        jLabel8.setText("Fed Amount");

        fedAmount.setEditable(false);
        fedAmount.setText("jTextField1");

        jLabel9.setText("The amount of times the colony got sick after breeding:");

        totalSickness.setEditable(false);
        totalSickness.setText("totalSickness");
        totalSickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSicknessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(colonyName, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(attemptedBred))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caretakerName, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(fedAmount)))
                            .addComponent(successfulBred, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(startingSize, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(finalSize)
                                    .addComponent(numberOfDeath)
                                    .addComponent(totalSickness, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colonyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caretakerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attemptedBred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfDeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(successfulBred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalSickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colonyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colonyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colonyNameActionPerformed

    private void caretakerNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_caretakerNameActionPerformed
    {//GEN-HEADEREND:event_caretakerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caretakerNameActionPerformed

    private void finalSizeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_finalSizeActionPerformed
    {//GEN-HEADEREND:event_finalSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalSizeActionPerformed

    private void totalSicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSicknessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSicknessActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
        });
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attemptedBred;
    private javax.swing.JTextField caretakerName;
    private javax.swing.JTextField colonyName;
    private javax.swing.JTextField fedAmount;
    private javax.swing.JTextField finalSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField numberOfDeath;
    private javax.swing.JTextField startingSize;
    private javax.swing.JTextField successfulBred;
    private javax.swing.JTextField totalSickness;
    // End of variables declaration//GEN-END:variables
}
