/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetodoisnivelamento;

/**
 *
 * @author Aluno
 */
import java.util.Random;
public class Acumulador {
    
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);
        Double conta =0.0;
        while(numeroAleatorio != 0){
            numeroAleatorio = gerador.nextInt(100);
            conta += numeroAleatorio;
        } 
        System.out.println("O valor total é de "+ conta);
    }
   
    
    
    
}
