/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetodoisnivelamento;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Random gerador = new Random();
        System.out.println("Digite um numero de 0 a 10");
        
        int numero = rd.nextInt();
        while(numero>10 || numero < 0){
            System.out.println("Numero invalido digite novamente: ");
            numero = rd.nextInt();
        
        }
        
        int n =gerador.nextInt(10);
        
        int cont =1;
        while(numero!= n){
        
            n =gerador.nextInt(10);
            System.out.println(n);
            cont++;
                   
        }
        if(cont<=3){
            System.out.println( "Você é MUITO sortudo");
            
        }else if(cont<=10){
            System.err.println("Você é sortudo");
        }
        else{
            System.out.println("Vai trabalhar");
        }
        
    
    
    
    }
    
    
    
    
}
