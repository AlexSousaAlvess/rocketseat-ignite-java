package br.com.alexsousa.gestao_vagas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrimeiroTeste {
    @Test
    public void deve_ser_possivel_calcular_dois_numeros(){
        var result = calculate(2, 3);
        assertEquals(result, 4);
    }

    @Test
    public void validar_valor_incorreto(){
        var result = calculate(2,3);
        assertNotEquals(result, 5);
    }
    public static double calculate(double num1, double num2){
        return num1 + num2;
    }


}
