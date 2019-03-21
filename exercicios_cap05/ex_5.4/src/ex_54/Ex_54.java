/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_54;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        String[][] pessoa = new String[5][2];
        for(i=0; i<5; i++){
            for(j=0; j<2; j++){
                if(j==0){
                    pessoa[i][j] = JOptionPane.showInputDialog("Digite o sexo da "+(i+1)+"ª pessoa");
                }else{
                    pessoa[i][j] = JOptionPane.showInputDialog("Digite o nome da "+(i+1)+"ªpessoa");
                }
            }
        }
        String sexo = JOptionPane.showInputDialog("Digite o SEXO a ser procurado");
        sexo = sexo.toLowerCase();
        String nomes = "";
        for(i=0; i<5; i++){
            pessoa[i][0] = pessoa[i][0].toLowerCase();
            
            if(pessoa[i][0].equals(sexo)){
                nomes+= pessoa[i][1] + "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Sexo: "+sexo+"\n"
                + "Nomes:\n"
                + nomes);
        
    }
    
}
