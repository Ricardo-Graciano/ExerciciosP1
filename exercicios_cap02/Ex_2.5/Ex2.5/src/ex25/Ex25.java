/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex25;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        capDados();
    }
    
    public static void capDados(){
        String value = "";
        int b;
        
        try{
            value = JOptionPane.showInputDialog(null, "DIGITE O TAMANHO EM BYTES DO ARQUIVO");
            b = Integer.parseInt(value);
            saida(b);
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO\nDigite apenas números");
        }
    }
    
    public static void saida(int b){
        float velNet = 250000;
        float seg = b/velNet;
        
        JOptionPane.showMessageDialog(null, "Tamanho do arquivo em bytes: " + b
        +"\nSegundos necessários para download: " + seg + " seg");
    }
}
