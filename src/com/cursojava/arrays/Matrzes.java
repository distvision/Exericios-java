// instrução 1;  
// instrução 2;  
// instrução 3;  
// instrução 4;  
// instrução 5;//exception occurs  
// instrução 6;  
// instrução 7;  
// instrução 8;  
// instrução 9;  
// instrução 10;

package com.cursojava.arrays;

public class Matrzes {
  public static void main(String[] args) {
    /**
     * inicicalizacao de arrays
     * tipo[][] nomedoArray = new tipo[linha][coluna]
     */
    double[][] notasAlunos = new double[2][4];
    notasAlunos[0][0] = 10;
    notasAlunos[0][1] = 7;
    notasAlunos[0][2] = 9;
    notasAlunos[0][3] = 10.8;

    notasAlunos[1][0] = 5;
    notasAlunos[1][1] = 8.5;
    notasAlunos[1][2] = 12;
    notasAlunos[1][3] = 16;

    for (int i = 0; i < notasAlunos.length; i++) {
      for (int j = 0; j < notasAlunos[i].length; j++) {
        System.out.print(notasAlunos[i][j] + " ");
      }
      System.out.println();
    }
  }
}
