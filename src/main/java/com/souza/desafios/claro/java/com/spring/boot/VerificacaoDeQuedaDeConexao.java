package com.souza.desafios.claro.java.com.spring.boot;

import java.util.Arrays;
import java.util.Scanner;

public class VerificacaoDeQuedaDeConexao {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        boolean tevePerda = Arrays.stream(velocidades)
                .map(Integer::parseInt)
                .anyMatch(velocidade -> velocidade == 0);
         return tevePerda ? "Queda de Conexao" : "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}