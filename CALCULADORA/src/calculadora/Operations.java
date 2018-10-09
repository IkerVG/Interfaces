/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class Operations {
    static String num1; 
    static double num2;
    static char oper;

    public void plus(String s){
        oper = '+';
        num1 = s;
    }
     public void div(String s){
        oper = '/';
        num1 = s ;
    }
      public void min(String s){
        oper = '-';
        num1 = s ;
    }
       public void mult(String s){
        oper = '*';
        num1 = s;
    }
       public String equ(String s){
           try{
               double num1b = Double.parseDouble(num1);
               num2 = Integer.parseInt(s);
           switch(oper){
               case '+':num1b+=num2; break;
               case '-':num1b-=num2; break;
               case '*':num1b*=num2; break;
               case '/':num1b/=num2; break;
           }
            return Double.toString(num1b);
           }catch(Exception e){return "Número demasiado largo";}
         
           
    }
       public void C(){
           oper = ' ';
           num1 = null;
           num2 = 0;
       }
}
