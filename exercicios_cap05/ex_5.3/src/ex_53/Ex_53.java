/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_53;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] mat = new int[50][20];
        int i, j, def=0;
        for(i=0; i<50; i++){
            for(j=0; j<20; j++){
                mat[i][j] = (int)(Math.random()*1000);
            }
        }
        try{
            int val = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor aser procurado dentro da matriz"));  
            
            
            for(i=0; i<50; i++){
                for(j=0; j<20; j++){
                    if(mat[i][j] == val){
                        JOptionPane.showMessageDialog(null, "O valor "+val
                                   +" está inserido na matriz");
                        def=1;
                        break;
                    }
                    if(def==1) break;
                }
                if(def==1) break;
            }
            if(def==0){
                JOptionPane.showMessageDialog(null, "O valor "+val
                                   +" não está inserido na matriz");
            }
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Digite apenas numeros "+erro.toString());
        }
        
    }
    
}
