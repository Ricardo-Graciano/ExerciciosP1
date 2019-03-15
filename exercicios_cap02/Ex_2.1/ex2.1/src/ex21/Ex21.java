/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo
 */
public class Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String v = "";
        float base = 0, altura = 0 , area = 0;
        BufferedReader areaTri;
        
        try{
            System.out.print("Digite o valor da BASE do triangulo: ");
            areaTri = new BufferedReader(new InputStreamReader(System.in));
            v = areaTri.readLine();
            base = Float.parseFloat(v);
            
            System.out.print("Digite o valor da ALTURA do triangulo: ");
            areaTri = new BufferedReader(new InputStreamReader(System.in));
            v = areaTri.readLine();
            altura = Float.parseFloat(v);
            
            area = base*altura/2;
            System.out.println("A AREA  desse triangulo e: " + area);
        }
        catch(IOException erro){
            System.out.println("Houve um erro na entrada de dados " + erro.toString());
        }
        catch(NumberFormatException erro){
            System.out.println("Houve um erro na conversao, digite apenas caracteres numericos " + erro.toString());
        }
    }
    
}
