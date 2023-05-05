package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class stringsRegex {

  public static int contarNomes(String nomeCompleto) {
    String[] qtdNomes = nomeCompleto.split("\\s+");
    return qtdNomes.length;
  }

  public static String transfIniciais(String nomeCompleto) {
    String[] qtdNomes = nomeCompleto.split("\\s+");
    String nomeformatado = "";
    for (String nome : qtdNomes) {
      nomeformatado += " " + nome.substring(0, 1).toUpperCase() + nome.substring(1);
    }
    return nomeformatado.trim();
  }

  public static String todasMaiusculas(String nomeCompleto) {
    String[] qtdNomes = nomeCompleto.split("\\s+");
    String nomeformatado = "";
    for (String nome : qtdNomes) {
      nomeformatado += " " + nome.toUpperCase();
    }
    return nomeformatado.trim();
  }

  public static String todasMinusculas(String nomeCompleto) {
    String[] qtdNomes = nomeCompleto.split("\\s+");
    String nomeformatado = "";
    for (String nome : qtdNomes) {
      nomeformatado += " " + nome.toLowerCase();
    }
    return nomeformatado.trim();
  }

  public static String subLetrasInternas(String nomeCompleto) {
    String[] qtdNomes = nomeCompleto.split("\\s+");
    String nomeformatado = "";
    for (String nome : qtdNomes) {
      nomeformatado += " " + nome.substring(0, 1).toUpperCase()
          + nome.substring(1, nome.length() - 1).replaceAll("\\w", "#")
          + nome.substring(nome.length() - 1).charAt(0);
    }
    return nomeformatado.trim();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o nome completo: ");
    String nomeCompleto = sc.nextLine();

    int QuantidadeNomes = contarNomes(nomeCompleto);
    System.out.println("O Aluno tem: " + QuantidadeNomes + " Nomes");

    String inicialFormatada = transfIniciais(nomeCompleto);
    System.out.println("Nome completo inicial formatado: " + inicialFormatada);

    String maiusculas = todasMaiusculas(nomeCompleto);
    System.out.println("Nome completo em maiusculas: " + maiusculas);

    String minusculas = todasMinusculas(nomeCompleto);
    System.out.println("Nome completo em maiusculas: " + minusculas);

    String substituirletras = subLetrasInternas(nomeCompleto);
    System.out.println("Nome completo: " + substituirletras);

    sc.close();
  }
}