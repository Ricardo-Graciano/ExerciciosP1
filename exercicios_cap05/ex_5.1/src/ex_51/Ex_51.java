/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_51;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nomes = {"Ricardo","Thiago","Gabriel Gomes","Jefferson",
            "Eduardo","Gabriel Mendonça","Carlos","Tulio","Mateus","Pedro"};
        int num = (int)(Math.random()*10);
        JOptionPane.showMessageDialog(null,"Ganhador: "+ nomes[num]);
    }
    
}
