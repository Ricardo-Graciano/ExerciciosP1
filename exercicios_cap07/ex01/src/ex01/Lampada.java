/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author Ricardo
 */
public class Lampada {
    boolean status;
    
    public void ligar(){
        status = true;
    }
    
    public void desligar(){
        status = false;
    }
    
    public String observar(){
        if(status==true)
            return "Ligada";
        
        return "Desligada";
    }
}
