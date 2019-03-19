/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_44;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entraFrase();
    }
    
    public static void entraFrase(){
        String frase = JOptionPane.showInputDialog("Digite uma frase");
        
        processa(frase);
    }
    
    public static void processa(String frase){
        String fra = frase;
        frase = frase.replace("a", "");
        frase = frase.replace("A", "");
        frase = frase.replace("e", "");
        frase = frase.replace("E", "");
        frase = frase.replace("i", "");
        frase = frase.replace("I", "");
        frase = frase.replace("o", "");
        frase = frase.replace("O", "");
        frase = frase.replace("u", "");
        frase = frase.replace("U", "");
        
        saida(frase, fra);
    }
    
    public static void saida(String frase, String fra){
        JOptionPane.showMessageDialog(null, "Frase fornecida: "+fra+"\n"+
                "Frase sem vogais: "+frase);
    }
}
