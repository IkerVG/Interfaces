/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * segundaVentana.java
 *
 * Created on 08-nov-2011, 9:33:10
 */
package ventanas2;

import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class segundaVentana extends javax.swing.JDialog {
    /** Creates new form segundaVentana
     * @param parent
     * @param modal */
    public segundaVentana(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

         .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            segundaVentana dialog = new segundaVentana(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                    Ventana1 w1 = new Ventana1();
                    w1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                }
            });
            dialog.setVisible(true);
        });
    }
    // Variables declaration - do not modify
    // End of variables declaration
}
