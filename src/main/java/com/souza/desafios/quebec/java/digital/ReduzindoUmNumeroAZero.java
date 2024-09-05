package com.souza.desafios.quebec.java.digital;

// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class ReduzindoUmNumeroAZero {

    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int step = 0; // var step = 0;

        // TODO: Implemente uma condição onde seja possível reduzir o número até 0:
        while (num > 0) {
            if ((num & 1) == 1) {
                step++;
            }
            num /= 2;
            step++;
        }
        System.out.println((step > 0) ? (step - 1) : step);
    }
}