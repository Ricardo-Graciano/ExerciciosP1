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
public class Buscas extends UsaBuscas {
    public boolean buscaNumero(int numero, int[] vetor){
        for(int i=0; i<vetor.length;i++){
            if(numero == vetor[i]){
                return true;
            }
        }
        return false;
    }
    
    public String buscaPalavra(String[] palavras){
        for(int i = 0; i<palavras.length; i++){
            if("sexo".equals(palavras[i])){
                return "SIM";
            }
        }
        return "NÃO";
    }
}
