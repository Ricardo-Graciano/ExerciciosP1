/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

/**
 *
 * @author Ricardo
 */
public class Brindes {
    String[] brindes = {"Geladeira", "Carro", "Bicicleta", "Fogão"};
    
    public String sorteio(){
        int num = (int) (Math.random() * brindes.length);
        return brindes[num].toUpperCase();
    }
}
