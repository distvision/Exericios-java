package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class imprimirNome {
  public static void main(String[] args) {
    System.out.println("Escreva o nome");
    Scanner sc = new Scanner(System.in);
    String nome = sc.nextLine();
    System.out.println("O nome é:" + nome);
    sc.close();
  }
}
