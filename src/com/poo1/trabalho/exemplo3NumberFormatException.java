package com.poo1.trabalho;

public class exemplo3NumberFormatException {
  public static void main(String[] args) {
    try {
      String a = "abc";
      int i = Integer.parseInt(a);
    } catch (NumberFormatException e) {
      System.out.println(e);
    }
    System.out.println("texto impresso depois da exceçao");
  }
}
