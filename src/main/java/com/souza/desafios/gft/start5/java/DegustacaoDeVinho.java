package com.souza.desafios.gft.start5.java;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class DegustacaoDeVinho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        //TODO: Complete o código com uma possível solução para o problema.
        int count = 0;
        for (int i = 0; i < respostasCompetidoresSplit.length; i++) {
            if (T.equalsIgnoreCase(respostasCompetidoresSplit[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
