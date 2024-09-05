package com.souza.desafios.gft.desenvolvimento.java.com.ia;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RegistroDeTransacoesBancariasTest {
    private RegistroDeTransacoesBancarias instance;

    @BeforeEach
    public void setup() {
        instance = new RegistroDeTransacoesBancarias();
    }

    @Test
    @Order(1)
    public void deveRealizarPrimeiroCenario_retornarIguais() {
        String entradaAutomatizada = "2500\n2\nd\n100\ns\n500\n";
        InputStream inputStream = new ByteArrayInputStream(entradaAutomatizada.getBytes());
        ByteArrayOutputStream suaSaida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(suaSaida));
        PrintStream saidaImpressa = System.out;
        System.setIn(inputStream);
        instance.main(null);
        String saidaEsperada = "Saldo: 2100.0\n" +
                "Transacoes:\n" +
                "1. Deposito de 100.0\n" +
                "2. Saque de 500.0\n";
        assertEquals(saidaEsperada, suaSaida.toString()
                .replaceAll("\r\n", "\n")
                .replaceAll(",", "."));
        System.setOut(saidaImpressa);
    }

    @Test
    @Order(2)
    public void deveRealizarSegundoCenario_retornarIguais() {
        String entradaAutomatizada = "900\n1\ns\n100";
        InputStream inputStream = new ByteArrayInputStream(entradaAutomatizada.getBytes());
        ByteArrayOutputStream suaSaida = new ByteArrayOutputStream();
        PrintStream saidaImpressa = System.out;
        System.setOut(new PrintStream(suaSaida));

        System.setIn(inputStream);
        instance.main(null);
        String saidaEsperada = "Saldo: 800.0\n" +
                "Transacoes:\n" +
                "1. Saque de 100.0\n";
        assertEquals(saidaEsperada, suaSaida.toString()
                .replaceAll("\r\n", "\n")
                .replaceAll(",", "."));
        System.setOut(saidaImpressa);
    }

    @Test
    @Order(3)
    public void deveRealizarTerceiroCenario_retornarIguais() {
        String entradaAutomatizada = "0\n0\n";
        InputStream inputStream = new ByteArrayInputStream(entradaAutomatizada.getBytes());
        PrintStream saidaImpressa = System.out;
        ByteArrayOutputStream suaSaida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(suaSaida));

        System.setIn(inputStream);
        instance.main(null);
        String saidaEsperada = "Saldo: 0.0\n" +
                "Transacoes:\n";

        assertEquals(saidaEsperada, suaSaida.toString()
                .replaceAll("\r\n", "\n")
                .replaceAll(",", "."));
        System.setOut(saidaImpressa);
    }
}