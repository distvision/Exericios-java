package com.poo1.preparacao.testes;

import java.util.Scanner;

public class minusculos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o nome: ");
    String nome = sc.nextLine();

    String nomeAlterado = nome.toUpperCase();

    System.out.println("O nome é" + nomeAlterado);
    sc.close();
  }
}
