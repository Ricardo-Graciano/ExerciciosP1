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
public class TV {
    private boolean ligado;
    private int canal, volume;
    
    public void TV(){   
    
    }
    
    public void TV(boolean ligado, int canal, int volume) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
    }
    
    public void ligarTV(){
        this.ligado = true;
    }
    
    public void desligarTV(){
        this.ligado = false;
    }
    
    public void aumentar(){
        if(this.volume >0 && this.volume <100){
            this.volume++;
        }
    }
    
    public void diminuir(){
        if(this.volume >0 && this.volume <100){
            this.volume--;
        }
    }
    
    public void trocarCanal(int canal){
        if(canal>=0 || canal <=999){
            this.canal = canal;
        }
    }
    
    public void mostrar(){
        if(this.ligado == true)
            System.out.println("Status: LIGADO");
        else{
            System.out.println("Status: DESLIGADO");
        }
        
        System.out.println("Canal: "+this.canal);
        System.out.println("Volume: "+this.volume);
    }
    
    
}
