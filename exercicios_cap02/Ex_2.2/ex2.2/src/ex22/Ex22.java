/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex22 ex22 = new Ex22();
        ex22.criaConta(sc);
    }
    
    public void criaConta(Scanner sc){
        String nomeCliente;
        System.out.println("BEM VINDA A SUA AGENCIA BANCARIA\nInforme o seu nome completo: ");
        nomeCliente = sc.nextLine();
        System.out.println("CONTA CRIADA COM SUCESSO\nSaldo atual da conta: R$ 0,00");
        deposito(sc, nomeCliente);
    }

    public static void deposito(Scanner sc, String nomeCliente){
        float dep = 0;
        System.out.println("\nSeja bem-vindo(a), Sr(a) "+nomeCliente);
        System.out.print("Informe quanto deseja depositar em sua conta: ");
        try{
            dep = sc.nextFloat();
        } catch(InputMismatchException erro){
            System.out.println("Troque o ponto por virgula. Ex (16.96) por (16,96)");
        }
        
        System.out.println("DEPOSITO REALIZADO\nSaldo atual: R$ "+dep);
        saque(sc, dep);
    }
    
    public static void saque(Scanner sc, float saldo){
        float saq=0;
        System.out.print("Foi informado que o sr(a) precisa realizar um saque\nInforme o valor a ser retirado: ");
        try{
            saq = sc.nextFloat();
            saldo = saldo -saq;
        System.out.println("SAQUE REALIZADO COM SUCESSO");
        } catch(InputMismatchException erro){
            System.out.println("Troque o ponto por virgula. Ex (16.96) por (16,96)");
        }
        saida(saldo);
        
    }
    
    public static void saida(float saldo){
        System.out.println("O saldo final da sua conta é de R$ "+saldo);
    }
    
 }
    
        

    
    

