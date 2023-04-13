package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class parOuImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o numero");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("O Numero " + numero + " é Par");
    } else {
      System.out.println("O numero " + numero + " é Impar");
    }
    sc.close();
  }
}
