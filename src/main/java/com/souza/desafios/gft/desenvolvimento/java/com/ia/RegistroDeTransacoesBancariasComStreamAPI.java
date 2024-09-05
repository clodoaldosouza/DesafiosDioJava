package com.souza.desafios.gft.desenvolvimento.java.com.ia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroDeTransacoesBancariasComStreamAPI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a Entrada que informa o saldo inicial da conta
        double saldo = scanner.nextDouble();

        // Lê a Entrada com a quantidade total de transações
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            // Lê a Entrada com o valor da transação
            double valorTransacao = scanner.nextDouble();

            // Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
            } else {
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibir o saldo final
        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(transacao -> String.format("%s de %.1f",
                        Character.toLowerCase(transacao.getTipo()), transacao.getValor()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
