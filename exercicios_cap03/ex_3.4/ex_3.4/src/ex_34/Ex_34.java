/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_34;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entraSenha();
    }
    
    public static void entraSenha(){
        int i = 3, def = 0;
        String value = JOptionPane.showInputDialog("Digite a senha do seu cartão");
        
        while(i>0){
            if(value.equals("Java")){
                def = 1;
                break;
            } else {
                value = JOptionPane.showInputDialog("SENHA INVÁLIDA\nVocê ainda "
                        + "tem "+i+" chance(s) para tentar\nDigite a senha da sua conta");
            } if(value.equals("Java")){
                def = 1;
                break;
            }
            i--;
        }
        saida(def);
    }
    
    public static void saida(int def){
        if (def==0){
            JOptionPane.showMessageDialog(null, "CARTÃO CANCELADO");
        } else {
            JOptionPane.showMessageDialog(null, "CONTA ACESSADA COM SUCESSO");
        }
    }
    
}
