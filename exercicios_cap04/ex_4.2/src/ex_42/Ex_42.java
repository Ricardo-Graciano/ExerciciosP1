/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_42;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        valores();
    }
    
    public static void valores(){
        try{
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("0.00");
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Dgite o valor do produto: "));
            float per = Float.parseFloat(JOptionPane.showInputDialog("Dgite o valor do desconto em (%): "));

            double valorFin = valor - (valor * (per/100));


            valorFin = Math.floor(valorFin);

            JOptionPane.showMessageDialog(null, "Valor original: R$ "+ df.format(valor)+"\n"+
                    "Percentual de desconto: "+per+"%\n"+
                    "Valor final com Desconto: R$ "+df.format(valorFin));
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro ao amazenar o valor "+erro.toString());
        }
    }
    
}
