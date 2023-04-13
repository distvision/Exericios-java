package com.poo1.exercicios.ex2;

import java.util.Scanner;

public class idade {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
      System.out.print("Digite a idade em anos: ");
      int anos = entrada.nextInt();

      System.out.print("Digite a idade em meses: ");
      int meses = entrada.nextInt();

      System.out.print("Digite a idade em dias: ");
      int dias = entrada.nextInt();

      int idadeEmDias = anos * 365 + meses * 30 + dias;

      System.out.println("A idade em dias é: " + idadeEmDias);
    }
  }
}
