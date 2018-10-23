/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.de.ordenadores;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Ventas_de_ordenadores extends javax.swing.JFrame {

    /**
     * Creates new form Ventas_de_ordenadores
     */
    public Ventas_de_ordenadores() {
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

        buttonGroupProc = new javax.swing.ButtonGroup();
        buttonGroupMem = new javax.swing.ButtonGroup();
        buttonGroupMon = new javax.swing.ButtonGroup();
        buttonGroupDD = new javax.swing.ButtonGroup();
        jLabelNomClient = new javax.swing.JLabel();
        jTextFieldNomClient = new javax.swing.JTextField();
        jLabelLoc = new javax.swing.JLabel();
        jComboBoxLoc = new javax.swing.JComboBox();
        jLabelListClient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabelMem = new javax.swing.JLabel();
        jLabelMon = new javax.swing.JLabel();
        jLabelDD = new javax.swing.JLabel();
        jLabelOpt = new javax.swing.JLabel();
        jRadioButtonProc1 = new javax.swing.JRadioButton();
        jRadioButtonProc2 = new javax.swing.JRadioButton();
        jRadioButtonProc3 = new javax.swing.JRadioButton();
        jRadioButtonProc4 = new javax.swing.JRadioButton();
        jRadioButtonMem1 = new javax.swing.JRadioButton();
        jRadioButtonMem = new javax.swing.JRadioButton();
        jRadioButtonMem3 = new javax.swing.JRadioButton();
        jRadioButtonMem4 = new javax.swing.JRadioButton();
        jRadioButtonMon1 = new javax.swing.JRadioButton();
        jRadioButtonMon2 = new javax.swing.JRadioButton();
        jRadioButtonMon3 = new javax.swing.JRadioButton();
        jRadioButtonMon4 = new javax.swing.JRadioButton();
        jRadioButtonDD1 = new javax.swing.JRadioButton();
        jRadioButtonDD2 = new javax.swing.JRadioButton();
        jRadioButtonDD3 = new javax.swing.JRadioButton();
        jRadioButtonDD4 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButtonAnyadir = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas de ordenadores");
        setResizable(false);

        jLabelNomClient.setText("Nombre de cliente");

        jLabelLoc.setText("Localidad");

        jComboBoxLoc.setEditable(true);
        jComboBoxLoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Villalba", "Alpedrete", "Galapagar", "Moralzarzal" }));

        jLabelListClient.setText("Lista de Clientes");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Procesador");

        jLabelMem.setText("Memoria");

        jLabelMon.setText("Monitor");

        jLabelDD.setText("Disco Duro");

        jLabelOpt.setText("Opciones");

        buttonGroupProc.add(jRadioButtonProc1);
        jRadioButtonProc1.setText("1");

        buttonGroupProc.add(jRadioButtonProc2);
        jRadioButtonProc2.setText("2");

        buttonGroupProc.add(jRadioButtonProc3);
        jRadioButtonProc3.setText("3");

        buttonGroupProc.add(jRadioButtonProc4);
        jRadioButtonProc4.setText("4");

        buttonGroupMem.add(jRadioButtonMem1);
        jRadioButtonMem1.setText("1");

        buttonGroupMem.add(jRadioButtonMem);
        jRadioButtonMem.setText("2");

        buttonGroupMem.add(jRadioButtonMem3);
        jRadioButtonMem3.setText("3");

        buttonGroupMem.add(jRadioButtonMem4);
        jRadioButtonMem4.setText("4");

        buttonGroupMon.add(jRadioButtonMon1);
        jRadioButtonMon1.setText("1");

        buttonGroupMon.add(jRadioButtonMon2);
        jRadioButtonMon2.setText("2");

        buttonGroupMon.add(jRadioButtonMon3);
        jRadioButtonMon3.setText("3");

        buttonGroupMon.add(jRadioButtonMon4);
        jRadioButtonMon4.setText("4");

        buttonGroupDD.add(jRadioButtonDD1);
        jRadioButtonDD1.setText("1");

        buttonGroupDD.add(jRadioButtonDD2);
        jRadioButtonDD2.setText("2");

        buttonGroupDD.add(jRadioButtonDD3);
        jRadioButtonDD3.setText("3");

        buttonGroupDD.add(jRadioButtonDD4);
        jRadioButtonDD4.setText("4");

        jCheckBox1.setText("1");

        jCheckBox2.setText("2");

        jCheckBox3.setText("3");

        jCheckBox4.setText("4");

        jButtonAnyadir.setMnemonic('a');
        jButtonAnyadir.setText("Añadir");

        jButtonBuscar.setMnemonic('b');
        jButtonBuscar.setText("Buscar");

        jButtonEliminar.setMnemonic('e');
        jButtonEliminar.setText("Eliminar");

        jButtonCancelar.setMnemonic('c');
        jButtonCancelar.setText("Cancelar");

        jButtonSalir.setMnemonic('s');
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnyadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomClient)
                            .addComponent(jLabelLoc))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNomClient)
                            .addComponent(jComboBoxLoc, 0, 133, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabelListClient)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButtonProc3)
                            .addComponent(jRadioButtonProc2)
                            .addComponent(jRadioButtonProc1)
                            .addComponent(jRadioButtonProc4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMem)
                            .addComponent(jRadioButtonMem1)
                            .addComponent(jRadioButtonMem)
                            .addComponent(jRadioButtonMem3)
                            .addComponent(jRadioButtonMem4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMon)
                            .addComponent(jRadioButtonMon1)
                            .addComponent(jRadioButtonMon2)
                            .addComponent(jRadioButtonMon3)
                            .addComponent(jRadioButtonMon4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelOpt)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonDD1)
                                    .addComponent(jRadioButtonDD2)
                                    .addComponent(jRadioButtonDD3)
                                    .addComponent(jRadioButtonDD4))
                                .addGap(191, 191, 191)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox1)
                                            .addComponent(jCheckBox2)
                                            .addComponent(jCheckBox3))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCheckBox4)
                                            .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 31, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomClient)
                            .addComponent(jTextFieldNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelListClient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLoc)
                            .addComponent(jComboBoxLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelOpt)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelMem)
                            .addComponent(jLabelMon)
                            .addComponent(jLabelDD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMem1)
                            .addComponent(jRadioButtonProc1)
                            .addComponent(jRadioButtonMon1)
                            .addComponent(jRadioButtonDD1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMem)
                            .addComponent(jRadioButtonProc2)
                            .addComponent(jRadioButtonMon2)
                            .addComponent(jRadioButtonDD2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMem3)
                            .addComponent(jRadioButtonProc3)
                            .addComponent(jRadioButtonMon3)
                            .addComponent(jRadioButtonDD3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMem4)
                            .addComponent(jRadioButtonProc4)
                            .addComponent(jRadioButtonMon4)
                            .addComponent(jRadioButtonDD4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAnyadir)
                            .addComponent(jButtonBuscar)
                            .addComponent(jButtonEliminar))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalir)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas_de_ordenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas_de_ordenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas_de_ordenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas_de_ordenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas_de_ordenadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDD;
    private javax.swing.ButtonGroup buttonGroupMem;
    private javax.swing.ButtonGroup buttonGroupMon;
    private javax.swing.ButtonGroup buttonGroupProc;
    private javax.swing.JButton jButtonAnyadir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBoxLoc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDD;
    private javax.swing.JLabel jLabelListClient;
    private javax.swing.JLabel jLabelLoc;
    private javax.swing.JLabel jLabelMem;
    private javax.swing.JLabel jLabelMon;
    private javax.swing.JLabel jLabelNomClient;
    private javax.swing.JLabel jLabelOpt;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRadioButtonDD1;
    private javax.swing.JRadioButton jRadioButtonDD2;
    private javax.swing.JRadioButton jRadioButtonDD3;
    private javax.swing.JRadioButton jRadioButtonDD4;
    private javax.swing.JRadioButton jRadioButtonMem;
    private javax.swing.JRadioButton jRadioButtonMem1;
    private javax.swing.JRadioButton jRadioButtonMem3;
    private javax.swing.JRadioButton jRadioButtonMem4;
    private javax.swing.JRadioButton jRadioButtonMon1;
    private javax.swing.JRadioButton jRadioButtonMon2;
    private javax.swing.JRadioButton jRadioButtonMon3;
    private javax.swing.JRadioButton jRadioButtonMon4;
    private javax.swing.JRadioButton jRadioButtonProc1;
    private javax.swing.JRadioButton jRadioButtonProc2;
    private javax.swing.JRadioButton jRadioButtonProc3;
    private javax.swing.JRadioButton jRadioButtonProc4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNomClient;
    // End of variables declaration//GEN-END:variables
}
