package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class triangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os numeros do lado");
    int lad1 = sc.nextInt();
    int lad2 = sc.nextInt();
    int lad3 = sc.nextInt();

    if (lad1 != lad2 && lad1 != lad3 && lad2 != lad3) {
      System.out.println("O tipo de lado é escaleno");
    } else {
      System.out.println("equilatero");
    }

    if ((lad1 == lad2 && lad2 == lad3 && lad1 == lad3) || (lad1 != lad3 && lad2 != lad3 && lad1 != lad2)) {
      System.out.println("isósceles");
    }

    sc.close();
  }
}
