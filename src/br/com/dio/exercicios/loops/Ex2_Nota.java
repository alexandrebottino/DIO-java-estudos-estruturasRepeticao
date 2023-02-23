package br.com.dio.exercicios.loops;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        while (true) {
            System.out.println("Entre com uma nota entre 0 e 10: ");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <=10) {
                System.out.println("Valor válido");
                break;
            } else {
                System.out.println("Valor invalido, tente novamente");
            }
        }
        System.out.println("Programa sendo finalizado");
    }
}

// RESOLUÇÃO DO MENTOR

//    Scanner scan = new Scanner(System.in);
//
//    int nota;
//
//        System.out.println("Nota: ");
//                nota = scan.nextInt();
//
//                while(nota < 0 | nota > 10) {
//        System.out.println("Nota Inválida! Digite novamente: ");
//        nota = scan.nextInt();
//        }
