/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.de.ordenadores;

import java.util.ArrayList;
import javax.swing.ButtonModel;

/**
 *
 * @author alumno
 */
public class Contenedor_datos {
    ArrayList<ButtonModel>proc =new ArrayList<>();
    ArrayList<ButtonModel>mem =new ArrayList<>();
    ArrayList<ButtonModel>mon =new ArrayList<>();
    ArrayList<ButtonModel>dd =new ArrayList<>();
 

    public void anyadir(ButtonModel proce, ButtonModel memo, ButtonModel moni, ButtonModel ddr) {
        proc.add(proce);
        mem.add(memo);
        mon.add(moni);
        dd.add(ddr);
    }
//    public void ArrayList<ButtonModel> recuperar(int i){
//        ArrayList<ButtonModel>lista = new ArrayList<>();
//        lista.add(proc.get(i));
//        lista.add(mem.get(i));
//        lista.add(mon.get(i));
//        lista.add(dd.get(i));
//        return lista;
//    }
    
}
