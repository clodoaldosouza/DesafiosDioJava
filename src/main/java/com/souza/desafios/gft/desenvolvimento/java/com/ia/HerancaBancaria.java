package com.souza.desafios.gft.desenvolvimento.java.com.ia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancaria {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancariaHeranca {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancariaHeranca(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancariaHeranca {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}