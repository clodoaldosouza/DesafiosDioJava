package com.souza.desafios.spring.framework.experience;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class MediasPonderadas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double mediaPoderada = (2 * a + 3 * b + 5 * c) / (2 + 3 + 5);
            System.out.printf("%.1f\n", mediaPoderada);

            cont++;
        }
    }
}
