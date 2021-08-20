/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetodoisnivelamento;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Aluno
 */
public class Randomico {
    public static void main(String[] args) {      
    double ramdom = Math.random() * 10;
   
    Random gerador= new Random();
    System.out.println("Usando classe random Integer \n");
    System.out.println(gerador.nextInt(32));    
    System.out.println(ThreadLocalRandom.current().nextInt(-10,10));
    System.out.println(ThreadLocalRandom.current().nextDouble());
    System.out.println(ThreadLocalRandom.current().nextBoolean());
    }
    
}

