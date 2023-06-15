package com.cursojava.arrays;

public class prova {
  public static void main(String[] args) {
    int[] numeros = new int[2];
    numeros[0] = 6;
    numeros[1] = 7;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > numeros[numeros.length - 2] || numeros[i] > numeros[numeros.length - 1]) {
        System.out.println(numeros[i] + " é maior");
      }
      if (numeros[i] < numeros[numeros.length - 2] || numeros[i] < numeros[numeros.length - 1]) {
        System.out.println(numeros[i] + " é menor");
      }
    }
  }
}