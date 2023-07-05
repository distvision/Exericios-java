package com.poo1.preparacao.exames;

public class BinaryTriangle {
  public static void main(String[] args) {
    int numeroLinhas = 4;

    for (int i = 0; i < numeroLinhas; i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
