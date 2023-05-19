package com.poo1.preparacao.testes;

public class exemplo {
  public static void main(String[] args) {
    // // chamada do método
    recursivo(10);
  }

  public static void recursivo(int i) {
    while (i != 0) {
      // incrementa a variável i em 1
      i = i + 1;
      // método recursivo chamado
      recursivo(i);
    }
  }
}
