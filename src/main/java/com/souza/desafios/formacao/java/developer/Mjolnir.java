package com.souza.desafios.formacao.java.developer;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class Mjolnir {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();

        for (int i = 0; i < C; i++) {
            String nome = leitor.next();
            int N = leitor.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        leitor.close();
    }
}
