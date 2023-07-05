package com.poo1.preparacao.exames;

public class PrintCharacters {
  public static void main(String[] args) {
    // Imprime caracteres de A a Z
    System.out.println("Caracteres de A a Z:");
    for (char c = 'A'; c <= 'Z'; c++) {
      System.out.print(c + " ");
    }

    System.out.println(); // Pula uma linha

    // Imprime caracteres de a a z
    System.out.println("Caracteres de a a z:");
    for (char c = 'a'; c <= 'z'; c++) {
      System.out.print(c + " ");
    }
  }
}