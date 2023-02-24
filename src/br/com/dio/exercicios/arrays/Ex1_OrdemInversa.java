package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int cont = 0;

        while (cont <= (vetor.length-1)) {
            System.out.println(vetor[(vetor.length -1) - cont]);
            cont++;
        }
    }
}

// RESOLUÇÃO DO INSTRUTOR
//
//    int[] vetor = {-5, -6, 15, 50, 8, 4};
//
////System.out.println(vetor.length);
//
//        System.out.print("Vetor: ");
//                int count =0;
//                while(count < (vetor.length)) {
//        System.out.print(vetor[count] + " ");
//        count++;
//        }
//
//        System.out.print("\nVetor: ");
//        for(int i = (vetor.length - 1); i >= 0; i --) {
//        System.out.print(vetor[i] + " ");
//        }