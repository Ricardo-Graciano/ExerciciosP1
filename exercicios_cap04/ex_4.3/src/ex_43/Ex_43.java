/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_43;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        valores();
    }
    
    public static void valores(){
        int val = (int)(Math.random()*10);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 0 - 9"));
        
        if(val == num){
            saida(1, val, num);
        } else{
            saida(0, val, num);
        }
    }
    
    public static void saida(int def, int val, int num){
        if(def == 1){
            JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ ACERTOU\n"+
                    "Número sorteado: "+val+"\n"+
                    "Número digitado: "+num);
        } else {
            JOptionPane.showMessageDialog(null, "VOCÊ ERROU\n"+
                    "Número sorteado: "+val+"\n"+
                    "Número digitado: "+num);
        }
    }
    
}
