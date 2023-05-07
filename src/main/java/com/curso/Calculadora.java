package com.curso;

class Calculadora {
    int somar(int num, int num2) {
        if (num < 0 || num2 < 0) {
            throw new RuntimeException("Não é possível somar números negativos.");
        }
        return num + num2;
    }

    int subtrair(int num, int num2) {
        return num - num2;
    }

    int multiplicar(int num, int num2) {
        return num * num2;
    }

    int divisao(int num, int num2) {
        return num / num2;
    }
}
