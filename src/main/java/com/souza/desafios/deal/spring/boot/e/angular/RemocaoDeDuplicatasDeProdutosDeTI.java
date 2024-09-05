package com.souza.desafios.deal.spring.boot.e.angular;

import java.util.*;

public class RemocaoDeDuplicatasDeProdutosDeTI {

    public static List<String> removerDuplicados(List<String> produtos) {
        Set<String> vistos = new HashSet<>();

        List<String> resultado = new ArrayList<>();

        for (String produto : produtos) {

            String produtoLower = produto.toLowerCase();

            if (!vistos.contains(produtoLower)) {

                resultado.add(produto);
                vistos.add(produtoLower);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> produtos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String produto = scanner.nextLine();
            produtos.add(produto);
        }

        // TODO: Chamar a função removerDuplicados e armazenar o resultado:
        List<String> produtosUnicos = removerDuplicados(produtos);

        System.out.println("Produtos unicos:");
        // TODO: Implemente o loop for para imprimir cada produto na lista produtosUnicos:
        for (String produtoUnico : produtosUnicos) {
            System.out.println(produtoUnico);
        }

        scanner.close();
    }
}
