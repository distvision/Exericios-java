package com.cursojava.arrays.exercicios;

import java.util.Scanner;

public class exerc14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o valor da posiçao " + i + ": ");
      vetorA[i] = sc.nextInt();
    }

    int soma = 0;
    int ipares = 0;
    for (int i = 0; i < vetorA.length; i++) {
      if (vetorA[i] % 2 != 0) {
        soma += vetorA[i];
        ipares++;
      }
    }

    System.out.print("Soma: " + soma);
    System.out.print("Media: " + (soma / ipares));
    System.out.println();

    System.out.print("vetorA = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }

    sc.close();
  }
}
