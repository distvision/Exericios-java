package com.poo1.trabalho;

public class throwsException {
  public static void main(String[] args) {
    try {
      // Chamada de um método que declara "throws Exception"
      metodoQueLancaException();
    } catch (Exception e) {
      // Captura a exceção e trata-a
      System.out.println("Ocorreu uma exceção: " + e.getMessage());
    }
  }

  public static void metodoQueLancaException() throws Exception {
    // Algum código que pode gerar uma exceção
    throw new Exception("Exceção lançada!");
  }
}
