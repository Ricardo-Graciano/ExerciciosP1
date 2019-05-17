/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

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
       Data d = new Data();
       String data = JOptionPane.showInputDialog("Digite uma data no formato dd/mm/aaaa");
       JOptionPane.showMessageDialog(null, "Data fornecida: "+data+"\nMes: "+d.pegaMes(data));
    }
    
}
