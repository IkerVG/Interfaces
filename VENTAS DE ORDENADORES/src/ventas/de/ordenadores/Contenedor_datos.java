/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.de.ordenadores;

import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;

/**
 *
 * @author alumno
 */
public class Contenedor_datos {
    ArrayList<ButtonModel>proc =new ArrayList<>();
    ArrayList<ButtonModel>mem =new ArrayList<>();
    ArrayList<ButtonModel>mon =new ArrayList<>();
    ArrayList<ButtonModel>dd =new ArrayList<>();
    ArrayList<Boolean> chk1 = new ArrayList<>();
    ArrayList<Boolean> chk2 = new ArrayList<>();
    ArrayList<Boolean> chk3 = new ArrayList<>();
    ArrayList<Boolean> chk4 = new ArrayList<>();
    ArrayList<String> jbl = new ArrayList<>();
 

    public void anyadir(String jb,ButtonModel proce, ButtonModel memo, ButtonModel moni, ButtonModel ddr, Boolean b1, Boolean b2, Boolean b3, Boolean b4) {
        jbl.add(jb);
        proc.add(proce);
        mem.add(memo);
        mon.add(moni);
        dd.add(ddr);
        chk1.add(b1);
        chk2.add(b2);
        chk3.add(b3);
        chk4.add(b4);
    }
    public ArrayList<ButtonModel> recuperar(int i){
        ArrayList<ButtonModel>lista = new ArrayList<>();
        lista.add(proc.get(i));
        lista.add(mem.get(i));
        lista.add(mon.get(i));
        lista.add(dd.get(i));
        return lista;
    }
    public ArrayList<Boolean>recuperarchk(int i){
        ArrayList<Boolean>lista = new ArrayList<>();
        lista.add(chk1.get(i));
        lista.add(chk2.get(i));
        lista.add(chk3.get(i));
        lista.add(chk4.get(i));
        return lista;
    }
    public String recuperarloc(int i){
        String s = jbl.get(i);
        return s;
    }
    public void eliminar (int i){
        proc.remove(i);
        mon.remove(i);
        mem.remove(i);
        dd.remove(i);
        chk1.remove(i);
        chk2.remove(i);
        chk3.remove(i);
        chk4.remove(i);
    }
}
