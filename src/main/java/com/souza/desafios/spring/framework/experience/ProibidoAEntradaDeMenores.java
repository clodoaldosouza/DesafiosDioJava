package com.souza.desafios.spring.framework.experience;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class ProibidoAEntradaDeMenores {

    public static void main(String[] args) {
        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String string = scan.nextLine();

        //quebra string em várias substrings a partir de um caracter
        //String[] s = string.split(" ");

        double[] idade = new double[N];

        for (int i = 0; i < N; i++) {
            string = scan.nextLine();
            idade[i] = Integer.parseInt(string);
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++) {
            if (idade[i] < 18) {
                System.out.println((int) idade[i]);
            }
        }
    }
}
