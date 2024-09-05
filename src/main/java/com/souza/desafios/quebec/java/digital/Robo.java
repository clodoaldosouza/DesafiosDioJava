package com.souza.desafios.quebec.java.digital;

// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class Robo {

    public static void main(String[] args) {
        String movimentos = new Scanner(System.in).nextLine();

        int x = 0;  // var x = 0;
        int y = 0;  // var y = 0;

        // TODO: Implemente os movimentos do Robô e verifique sua posição:

        for (int i = 0; i < movimentos.length(); i++) {
            char ch = movimentos.charAt(i);
            if (ch == 'W') {
                x++;
            }
            if (ch == 'S') {
                x--;
            }
            if (ch == 'D') {
                y++;
            }
            if (ch == 'A') {
                y--;
            }
        }
        System.out.print((x == 0 && y == 0) ? "true" : "false");
    }
}
