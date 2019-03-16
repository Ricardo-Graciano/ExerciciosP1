/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_31;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float valor = entraValor();
        int opt = entraOpt();
        float valorFinal = valFinal(valor, opt);
        saida(valorFinal, opt, valor);
    }
    
    public static float entraValor(){
        float valor = 0;
        String value = "";
        
        try{
            value = JOptionPane.showInputDialog("DIGITE O VALOR DO PRODUTO");
            valor = Float.parseFloat(value);
            
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Você deve inserir um valor válido " + erro.toString());
        }
        return valor;
    }
    
    public static int entraOpt(){
        int opt = 0, i = 0;
        String value = "";
        
        while(i == 0){
            try{
                value = JOptionPane.showInputDialog("DIGITE O CODIGO DE DISCONTO");
                opt = Integer.parseInt(value);
                
                if(opt>=1 && opt<=4){
                    i = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "ERRO\nVocê deve inserir um numero entre 1 - 4 ");
                }
            } catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Você deve inserir um valor válido " + erro.toString());
            }
            
            
        }
        return opt; 
    }
    public static float valFinal(float val, int opt){
            float[] vet = {5,10,20,50};
            float valor = vet[opt-1]/100;
            valor = val * valor;
            valor = val - valor;
            return valor;
    }
    
    public static void saida(float valorFinal, int opt, float valor){
        JOptionPane.showMessageDialog(null,
                "Valor do produto: R$ "+valor+"\n"+
                "Código de desconto: "+opt+"\n"+
                "Valor do produto com desconto: R$ "+valorFinal);
    }
}
