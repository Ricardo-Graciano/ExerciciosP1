/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_41;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Numero sorteado: " +(int)(Math.random()*6+1));
    }
    
}
