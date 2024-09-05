package com.souza.desafios.quebec.java.digital;

// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class ContandoNumerosPares {

    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int count = 0;

        for (int i = 1; i <= num; i++) {
            String strNum = String.valueOf(i);
            if (strNum.length() == 1) {
                if (i % 2 == 0) {
                    count++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            int sum = 0;
            for (int j = 0; j < vs.length; j++) {
                sum += (int) Character.getNumericValue(vs[j]);
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
