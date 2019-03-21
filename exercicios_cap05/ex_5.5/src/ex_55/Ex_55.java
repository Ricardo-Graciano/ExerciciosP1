/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_55;

import java.text.DecimalFormat;
import javafx.scene.input.DataFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Ex_55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0, i, j;
        String[][] quartos = new String[5][10];
        
        for(i=0; i<5; i++){
            for(j=0; j<10; j++){
                quartos[i][j] = "desocupado";
            }
        }
        
        do{
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog("1 - IMPRIMIR LISTA DE QUARTOS\n"
                    + "2 - DEFINIR OCUPAÇÃO \n"
                    + "3 - SAIR"));  
                
            } catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "DIGITE APENAS VALORES NUMERICOS");
            }
            switch(op){
                    case 1:
                        imprimeLista(quartos);
                        break;
                    case 2:
                        quartos  = defineOcupacao(quartos);
            }
        } while(op!=3);
    }
    
    
    public static void imprimeLista(String[][] quartos){
        DecimalFormat df = new DecimalFormat();
        int i , j;
        String quartosStr = "";
        df.applyPattern("00");
        for(j=0; j<10; j++){
            quartosStr+=  "Andar: 01 Quarto: "+df.format((j+1))+" - "+quartos[0][j]+"    |    "
                        + "Andar: 02 Quarto: "+df.format((j+1))+" - "+quartos[1][j]+"    |    "
                        + "Andar: 03 Quarto: "+df.format((j+1))+" - "+quartos[2][j]+"    |    "
                        + "Andar: 04 Quarto: "+df.format((j+1))+" - "+quartos[3][j]+"    |    "
                        + "Andar: 05 Quarto: "+df.format((j+1))+" - "+quartos[4][j]+"\n";
            
             
        }
        JOptionPane.showMessageDialog(null, quartosStr);
        
    }
    
    public static String[][] defineOcupacao(String[][] quartos){
        int andar, quarto;
        
        try{
            andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o andar a ser ocupado"));
            quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o andar a ser ocupado"));
            andar-=1;
            quarto-=1;
            
            quartos[andar][quarto] = "  OCUPADO  ";
            JOptionPane.showMessageDialog(null, "OCUPAÇÃO NO \n"
                    + "Andar: "+(andar+1)+" Quarto: "+(quarto+1)+"\n"
                    + "REALIZADA COM SUCESSO");
            
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        } catch (java.lang.IndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog(null, "Andar ou Quarto inexistente");
        }
        return quartos;
    }
}
