package com.souza.desafios.formacao.java.developer;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class EntradaESaidaLendoEPulandoNomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
            if (i == 2 || i == 6 || i == 8) {
                System.out.println(nomes[i]); // O espaço em branco deve ser preenchido com "nomes"
            }
        }
    }
}
