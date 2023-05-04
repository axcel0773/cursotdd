package com.curso;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


public class PrimeiroTeste {
    Calculadora calculadora;
    int numero1 = 10, numero2 = 5;



    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomar2Numeros() {
        //cenario

        //execução
        int resultado = calculadora.somar(numero1, numero2);

        //verificações
        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativos() {
        //cenario
        int num1 = -10, num2 = 5;

        //execução
        calculadora.somar(num1, num2);
        //verificações
    }

    @Test
    public void deveSubtrair2Numeros(){
        //EXECUÇÃO
        int resultado = calculadora.subtrair(numero1, numero2);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(5);
    }

    @Test
    public void deveMultiplicar2Numeros(){
        //execução
        int resultado = calculadora.multiplicar(numero1,numero2);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(50);
    }

    @Test
    public void deveDividir2Numeros(){
        //execução
        int resultado = calculadora.divisao(numero1, numero2);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(2);
    }

    @Test(expected = ArithmeticException.class)
    public void naoDeveDividirPorZero(){
        //cenario
        int numero1 = 10, numero2 = 0;

        //execução
        calculadora.divisao(numero1, numero2);

    }
}

class Calculadora {
    int somar(int num, int num2) {
        if (num < 0 || num2 < 0){
            throw new RuntimeException("Não é possível somar números negativos.");
        }
        return num + num2;
    }

    int subtrair(int num, int num2){
        return num - num2;
    }

    int multiplicar(int num, int num2){
        return num * num2;
    }

    int divisao(int num, int num2){
        return num / num2;
    }
}
