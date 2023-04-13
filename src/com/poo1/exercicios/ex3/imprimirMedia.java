package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class imprimirMedia {
  public static void main(String[] args) {
    System.out.println("digite os 3 numeros");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int soma = num1 + num2 + num3;
    int media = soma / 2;
    System.out.println("A media é:" + media);
    sc.close();
  }
}
