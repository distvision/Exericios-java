package com.cursojava.arrays.exercicios;

public class ElementosIguais2 {
  public static void main(String[] args) {
    int[] A = new int[8];
    int[] B = new int[8];
    A[0] = 31;
    A[1] = 35;
    A[2] = 37;
    A[3] = 34;
    A[4] = 33;
    A[5] = 12;
    A[6] = 22;
    A[7] = 18;

    for (int i = 0; i < B.length; i++) {
      B[i] = A[i] * 2;
      System.out.println("B " + B[i]);
    }
  }
}
