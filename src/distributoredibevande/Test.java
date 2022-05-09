/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distributoredibevande;

import distributoredibevande.Enum.Bcalde;
import distributoredibevande.Enum.Bfredde;
import distributoredibevande.gui.MainFrame;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Test {

    public final static void init() {
        Distributore.getInstance().load(
                new BevandaCalda(Bcalde.CAFFE, 0.40d, 1, 5),
                new BevandaCalda(Bcalde.LATTE, 0.60d, 2, 5),
                new BevandaCalda(Bcalde.CAPPUCCINO, 1.0d, 3, 5),
                new BevandaCalda(Bcalde.CIOCCOLATA, 1.0d, 4, 5),
                new BevandaFredda(Bfredde.ACQUA, 0.50d, 1, 5),
                new BevandaFredda(Bfredde.COLA, 2.50d, 2, 5),
                new BevandaFredda(Bfredde.ARANCIATA, 2.50d, 3, 5),
                new BevandaFredda(Bfredde.GAZZOSA, 2.0d, 4, 5));
    }

    public static void main(String[] args) {
        init();
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

}
