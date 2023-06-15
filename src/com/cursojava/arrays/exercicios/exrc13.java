package com.cursojava.arrays.exercicios;

import java.util.Scanner;

public class exrc13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("digite o valor de posicao " + i + ": ");
      vetorA[i] = sc.nextInt();
    }

    int soma = 0;
    for (int i = 0; i < vetorA.length; i++) {
      if (vetorA[i] % 5 == 0) {
        soma += vetorA[i];
      }
    }

    System.out.print("soma: " + soma);
    System.out.println();

    System.out.print("vetorA = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }

    sc.close();
  }
}
