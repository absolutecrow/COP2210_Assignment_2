/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author AbsoluteCrow
 */
public class AmoebaColonyPropertiesGUI extends javax.swing.JFrame
{    
    /**
     * Creates new form AmoebaColonyGUI
     */
    public AmoebaColonyPropertiesGUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        foodTextField = new javax.swing.JTextField();
        foodLabel = new javax.swing.JLabel();
        breedLabel = new javax.swing.JLabel();
        breedTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        colonyNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        caretakerTextField = new javax.swing.JTextField();
        startingSizeLabel = new javax.swing.JLabel();
        startingSizeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        simulateButton = new javax.swing.JButton();
        vitaminsCheckbox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amoeba Colony");
        setBackground(new java.awt.Color(250, 250, 250));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        foodTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                foodTextFieldActionPerformed(evt);
            }
        });

        foodLabel.setText("Amount of Food :");

        breedLabel.setText("How many times to Breed:");

        jLabel1.setText("Colony Name:");

        colonyNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                colonyNameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Caretaker Name:");

        startingSizeLabel.setText("Starting Size:");

        jLabel3.setText("Vitamins:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fill out the information about your Amoeba Colony below.");

        simulateButton.setText("Simulate");
        simulateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                simulateButtonActionPerformed(evt);
            }
        });

        vitaminsCheckbox.setActionCommand("vitaminCheckBox");
        vitaminsCheckbox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vitaminsCheckboxActionPerformed(evt);
            }
        });

        jLabel5.setText("You may test different values without closing the software to compare different results.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(foodLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startingSizeLabel)
                            .addComponent(breedLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(breedTextField)
                            .addComponent(startingSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caretakerTextField)
                    .addComponent(colonyNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(vitaminsCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simulateButton)
                .addGap(252, 252, 252))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodLabel)
                    .addComponent(jLabel1)
                    .addComponent(colonyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breedLabel)
                    .addComponent(breedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(caretakerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startingSizeLabel)
                        .addComponent(startingSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(vitaminsCheckbox))
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(simulateButton)
                .addGap(62, 62, 62))
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

    private void vitaminsCheckboxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vitaminsCheckboxActionPerformed
    {//GEN-HEADEREND:event_vitaminsCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vitaminsCheckboxActionPerformed

    private void simulateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_simulateButtonActionPerformed
    {//GEN-HEADEREND:event_simulateButtonActionPerformed
        AmoebaFunctions amoebaColony = new AmoebaFunctions();

        try
        {
            amoebaColony.setColonyName(colonyNameTextField.getText());
            amoebaColony.setCaretakerName(caretakerTextField.getText());
            amoebaColony.setStartingSize(Integer.parseInt(startingSizeTextField.getText())); //Error if field is not a number.
            amoebaColony.feed(Integer.parseInt(foodTextField.getText())); //Same
            amoebaColony.setVitamins(vitaminsCheckbox.isSelected());
            amoebaColony.breed(Integer.parseInt(breedTextField.getText())); //Same
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Size, Food and Breed amount all must be Integer values.");
            throw new RuntimeException(e);
        }


        new AmoebaColonyGUI(amoebaColony).setVisible(true);
    }//GEN-LAST:event_simulateButtonActionPerformed

    private void colonyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_colonyNameTextFieldActionPerformed
    {//GEN-HEADEREND:event_colonyNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colonyNameTextFieldActionPerformed

    private void foodTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_foodTextFieldActionPerformed
    {//GEN-HEADEREND:event_foodTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AmoebaColonyPropertiesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyPropertiesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyPropertiesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AmoebaColonyPropertiesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AmoebaColonyPropertiesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel breedLabel;
    private javax.swing.JTextField breedTextField;
    private javax.swing.JTextField caretakerTextField;
    private javax.swing.JTextField colonyNameTextField;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JTextField foodTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JButton simulateButton;
    private javax.swing.JLabel startingSizeLabel;
    private javax.swing.JTextField startingSizeTextField;
    private javax.swing.JCheckBox vitaminsCheckbox;
    // End of variables declaration//GEN-END:variables
}