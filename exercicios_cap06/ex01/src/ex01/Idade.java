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
public class Idade {
    public String idade(int idade){
        if(idade>=0 && idade <=2){
            return "Bebê";
        } else if (idade>=3 && idade <=11){
            return "Crianca";
        } else if (idade>=12 && idade<=19){
            return "Adolescente";
        } else if (idade>=20 && idade <=30){
            return "Jovem";
        } else if (idade>=31 && idade <=60){
            return "Adulto";
        } else if(idade>60){
            return "Idoso";
        } 
        return "Idade não pertence a nenhum grupo" ;
    }
}
