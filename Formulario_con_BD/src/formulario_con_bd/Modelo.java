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
    DefaultTableModel mod;
    String[][] data = {};
    String cabeza [] = {"Codigo","Descripción","Stock","Precio"};
    ArrayList<String>lista;
    JTable jtable;
   public Modelo(ArrayList<String> list){
        lista = list;
    }
   public DefaultTableModel rellenar(){
        mod = new DefaultTableModel(data,cabeza);
        int y = 0;
       String datos[] = new String[4];
       for(int x = 1;x<=lista.size()/4;x++){
            for(int i = 0;i<4;i++){
                datos[i] = lista.get(y);
                y++;
            }   
            mod.addRow(datos);
       }
        
        return mod;
   }
}
