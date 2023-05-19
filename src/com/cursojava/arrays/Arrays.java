package com.cursojava.arrays;

public class Arrays {
  public static void main(String[] args) {
    // double tempDia001 = 31.1;
    // double tempDia002 = 35;
    // double tempDia003 = 37.7;
    // double tempDia004 = 34;
    // double tempDia005 = 33.5;

    /**
     * inicicalizacao de arrays
     * tipo[] nomedoArray = new tipo[tamanho_do_array]
     */

    double[] temperaturas = new double[365];
    temperaturas[0] = 31.1;
    temperaturas[1] = 35;
    temperaturas[2] = 37.7;
    temperaturas[3] = 34;
    temperaturas[4] = 33.5;

    System.out.println("O valar da tem no dia 1 é: " + temperaturas[0]);

    System.out.println("qual é o tamanho do array: " + temperaturas.length);

    // for (int i = 0; i < temperaturas.length; i++) {
    // System.out.println("temp no dia " + (i + 1) + " é: " + temperaturas[i]);
    // }

    for (double temp : temperaturas) {
      System.out.println(temp);
    }
  }

}
