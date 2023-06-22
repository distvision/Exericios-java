package com.poo1.preparacao.exames;

import java.util.Scanner;

public class palindromo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String palavra = sc.nextLine();
    String palavraInvertida = "";

    for (int i = palavra.length() - 1; i >= 0; i--) {
      palavraInvertida += palavra.charAt(i);
    }

    if (palavra.equalsIgnoreCase(palavraInvertida)) {
      System.out.println(palavra + " é um palíndromo.");
    } else {
      System.out.println(palavra + " não é um palíndromo.");
    }

    sc.close();
  }
}
