/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package distributoredibevande.gui;

import distributoredibevande.logic.EventManager;

/**
 *
 * @author loren
 */
public class SceltaDistributorePanel extends javax.swing.JPanel {

    /**
     * Creates new form SceltaDistributorePanel
     */
    public SceltaDistributorePanel() {
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
        SceltaDistributoreBevandeCalde = new javax.swing.JButton();
        SceltaDistributoreBevandeCalde1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        SceltaDistributoreBevandeCalde.setBackground(new java.awt.Color(204, 204, 204));
        SceltaDistributoreBevandeCalde.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        SceltaDistributoreBevandeCalde.setForeground(new java.awt.Color(0, 0, 0));
        SceltaDistributoreBevandeCalde.setText("DISTRIBUTORE BEVANDE CALDE");
        SceltaDistributoreBevandeCalde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SceltaDistributoreBevandeCaldeActionPerformed(evt);
            }
        });

        SceltaDistributoreBevandeCalde1.setBackground(new java.awt.Color(204, 204, 204));
        SceltaDistributoreBevandeCalde1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        SceltaDistributoreBevandeCalde1.setForeground(new java.awt.Color(0, 0, 0));
        SceltaDistributoreBevandeCalde1.setText("DISTRIBUTORE BEVANDE FREDDE");
        SceltaDistributoreBevandeCalde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SceltaDistributoreBevandeCalde1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SceltaDistributoreBevandeCalde)
                    .addComponent(SceltaDistributoreBevandeCalde1))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(SceltaDistributoreBevandeCalde, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(SceltaDistributoreBevandeCalde1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SceltaDistributoreBevandeCaldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SceltaDistributoreBevandeCaldeActionPerformed
        EventManager.getInstance().changePanel(ChoicePanels.OPTIONS_HOT_PANEL);
    }//GEN-LAST:event_SceltaDistributoreBevandeCaldeActionPerformed

    private void SceltaDistributoreBevandeCalde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SceltaDistributoreBevandeCalde1ActionPerformed
        EventManager.getInstance().changePanel(ChoicePanels.OPTIONS_COLD_PANEL);
    }//GEN-LAST:event_SceltaDistributoreBevandeCalde1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SceltaDistributoreBevandeCalde;
    private javax.swing.JButton SceltaDistributoreBevandeCalde1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
