/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_35;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        processa();
    }
    
    public static void processa(){
        int i=0, soma=0;
        
        while(1<1000){
            if(i%2!=0){
                soma+=i;
            }
            if(i==999){
               saida(soma);
               break;
            }
            i++;
        }
        
       
    }
    
    public static void saida(int soma){
        JOptionPane.showMessageDialog(null, soma);
    }
}