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
public class Numericos {
    public static void main(String[] args) {
        Double numero = 3.4;
        System.out.println("Para cima: "+ Math.ceil(numero));
        System.out.println("Para baixo: "+ Math.floor(numero));
        Long numeroRound = Math.round(numero);
        System.out.println(numeroRound);
        System.out.println(Math.round(numero));
        System.out.println(Integer.MAX_VALUE);
    }
    
}
