package com.souza.desafios.deal.spring.boot.e.angular;

import java.util.Scanner;

public class CpuTemperatureMonitor {
    public static String findHighestTemperature(String input) {
        String[] readings = input.split(",");
        int maxTemperature = Integer.MIN_VALUE;

        for (String reading : readings) {
            int temperature = Integer.parseInt(reading.trim());
            // TODO: Comparar a temperatura convertida com maxTemperature e atualizar maxTemperature se a leitura atual for maior.

        }

        // TODO: Retorne a maior temperatura:

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = findHighestTemperature(input);
        System.out.println(output);
    }
}