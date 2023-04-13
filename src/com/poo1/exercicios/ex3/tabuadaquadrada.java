package com.poo1.exercicios.ex3;

public class tabuadaquadrada {
  public static void main(String[] args) {
    int idade = 23;

    System.out.println("O quadrado da minha idade é: " + Math.floor(Math.sqrt(idade)));
    for (int i = 0; i <= 6; i++) {
      double tabuada = (i * Math.floor(Math.sqrt(idade)));
      System.out.println(tabuada);
    }
  }
}
