package com.cursojava.arrays;

public class matriz3dim {
  public static void main(String[] args) {
    int[][][] matriz3d = new int[3][3][3];

    for (int i = 0; i < matriz3d.length; i++) {
      for (int j = 0; j < matriz3d[i].length; j++) {
        for (int k = 0; k < matriz3d[i][j].length; k++) {
          matriz3d[i][j][k] = i + j + k;
          System.out.println("i = " + i + " ; j = " + j + " ; k " + k);
        }
      }
    }

    int soma = 0;
    int somaPares = 0;
    int somaIpares = 0;
    for (int i = 0; i < matriz3d.length; i++) {
      for (int j = 0; j < matriz3d[i].length; j++) {
        for (int k = 0; k < matriz3d[i][j].length; k++) {
          soma += matriz3d[i][j][k];

          if (matriz3d[i][j][k] % 2 == 0) {
            somaPares += matriz3d[i][j][k];
          } else {
            somaIpares += matriz3d[i][j][k];
          }
        }
      }
    }

    System.out.println("A soma total é: " + soma);
    System.out.println("A soma do Pares é: " + somaPares);
    System.out.println("A soma dos Impares é: " + somaIpares);

  }
}
