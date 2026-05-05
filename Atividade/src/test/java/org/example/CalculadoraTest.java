package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testeT01somar() {
        assertEquals(5.0, calculadora.somar(2, 3), "A soma de 2 + 3 deve ser 5");

    }

    @Test
    void  testeT02subtrair() {
        assertEquals(3.0, calculadora.subtrair(5, 2), "A subtração de 5 - 2 deve ser 3");
    }
    @Test
    void testeT03multiplicar() {
        assertEquals(10.0, calculadora.multiplicar(5, 2), "A multipllicação de 5 * 2 deve ser 10");
    }

    @Test
    void testeT04dividir() {
        assertEquals(5.0,calculadora.dividir(10, 2), "A divisão de 10 / 2 deve ser 5");
    }

    @Test
    void testeT05divisaoporzero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
        });
        assertEquals("Erro: Divisão por zero não permitida", exception.getMessage());
    }

    @Test
    void testeT06numeronegativo() {
        assertEquals(1.0, calculadora.somar(-2, 3), "A soma de -2 + 3 deve ser 1");
    }

    @Test
    void testeT07numerosdecimais() {
        assertEquals(5.0, calculadora.multiplicar(2.5, 2), "A multiplicação de 2.5 * 2 deve ser 5.0");
    }




}


