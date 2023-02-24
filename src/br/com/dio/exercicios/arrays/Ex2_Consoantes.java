package br.com.dio.exercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = entrada.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                consoantes[cont] = letra;
                quantidadeConsoantes++;
            }

            cont++;

        } while (cont < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != "null") {
                System.out.println(Arrays.toString(consoantes) + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}

//RESPOSTA DO INSTRUTOR
//
//    Scanner scan = new Scanner(System.in);
//
//    String[] consoantes = new String[6];
//    int quantidadeConsoantes = 0;
//
//    int count = 0;
//        do {
//                System.out.println("Letra: ");
//                String letra = scan.next();
//
//                if ( !(letra.equalsIgnoreCase("a") |
//                letra.equalsIgnoreCase("e") |
//                letra.equalsIgnoreCase("i") |
//                letra.equalsIgnoreCase("o") |
//                letra.equalsIgnoreCase("u")) )  {
//                consoantes[count] = letra;
//                quantidadeConsoantes++;
//                }
//
//                count++;
//
//                } while(count < consoantes.length);
//
//        System.out.print("Consoantes: ");
//        for ( String consoante  :  consoantes ) {
//        if ( consoante != null)
//        System.out.print(consoante + " ");
//        }
//        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
//        System.out.println(consoantes.length);
//
//        }