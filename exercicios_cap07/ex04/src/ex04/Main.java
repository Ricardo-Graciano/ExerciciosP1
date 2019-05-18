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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caminhao c = new Caminhao();
        
        c.Caminhao();
        
        c.aumentarVel(120);
        c.diminuirVel(50);
        c.subComb(2);
        
        c.mostrar();
    }
    
}
