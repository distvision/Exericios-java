package com.poo1.trabalho;

class MinhaExcecao extends Exception {
  public MinhaExcecao(String mensagem) {
    super(mensagem);
  }
}

public class ExemploExcecaoPersonalizada {
  public static void main(String[] args) {
    try {
      verificarIdade(15);
    } catch (MinhaExcecao e) {
      System.out.println("Exceção capturada: " + e.getMessage());
    }
  }

  public static void verificarIdade(int idade) throws MinhaExcecao {
    if (idade < 18) {
      throw new MinhaExcecao("Você é menor de idade!");
    } else {
      System.out.println("Você é maior de idade!");
    }
  }
}
