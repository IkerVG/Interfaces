/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author alumno
 */

public class Utilidades {
    public void num_carac(JTextField f,JTextField f2, int num_max, KeyEvent evt){
        /*Este metodo coge por parámetro 2 textfields, 1º el que vamos a tratar y 2º al que nos vamos
        a mover*/
        if(f.getText().length()>=num_max){
            /* Si el campo excede la longitud determinada, se ajusta a su longitud máxima
            y la tecla pulsada se ignora */
            evt.consume();
            f2.grabFocus();//Al introducir el último carácter, salta al siguiente campo
            f.setText(f.getText().substring(0,num_max));
        }
    }
    public boolean comprobar(JTextField f,String s){
        /*Comprueba que el campo se ajuste a unos valores numéricos
        y notifica con una ventana emergente el error al usuario
        */
        boolean error = false;
        switch(s){
            case "Numero":if(!f.getText().matches("[0-9]+")){error=true;}break;
            case "Nombre": if(!f.getText().replaceAll(" ", "").matches("[A-z]+")){error=true;}break;   
            case "Apellidos":if(!f.getText().replaceAll(" ","").matches("[A-z]+[-]?[A-z]+")){error=true;}break;
            case "Email":if(!f.getText().matches("[A-z_]+[@][A-z]+[.][A-z]+")){error=true;}break;
        }
        return error;
    }
    
String calculaLetra(int dni)
    {
    String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
    int modulo= dni % 23;
    String letra = Character.toString(juegoCaracteres.charAt(modulo));
    return letra; 
    } 
 
}
