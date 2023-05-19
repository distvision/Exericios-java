package com.poo1.trabalho;

public class exemploErro {
  public static void main(String[] args) {
    // chamada do método
    meuMetodo(10);
  }

  public static void meuMetodo(int i) {
    while (i != 0) {
      // incrementa a variável i em 1
      i = i + 1;
      // método recursivo chamado
      meuMetodo(i);
    }
  }
}
