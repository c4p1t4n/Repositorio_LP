/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetodoisnivelamento;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite A tabuada que quer ver");
        Scanner rd= new Scanner(System.in);
        
        int numero= rd.nextInt();        
        for(int cont=0;cont<=10;cont++){
            int variavel = numero* cont;
            System.out.println(variavel);
        }
    }
 
}
