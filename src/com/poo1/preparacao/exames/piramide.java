package com.poo1.preparacao.exames;

import java.util.Scanner;

public class piramide {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("digite o tamanho da piramide");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("# ");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      for (int j = i; j < n; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }

    System.out.println("invertido");

    for (int i = 0; i <= n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print("# ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }

    System.out.println("Piramide");
    System.out.println();

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print("--");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(" *");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }

    System.out.println("piramide invertida");
    System.out.println();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("--");
      }
      for (int j = i; j < n; j++) {
        System.out.print(" *");
      }
      for (int j = i; j < n - 1; j++) {
        System.out.print(" 0");
      }
      System.out.println();
    }

    System.out.println("Piramide espelhada");
    System.out.println();

    for (int i = 1; i < n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print("--");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(" *");
      }
      for (int j = 1; j < i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("--");
      }
      for (int j = i; j <= n; j++) {
        System.out.print(" *");
      }
      for (int j = i; j <= n - 1; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }

    sc.close();

  }
}
