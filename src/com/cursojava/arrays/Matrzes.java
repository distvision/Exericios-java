package com.cursojava.arrays;

public class Matrzes {
  public static void main(String[] args) {
    /**
     * inicicalizacao de Matriz
     * tipo[][] nomedoArray = new tipo[linha][coluna]
     * Com valores definidos
     * tipo[][] nomedoArray = {{10,13,6,7,5}, {45,7,3,76,9}}
     */

    double[][] notasAlunos = new double[3][4];
    notasAlunos[0][0] = 10;
    notasAlunos[0][1] = 7;
    notasAlunos[0][2] = 9;
    notasAlunos[0][3] = 10.8;

    notasAlunos[1][0] = 5;
    notasAlunos[1][1] = 8.5;
    notasAlunos[1][2] = 12;
    notasAlunos[1][3] = 16;

    notasAlunos[2][0] = 8;
    notasAlunos[2][1] = 10;
    notasAlunos[2][2] = 18;
    notasAlunos[2][3] = 12;

    for (int i = 0; i < notasAlunos.length; i++) {
      for (int j = 0; j < notasAlunos[i].length; j++) {
        System.out.print(notasAlunos[i][j] + " ");
      }
      System.out.println();
    }

    // Mudando o valor da nota
    notasAlunos[1][3] = 18;

    System.out.println();
    for (int i = 0; i < notasAlunos.length; i++) {
      for (int j = 0; j < notasAlunos[i].length; j++) {
        System.out.print(notasAlunos[i][j] + " ");
      }
      System.out.println();
    }

    // Calculando a media de nota de cada aluno
    System.out.println("Calculando a media de cada aluno");

    double soma;
    for (int i = 0; i < notasAlunos.length; i++) {

      soma = 0;
      for (int j = 0; j < notasAlunos[i].length; j++) {
        soma += notasAlunos[i][j];
      }
      System.out.println("Media do aluno " + i + "é: " + (soma / 4));
    }

  }
}
