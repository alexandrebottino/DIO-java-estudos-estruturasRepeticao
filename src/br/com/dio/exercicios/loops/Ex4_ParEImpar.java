package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;
        String continuar;

        while (true) {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else if (numero % 2 == 1) {
                impar++;
            } else if (numero == 0) {
                System.out.println("Zero é invalido, digite um novo valor");
            } else {
                System.out.println("Valor invalido, digite um novo");
            }

            System.out.println("Continuar ? (n)");
            continuar = entrada.next();
            if (continuar.equals("n")){
                break;
            }
        }
        System.out.println("A quantidade de numeros que são par é: " +par);
        System.out.println("A quantidade de numeros que são impar é: " +impar);

    }
}
//RESOLUÇÃO DO INSTRUTOR

//    Scanner scan = new Scanner(System.in);
//
//    int quantNumeros;
//    int numero;
//    int quantPares = 0, quantImpares = 0;
//
//        System.out.println("Quantidade de números: ");
//                quantNumeros = scan.nextInt();
//
//                int count = 0;
//                do {
//                System.out.println("Número: ");
//                numero = scan.nextInt();
//
//                if (numero % 2 == 0 ) quantPares++;
//                else quantImpares++;
//
//                count++;
//                } while(count < quantNumeros);
//
//        System.out.println("Quantidade Par: " + quantPares);
//        System.out.println("Quantidade Ímpar: " + quantImpares);
//        }