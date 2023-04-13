package com.poo1.exercicios.ex2;

import java.util.Scanner;

public class retangulo {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Digite as dimensoes da base");
      int base = sc.nextInt();
      System.out.println("Digite as dimensoes da largura");
      int largura = sc.nextInt();

      int area = base * largura;
      System.out.println(area);
    }
  }
}
