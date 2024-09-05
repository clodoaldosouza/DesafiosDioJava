package com.souza.desafios.claro.java.com.spring.boot;

import java.util.Arrays;
import java.util.Scanner;

public class VerificacaoDeServicoContratado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];

        // TODO: Verifique se o serviço está na lista de serviços contratados
        boolean contratado = Arrays.stream(partes)
                .anyMatch(s -> s.equalsIgnoreCase(servico));
        System.out.println(contratado ? "Sim" : "Nao");
        scanner.close();
    }
}
