package com.souza.desafios.claro.java.com.spring.boot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoDeConsumoDeDadosMoveisTest {

    @Test
    public void testCalcularConsumoTotal() {
        String[] consumoSemanal = {"2064", "4000", "2000", "3200"};
        int totalConsumo = CalculoDeConsumoDeDadosMoveis.calcularConsumoTotal(consumoSemanal);
        int mediaSemanal = CalculoDeConsumoDeDadosMoveis.calcularMediaSemanal(totalConsumo, 4);
        int semanaDeMaiorConsumo = CalculoDeConsumoDeDadosMoveis.identificarSemanaDeMaiorConsumo(consumoSemanal);
        assertEquals(11264, totalConsumo);
        assertEquals(2816, mediaSemanal);
        assertEquals(2, semanaDeMaiorConsumo);
    }

    @Test
    public void testCalcularConsumoTotalOutro() {
        String[] consumoSemanal = {"5000", "4880", "4600", "6000"};
        int totalConsumo = CalculoDeConsumoDeDadosMoveis.calcularConsumoTotal(consumoSemanal);
        int mediaSemanal = CalculoDeConsumoDeDadosMoveis.calcularMediaSemanal(totalConsumo, 4);
        int semanaDeMaiorConsumo = CalculoDeConsumoDeDadosMoveis.identificarSemanaDeMaiorConsumo(consumoSemanal);
        assertEquals(20480, totalConsumo);
        assertEquals(5120, mediaSemanal);
        assertEquals(4, semanaDeMaiorConsumo);
    }

    @Test
    public void testCalcularConsumoTotalOutro2() {
        String[] consumoSemanal = {"4000", "4456", "6000", "5000"};
        int totalConsumo = CalculoDeConsumoDeDadosMoveis.calcularConsumoTotal(consumoSemanal);
        int mediaSemanal = CalculoDeConsumoDeDadosMoveis.calcularMediaSemanal(totalConsumo, 4);
        int semanaDeMaiorConsumo = CalculoDeConsumoDeDadosMoveis.identificarSemanaDeMaiorConsumo(consumoSemanal);
        assertEquals(19456, totalConsumo);
        assertEquals(4864, mediaSemanal);
        assertEquals(3, semanaDeMaiorConsumo);
    }
}