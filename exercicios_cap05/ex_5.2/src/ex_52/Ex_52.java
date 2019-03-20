/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_52;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entraDados();
    }
    
    public static void entraDados(){
        int[] num = new int[10];
        int i, soma = 0, max =0, min=0 ;
        String value = " ";
        try{
            for(i = 0; i<num.length; i++){
                num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º num"));
                soma+=num[i];
                value+= num[i] + " , ";
                if(i==0){
                    max = num[i];
                    min = num[i];
                }
                if(num[i]>max){
                    max = num[i];
                }
                if(num[i]<min){
                    min = num[i];
                }
            }
            
            saida(value, max, min, soma);

        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        }
        
    }
    
    public static void saida(String value, int max, int min, int soma){
        JOptionPane.showMessageDialog(null, "Numeros inseridos: " + value+"\n"
                + "Soma de todos os numeros: "+soma+"\n"
                + "Maior numero: "+max+"\n"
                + "Menor numero: "+min);
        
    }
    
}
