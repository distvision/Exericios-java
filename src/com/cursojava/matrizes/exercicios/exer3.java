package com.cursojava.matrizes.exercicios;

import java.util.Scanner;

public class exer3 {
  public static void main(String[] args) {
    /**
     * Capture do teclado valores para preenchimento de uma matriz M 3X3.
     * Após a capture imprima a matriz criada e encontre a quantidade de números
     * pares, a quantidade de números ímpares.
     */

    Scanner sc = new Scanner(System.in);

    int[][] matrizM = new int[3][3];

    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        System.out.print("Digite o valor da posicao [" + i + "," + j + "]");
        matrizM[i][j] = sc.nextInt();
      }
    }

    int qtdPares = 0;
    int qtdImpares = 0;
    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        if (matrizM[i][j] % 2 == 0) {
          qtdPares++;
        } // podemos usar apenas o else {qtdImpares++}
        if (matrizM[i][j] % 2 != 0) {
          qtdImpares++;
        }
      }
    }

    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        System.out.print(matrizM[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Os Parese: " + qtdPares);
    System.out.println("Os Imparese: " + qtdImpares);
    sc.close();
  }
}
