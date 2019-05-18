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
public class Play implements Jogo{

    @Override
    public void andar() {
        System.out.println("O jogador está ANDANDO");
    }

    @Override
    public void pular() {
        System.out.println("O jogador está PULANDO");
    }

    @Override
    public void chutar() {
        System.out.println("O jogador está CHUTANDO");
    }
    
}
