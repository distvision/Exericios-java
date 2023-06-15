package com.cursojava.arrays.exercicios;

import java.util.Scanner;

public class exer12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("Digite o valore da posiçao " + i + " ");
      vetorA[i] = sc.nextInt();
    }

    int soma = 0;
    for (int i = 0; i < vetorA.length; i++) {
      soma += vetorA[i]; // soma = soma + vetorA[i];
    }

    System.out.print("VetorA = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println();

    System.out.print("Soma: " + soma);

    sc.close();
  }
}
