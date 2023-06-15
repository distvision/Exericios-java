package com.cursojava.arrays.exercicios;

import java.util.Scanner;

public class exer15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("Digite o valor da posiçao " + i + ": ");
      vetorA[i] = sc.nextInt();
    }

    int impar = 0;
    for (int i = 0; i < vetorA.length; i++) {
      if (vetorA[i] % 2 != 0) {
        impar++;
      }
    }

    int par = vetorA.length - impar;

    /**
     * vetorA.length -> 100%
     * par -> x
     * x * vetorA.length == par * 100
     * x == (par * 100%)/vetorA.length
     */

    double porcentagemPar = (par * 100) / vetorA.length;
    double porcentagemImpar = 100 - porcentagemPar;

    System.out.print("vetorA = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("[" + vetorA[i] + " " + "]");
    }
    System.out.println();

    System.out.println("Porcentagem Par: " + porcentagemPar);
    System.out.println("Porcentagem Impar: " + porcentagemImpar);

    sc.close();
  }
}
