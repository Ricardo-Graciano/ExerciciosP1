/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author Ricardo
 */
public class UsaTv {
    
    public void UsaTv(){
        TV t = new TV();
    
        t.TV(true, 256, 25);
        t.desligarTV();
        t.ligarTV();
        t.aumentar();
        t.aumentar();
        t.aumentar();
        t.aumentar();
        t.aumentar();
        t.aumentar();
        t.aumentar();
        t.diminuir();
        t.trocarCanal(10);
        t.mostrar();
    }
    
}
