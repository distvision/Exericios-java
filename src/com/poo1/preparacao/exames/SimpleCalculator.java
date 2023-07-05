package com.poo1.preparacao.exames;

import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double num1 = sc.nextDouble();

    System.out.print("Digite a operação (+, -, *, /): ");
    char operator = sc.next().charAt(0);

    System.out.print("Digite o segundo número: ");
    double num2 = sc.nextDouble();

    double result = 0;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("Erro: divisão por zero!");
          return;
        }
        break;
      default:
        System.out.println("Operação inválida!");
        return;
    }

    System.out.println("Resultado: " + result);
  }
}
