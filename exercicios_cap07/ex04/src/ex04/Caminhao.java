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
public class Caminhao {
    private String[] combustiveis = {"gasolina", "disel" , "gas"};
    private String combustivel;
    private double velocidade;
    
    public void Caminhao(){
        this.combustivel = this.combustiveis[0];
        this.velocidade = 0;
    }
    
    public void subComb(int i){
        if(i>=0 && i<=2){
            this.combustivel = this.combustiveis[i];
        }
    }
    
    public void aumentarVel(double vel){
        if(this.velocidade+vel>150)
            this.velocidade = 150;
        else 
            this.velocidade += vel;
    }
    
    public void diminuirVel(double vel){
        if(this.velocidade-vel < 0){
            System.out.println("Não foi possivel diminuir velocidade");
        } else {        
            this.velocidade -= vel;
        }
    }
    
    public void mostrar(){
        System.out.println("Combustivel: "+this.combustivel.toUpperCase());
        System.out.println("Velocidade.: "+this.velocidade+" km/h");
    }
}
