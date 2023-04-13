package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class aprovadoReprovado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite as notas");

    int nota1 = sc.nextInt();
    int nota2 = sc.nextInt();
    int nota3 = sc.nextInt();

    int media = (nota1 + nota2 + nota3) / 2;

    if (media >= 10) {
      System.out.println("Aprovado com media: " + media);
    } else {
      System.out.println("Reprovado com media: " + media);
    }

    sc.close();
  }
}
