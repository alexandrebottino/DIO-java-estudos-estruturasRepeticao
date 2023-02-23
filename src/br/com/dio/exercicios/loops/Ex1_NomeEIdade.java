package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        String nome = "1";
        int idade;

        Scanner entrada = new Scanner(System.in);

        while (!nome.equals("0")) {
            System.out.println("Digite o nome: \n");
            nome = entrada.next();

            System.out.println("Digite a idade: \n");
            idade = entrada.nextInt();

            System.out.println("O nome digitado é: " + nome + "\nE a idade digitada é: " + idade);

            System.out.println("####### Continuar o loop (s)? Ou não (0) #######");
            nome = entrada.next();
        }
    }

}

// RESOLUÇÃO DO MENTOR

//    Scanner scan = new Scanner(System.in);
//
//    String nome;
//    int idade;
//
//        while(true) {
//                System.out.println("Nome: ");
//                nome = scan.next();
//                if (nome.equals("0")) break;
//
//                System.out.println("Idade: ");
//                idade = scan.nextInt();
//                }
//
//                System.out.println("Continua aqui...");