package com.poo1.preparacao.testes;

import java.util.Scanner;

public class quadrado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("digite os numeros");
    double lado1 = sc.nextDouble();
    double lado2 = sc.nextDouble();
    // int lado1 = sc.nextInt();
    // int lado2 = sc.nextInt();
    // int lado3 = sc.nextInt();
    // int lado4 = sc.nextInt();
    // if (lado1 == lado2 && lado3 == lado4 && lado2 == lado3)

    if ((Math.pow(lado1, 2) == Math.pow(lado2, 2))) {
      System.out.println(Math.pow(lado1, 2) + " é igual a " + Math.pow(lado2, 2));
      System.out.println("Portanto a figura é um Quadrado");
    } else {
      System.out.println(Math.pow(lado1, 2) + "não é igual a " + Math.pow(lado2, 2));
      System.out.println("Portanto a figura não é um Quadrado");
    }

    sc.close();
  }
}
