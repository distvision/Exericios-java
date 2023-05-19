package com.poo1.trabalho;

public class exemplo4ArrayIndexOutOfBoundsException {
  public static void main(String[] args) {
    try {
      int[] b = new int[5];
      b[10] = 50;

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    System.out.println("texto impresso depois da exceçao");
  }
}
