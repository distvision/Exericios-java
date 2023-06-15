package com.cursojava.arrays;

import java.util.Scanner;

public class ArraysIrregulares {
  public static void main(String[] args) {
    /**
     * Inicializacao
     * tipo[][] nomeDoArray = new tipo[3][]
     * nomeDoArray[0] = new tipo[1]; | primeira linha => 1 coluna
     * nomeDoArray[1] = new tipo[2]; | segunda linha => 2 colunas
     * nomeDoArray[2] = new tipo[3]; | terceira linha => 3 colunas
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numero de pessoas a serem entrevistadas:");
    int numEntrevistados = sc.nextInt();

    String[][] nomeFilhos = new String[numEntrevistados][];

    for (int i = 0; i < nomeFilhos.length; i++) {
      System.out.print("Digite a quantidade de filhos da pessoa " + (i + 1) + " ");
      int qtdFilhos = sc.nextInt();

      nomeFilhos[i] = new String[qtdFilhos];

      for (int j = 0; j < nomeFilhos[i].length; j++) {
        System.out.println("Digite o nome do filho " + (j + 1));
        nomeFilhos[i][j] = sc.next();
      }
    }

    for (int i = 0; i < nomeFilhos.length; i++) {
      System.out.println("Pessoa " + (i + 1) + " tem " + nomeFilhos[i].length + "filhos");
      for (int j = 0; j < nomeFilhos[i].length; j++) {
        System.out.println(nomeFilhos[i][j]);
      }
    }

    sc.close();
  }
}
