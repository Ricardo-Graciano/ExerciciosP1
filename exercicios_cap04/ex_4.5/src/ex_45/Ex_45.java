/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_45;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entraDados();
    }
    
    public static void entraDados(){
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
        
        processamento(frase, palavra);
    }
    
    public static void processamento(String frase, String palavra){
        String palOr = palavra;
        String fraseOr = frase;
        palavra = palavra.trim();
        int cont = 0, i = 0;
        String pal[] = new String[frase.split(" ").length];
        
        frase = frase.toLowerCase();
        palavra = palavra.toLowerCase();
        
        pal = frase.split(" ");
        for(i=0; i<pal.length; i++){
            if(pal[i].equals(palavra)){
                cont++;
            }
        }
        System.out.println(cont);
        saida(fraseOr, palOr, cont);
    }
    
    public static void saida(String frase, String palavra, int cont){
        JOptionPane.showMessageDialog(null, "Frase fornecida: "+frase+"\n"+
                "Palavra fornecida: "+palavra+"\n"+
                "Quantidade de ocorrências: "+cont);

    }
}
