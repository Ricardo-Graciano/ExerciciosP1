/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_33;

import static java.lang.Character.toUpperCase;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Dados {
    float v1, v2;
    char opt;
    
    public static float entraDados(){
        String value = "";
        float a=0;
        
        try{
            value = JOptionPane.showInputDialog("INSIRA O UM VALOR");
            a = Float.parseFloat(value);
            
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Digite um numero válido " +erro.toString());
        }
        return a;
    }
    
    public static char operacao(){
        String value = "";
        char op =0;
        int def = 0;
        
        while(def!=1){
        try{
            value = JOptionPane.showInputDialog("INSIRA UMA LETRA (A-D)");
            value = value.toUpperCase();
            op = value.charAt(0);
            
            if(op!='A'&&op!='B'&&op!='C'&&op!='D'){
                JOptionPane.showMessageDialog(null, "Digite uma letra correta entre A-D");
            } else {
                def = 1;
            }
            
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Digite um numero válido " +erro.toString());
        }
        
        
        }
        return op;
    }
    
    public static void saida(char op, float v1, float v2){
        if(op == 'A'){
            JOptionPane.showMessageDialog(null, "Numeros fornecidos: "+v1+" e "+v2+"\n"+
                    "Operação escolhida: Soma\n"+
                    "Resultado da opração: "+(v1+v2));
        } else if(op == 'B'){
            JOptionPane.showMessageDialog(null, "Numeros fornecidos: "+v1+" e "+v2+"\n"+
                    "Operação escolhida: Subtração\n"+
                    "Resultado da opração: "+(v1-v2));
        } else if(op == 'C'){
            JOptionPane.showMessageDialog(null, "Numeros fornecidos: "+v1+" e "+v2+"\n"+
                    "Operação escolhida: Multiplicação\n"+
                    "Resultado da opração: "+(v1*v2));
        } else if(op == 'D'){
            JOptionPane.showMessageDialog(null, "Numeros fornecidos: "+v1+" e "+v2+"\n"+
                    "Operação escolhida: Divisão\n"+
                    "Resultado da opração: "+(v1/v2));
        }
         
    }
}
