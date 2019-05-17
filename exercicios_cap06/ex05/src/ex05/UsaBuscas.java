/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

/**
 *
 * @author Ricardo
 */
public class UsaBuscas {
    
    public void exec(){
        Buscas b = new Buscas();
        
        int[] vetor = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        String[] vet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};



        System.out.println(b.buscaNumero(5, vetor));
        System.out.println(b.buscaPalavra(vet));
    }
    
}
