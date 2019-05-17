/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author Ricardo
 */
public class UsaLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        
        lampada1.ligar();
        lampada2.desligar();
        
        System.out.println("Lampada 1: "+lampada1.observar()+"\n"
                + "Lampada 2: "+lampada2.observar());
    }
}
