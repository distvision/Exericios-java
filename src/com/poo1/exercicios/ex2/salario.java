package com.poo1.exercicios.ex2;

import java.util.Scanner;

public class salario {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Digite o salário mensal atual: ");
      double salarioAtual = sc.nextDouble();

      System.out.print("Digite o percentual de reajuste: ");
      double percentualReajuste = sc.nextDouble();

      double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

      System.out.println("O novo salário é: " + novoSalario);
    }
  }
}
