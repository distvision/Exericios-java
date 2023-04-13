package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class soma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite o primneiro numero");
    int num1 = sc.nextInt();
    System.out.println("digite o segundo numero");
    int num2 = sc.nextInt();

    int soma = num1 + num2;
    System.out.println("soma é: " + soma);
    sc.close();
  }
}
