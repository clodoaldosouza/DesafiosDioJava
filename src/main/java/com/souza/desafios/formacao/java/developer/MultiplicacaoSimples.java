package com.souza.desafios.formacao.java.developer;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B; //implemente o código que representa a multiplicação.
        System.out.println("PROD = " + PROD);
        sc.close();
    }
}
