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
public class Data {
    public int pegaMes(String data){
        String[] datas = data.split("/");
        
        return Integer.parseInt(datas[1]);
    }
}
