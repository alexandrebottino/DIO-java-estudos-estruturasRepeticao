package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota;
        double maiorNota = 0;
        double totalNotas = 0;
        double media = 0;
        int i = 0;

        do {
            System.out.println("Digite uma nota: ");
            nota = entrada.nextDouble();

            if (maiorNota < nota) maiorNota = nota;
            totalNotas = totalNotas + nota;
            i++;
        } while (i < 5);

        media = totalNotas / i;
        System.out.println("A maior nota é: " + maiorNota + "E a média das notas é: " + media);
    }
}
//RESOLUÇÃO DO INSTRUTOR

//    Scanner scan = new Scanner(System.in);
//
//    int numero;
//    int maior = 0;
//    int soma = 0;
//
//    int count = 0;
//        do {
//                System.out.println("Número: ");
//                numero = scan.nextInt();
//
//                soma = soma + numero;
//
//                if (numero > maior) maior = numero;
//
//                count = count + 1;
//                } while(count < 5);
//
//        System.out.println("Maior: " + maior);
//        System.out.println("Média: " + (soma/5));
