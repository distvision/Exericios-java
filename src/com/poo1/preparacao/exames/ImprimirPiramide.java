package com.poo1.preparacao.exames;

public class ImprimirPiramide {
  public static void main(String[] args) {
    int linhas = 5;

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < linhas - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
