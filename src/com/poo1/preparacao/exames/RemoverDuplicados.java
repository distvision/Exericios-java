package com.poo1.preparacao.exames;

public class RemoverDuplicados {
  public static void main(String[] args) {
    int[] vetor = { 1, 2, 3, 4, 2, 5, 6, 1, 3, 4 };

    System.out.print("Vetor original: ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();

    int tamanho = vetor.length;

    for (int i = 0; i < tamanho; i++) {
      for (int j = i + 1; j < tamanho; j++) {
        if (vetor[i] == vetor[j]) {
          vetor[j] = vetor[tamanho - 1];
          tamanho--;
          j--;
        }
      }
    }

    int[] vetorSemDuplicatas = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
      vetorSemDuplicatas[i] = vetor[i];
    }

    System.out.print("Vetor sem duplicatas: ");
    for (int i = 0; i < vetorSemDuplicatas.length; i++) {
      System.out.print(vetorSemDuplicatas[i] + " ");
    }
  }
}
