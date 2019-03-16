/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_32;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entraIdades();
    }
    public static void entraIdades(){
        int[] idade = new int[4];
        String value = "";
        int i = 0, def = 0;
        for(i=0; i<idade.length; i++){
            while(def==0){
                try{
                     value = JOptionPane.showInputDialog("DIGITE A "+(i+1)+"ª IDADE");
                     idade[i] = Integer.parseInt(value);
                     def = 1;
                }catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Você deve inserir um valor inteiro "+erro.toString());
                }    
            }
            def = 0;
        }
        processa(idade);
    }
    
    public static void processa(int[] idade){
        int maior = idade[0], menor = idade[0];
        int i=0;
        
        for(i=1; i<idade.length; i++){
            if(idade[i]>maior){
                maior = idade[i];
            }
            if(idade[i]<menor){
                menor = idade[i];
            }
        }
        
        saida(idade, maior, menor);
    }
    
    public static void saida(int[] idade, int maior, int menor){
        JOptionPane.showMessageDialog(null, 
                "Idades fornecidas:\n"+
                idade[0]+", "+idade[1]+", "+idade[2]+", "+idade[3]+"\n"+
                "A maior idade é: "+maior+"\n"+
                "A menor idade é: "+menor);
        
        
    }
    
}   

