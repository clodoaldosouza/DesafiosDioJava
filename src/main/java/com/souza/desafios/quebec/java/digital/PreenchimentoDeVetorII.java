package com.souza.desafios.quebec.java.digital;
// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner;

public class PreenchimentoDeVetorII {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

        // TODO: Implemente uma condição onde possamos preencher o vetor de N.
        // Lembre-se a sequência de valores é de 0 até T-1:
        //int[]     =   {           };

        for (int i = 0; i < 1000; ) {
            for (int j = 0; j < t; j++) {
                if (t >= 2 && t <= 50 && i < 1000) {
                    System.out.println("N[" + i + "] = " + j);
                    i++;
                }
            }
        }
    }
}
