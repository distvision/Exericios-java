package com.cursojava.arrays.exercicios;

import java.util.Scanner;

public class Exer11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digte o valoor da posiçao " + i);
      vetorA[i] = sc.nextInt();
    }

    int qtdPares = 0;
    /*
     * todas as vezes que o vetor for interado, se o resto do valor de uma
     * determinada posiçao for 0, qtdPares sera incrementado
     */

    for (int i = 0; i < vetorA.length; i++) {
      if (vetorA[i] % 2 == 0) {
        qtdPares++;
      }
    }

    System.out.print("VetorA = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println();

    System.out.println("quanntidades dos numeros pares é " + qtdPares);

    sc.close();
  }
}
