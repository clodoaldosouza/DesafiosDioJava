package com.souza.desafios.gft.desenvolvimento.java.com.ia;

import java.util.Scanner;

public class ControleDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                limiteDiario -= valorSaque; // Atualiza o saldo diário
                System.out.printf("Saque realizado. Limite restante: %.1f%nTransacoes encerradas.", limiteDiario);
                break;
            }
        }
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
