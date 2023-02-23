package br.com.dio.exercicios.loops;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int produto;
        int cont = 0;

        System.out.println("Entre com o número que será feito a tabela: ");
        numero = entrada.nextInt();

        do {
            produto = numero * cont;
            System.out.println(numero + " X " + cont + " = " + produto);
            cont++;
        } while (cont <= 10);
    }
}

// RESOLUÇÃ0 DO INSTRUTOR

//    Scanner scan = new Scanner(System.in);
//
//        System.out.println("Tabuada: ");
//                int tabuada = scan.nextInt();
//
//                System.out.println("Tabuada de " + tabuada);
//                for(int i = 1; i <= 10; i = i + 1) {
//                System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
//                }
