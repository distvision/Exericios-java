package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class triangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os numeros do lado");
    int lado1 = sc.nextInt();
    int lado2 = sc.nextInt();
    int lado3 = sc.nextInt();

    if (lado1 == lado2 && lado1 == lado3) {
      System.out.println("Este é um triângulo equilátero.");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      System.out.println("Este é um triângulo isósceles.");
    } else {
      System.out.println("Este é um triângulo escaleno.");
    }

    sc.close();
  }
}
