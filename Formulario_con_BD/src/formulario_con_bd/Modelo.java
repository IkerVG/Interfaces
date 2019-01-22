/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_con_bd;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumno
 */
public class Modelo {
    DefaultTableModel mod = new DefaultTableModel();
    ArrayList <String> lista = new ArrayList<>();
    JTable jTable1;
   public Modelo(JTable jTable1,ArrayList<String> list){
        this.jTable1 = jTable1;
        this.lista = list; 
    }

    public void rellenar(){
        Object v [] = new Object[4];
            for(int i = 0;i<4;i++){ 
                v[i]=lista.get(i); 
            }
            mod.addRow(v);
        jTable1.setModel(mod);
    }
}
