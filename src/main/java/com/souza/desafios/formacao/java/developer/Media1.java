package com.souza.desafios.formacao.java.developer;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        //TODO: Complete os espaços em branco com uma possível solução para o desafio
        media = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", media);
        sc.close();
    }
}
