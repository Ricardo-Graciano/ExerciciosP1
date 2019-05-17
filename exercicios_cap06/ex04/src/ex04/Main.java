/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

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
        Brindes b = new Brindes();
        JOptionPane.showMessageDialog(null, "O premio sorteado foi: \n"+b.sorteio());
    }
    
}
