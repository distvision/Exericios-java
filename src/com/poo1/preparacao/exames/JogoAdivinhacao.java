package com.poo1.preparacao.exames;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
  public static void main(String[] args) {
    Random random = new Random();
    int numeroAleatorio = random.nextInt(100) + 1;

    Scanner sc = new Scanner(System.in);
    int palpite = 0;
    int tentativas = 0;

    while (palpite != numeroAleatorio) {
      System.out.print("Adivinhe o número (entre 1 e 100): ");
      palpite = sc.nextInt();
      tentativas++;

      if (palpite < numeroAleatorio) {
        System.out.println("Muito baixo! Tente novamente.");
      } else if (palpite > numeroAleatorio) {
        System.out.println("Muito alto! Tente novamente.");
      } else {
        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
      }
    }
    sc.close();
  }
}
