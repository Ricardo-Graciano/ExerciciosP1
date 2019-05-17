/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Idade i = new Idade();
        
        JOptionPane.showMessageDialog(null, "MENSAGEM \n" + i.idade(Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"))));
    }
    
}
