/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * segundaVentana.java
 *
 * Created on 08-nov-2011, 8:40:24
 */
package ventanas;
/**
 *
 * @author root
 */
public class segundaVentana extends javax.swing.JFrame {
    static javax.swing.JFrame padre;
    /** Creates new form segundaVentana */
    public segundaVentana(javax.swing.JFrame padre) {
        segundaVentana.padre=padre;
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new segundaVentana(padre).setVisible(true);
            }
        });
    }
    protected void processWindowEvent(java.awt.event.WindowEvent e) {

        super.processWindowEvent(e);
        if (e.getID() == java.awt.event.WindowEvent.WINDOW_CLOSING) {
            padre.setEnabled(true);
        }
     }
    // Variables declaration - do not modify
    // End of variables declaration
}