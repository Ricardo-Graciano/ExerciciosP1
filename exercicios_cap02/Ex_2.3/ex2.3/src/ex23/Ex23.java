/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex23;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex23 {


    public static void main(String[] args) {
        capDados();
    }
    
    public static void capDados(){
        String value = "";
        float peso, altura;
        
        try{
            value = JOptionPane.showInputDialog("DIGITE O SEU PESO");
            peso = Float.parseFloat(value);
            
            value = JOptionPane.showInputDialog("DIGITE A SUA ALTURA");
            altura = Float.parseFloat(value);
            
            processaDados(peso, altura);
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve erro na conversão");
        }
    }
    
    public static void processaDados(float peso, float altura){
        float imc = altura*altura;
        imc = peso/imc;
        
        if(imc<18.5){
        saida(imc,"Peso abaixo do normal");
        } else if (imc>=18.5 && imc<24.5){
            saida(imc,"Peso ideal");
        } else if (imc>=25.5 && imc< 30){
            saida(imc,"Pré-obesidade");
        } else if (imc>=30 && imc<35){
            saida(imc,"Obesidade classe I");
        } else if(imc>=35 && imc<=39.9){
            saida(imc,"Obesidade classe II(severa)");
        } else if(imc>39.9){
            saida(imc,"Obesidade classe III(mórbida)");
        }
           
    }
    
    public static void saida(float imc,String dados){
        JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é "+imc+"\nSua classificação é: "+dados);
    }
}
