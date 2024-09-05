package com.souza.desafios.deal.spring.boot.e.angular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEndpointsDeAPI {
    public static String validateEndpoint(String endpoint) {
        // TODO: Verifique se o endpoint fornecido segue o formato padrão de endpoint de API:
        String regex = "^/api/\\w+(?:/\\w+)*$";

        // Compila a expressão regular em um padrão
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(endpoint);

        return matcher.matches() ? "Endpoint valido." : "Endpoint invalido.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }
}
