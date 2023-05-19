package com.poo1.trabalho;

public class exemplo2NullPointerException {
  public static void main(String[] args) {
    try {
      String s = null;
      s.length();
    } catch (NullPointerException e) {
      // imprimir a excecao
      System.out.println(e);
    }
    System.out.println("texto impresso depois da exceçao");
  }
}
