/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_33;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dados dados = new Dados();
        dados.v1 = Dados.entraDados();
        dados.v2 = Dados.entraDados();
        dados.opt = Dados.operacao();
        Dados.saida(dados.opt, dados.v1, dados.v2);
    }
    
    
    
}
