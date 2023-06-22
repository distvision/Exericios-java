package com.poo1.preparacao.exames;

public class calcularExpSemMetodos {
  public static void main(String[] args) {

    double valor = Math.pow(2, 3);

    int base = 2;
    int expoente = 3;
    int resultado = 1;

    for (int i = 0; i < expoente; i++) {
      System.out.println(i);
      resultado *= base;
    }

    System.out.println("O resultado da potência é: " + resultado);
    System.out.println("O resultado da potência é: " + valor);
  }
}
