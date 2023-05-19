package com.cursojava.arrays.exercicios;

public class ElementosIguais {
  public static void main(String[] args) {
    int[] A = new int[5];
    int[] B = new int[5];
    A[0] = 31;
    A[1] = 35;
    A[2] = 37;
    A[3] = 34;
    A[4] = 33;

    for (int i = 0; i < A.length; i++) {
      B[i] = A[i];
      System.out.println(B[i]);
    }

  }
}
