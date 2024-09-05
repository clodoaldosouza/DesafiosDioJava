package com.souza.desafios.quebec.java.digital;
// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double total = 0.D;
        for (int i = 0; i < 2; i++) {
            int cod1 = leitor.nextInt();
            int n1 = leitor.nextInt();
            double valor1 = leitor.nextDouble();
            total += (n1 * valor1);
        }
        // TODO: Implemente um Cálculo Simples.
        // Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
