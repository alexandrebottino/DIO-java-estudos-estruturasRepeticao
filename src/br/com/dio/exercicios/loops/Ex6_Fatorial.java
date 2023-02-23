package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int totalFatorial = 1;

        System.out.println("Digite um valor para ser feito o fatorial: ");
        numero = entrada.nextInt();

        for (int cont = numero; cont <= numero && cont >0; cont--) {

            totalFatorial = totalFatorial * cont;
        }

        System.out.println(" O fatorial do número " + numero + "é: " + totalFatorial);
    }
}

//RESOLUÇÃO DO INSTRUTOR

//    Scanner scan = new Scanner(System.in);
//
//        System.out.println("Fatorial: ");
//                int fatorial = scan.nextInt();
//
//                int multiplicacao = 1;
//
//                System.out.print(fatorial +"! = ");
//                for(int i = fatorial ; i >= 1 ; i --) {
//                multiplicacao = multiplicacao * i;
//                }
//
//                System.out.println(multiplicacao);
//                }


