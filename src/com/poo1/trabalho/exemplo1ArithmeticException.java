package com.poo1.trabalho;

public class exemplo1ArithmeticException {
  public static void main(String[] args) {
    try {
      int divisao = 50 / 0;
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    System.out.println("texto impresso depois da exceçao");
  }
}
