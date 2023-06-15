package com.cursojava.matrizes.exercicios;

import java.util.Random;

public class exer1 {
  public static void main(String[] args) {
    /**
     * Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0-9.
     * Apos isso determina o maior numero da matriz e sua posiçao (linha, coluna).
     */

    int[][] numAleatorios = new int[4][4];

    Random numeroRandom = new Random();

    for (int i = 0; i < numAleatorios.length; i++) {
      for (int j = 0; j < numAleatorios[i].length; j++) {
        numAleatorios[i][j] = numeroRandom.nextInt(100);
      }
    }

    int maior = 0;
    int linha = 0;
    int col = 0;

    for (int i = 0; i < numAleatorios.length; i++) {
      for (int j = 0; j < numAleatorios[i].length; j++) {
        if (numAleatorios[i][j] > maior) {
          maior = numAleatorios[i][j];
          linha = i;
          col = j;
        }
      }
    }

    for (int i = 0; i < numAleatorios.length; i++) {
      for (int j = 0; j < numAleatorios[i].length; j++) {
        System.out.print(numAleatorios[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Maior valor " + maior);
    System.out.println("linha " + linha);
    System.out.println("coluna " + col);

  }
}
