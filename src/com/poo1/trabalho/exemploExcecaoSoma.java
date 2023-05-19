package com.poo1.trabalho;

import java.util.Scanner;

public class exemploExcecaoSoma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = 1;
    System.out.println("digite o segundo numero");
    int num2 = sc.nextInt();

    int soma = num1 + num2;
    System.out.println("soma é: " + soma);
    sc.close();
  }
}
