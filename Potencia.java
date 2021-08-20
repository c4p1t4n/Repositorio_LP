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
public class Potencia {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        System.out.println("Digite os numeros para elevar: ");
        int numero = rd.nextInt();
        int numero2 = rd.nextInt();
        int numeroFinal = numero;
        for(int cont =1; cont<=numero2;cont++){
            numeroFinal = numero * numero;
        
        }
        System.err.println(numeroFinal);
        
        
    }
    
}
