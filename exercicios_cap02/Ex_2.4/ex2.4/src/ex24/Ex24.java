/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex24;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        capDados();
    }
    
    public static void capDados(){
        String value="";
        float v1, v2;
        
        try{
            value = JOptionPane.showInputDialog("DIGITE O PRIMEIRO VALOR");
            v1 = Float.parseFloat(value);
            
            value = JOptionPane.showInputDialog("DIGITE O SEGUNDO VALOR");
            v2 = Float.parseFloat(value);
            
            saida(v1, v2);
            
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão");
        }
    }
    
    public static void saida(float v1, float v2){
        JOptionPane.showMessageDialog(null, 
                "Adição: "+v1+" + "+v2+" = "+(v1+v2)+"\n"+
                "Subtração: "+v1+" - "+v2+" = "+(v1-v2)+"\n"+
                "Multiplicação: "+v1+" * "+v2+" = "+(v1*v2)+"\n"+
                "Divisão: "+v1+" / "+v2+" = "+(v1/v2)+"\n");
    }
    
}
