package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class IdadesEmOrdem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome1, nome2, nome3, nome4;
    int idade1, idade2, idade3, idade4;

    System.out.print("Digite o nome e a idade do primeiro aluno: ");
    nome1 = sc.next();
    idade1 = sc.nextInt();

    System.out.print("Digite o nome e a idade do segundo aluno: ");
    nome2 = sc.next();
    idade2 = sc.nextInt();

    System.out.print("Digite o nome e a idade do terceiro aluno: ");
    nome3 = sc.next();
    idade3 = sc.nextInt();

    System.out.print("Digite o nome e a idade do quarto aluno: ");
    nome4 = sc.next();
    idade4 = sc.nextInt();

    sc.nextLine();

    int idadeMaisVelha = idade1;
    int idadeMaisNova = idade1;
    // int idadeIntermedia = idade1;
    String nomeMaisVelha = nome1;
    String nomeMaisNova = nome1;
    String nomeIntermedio = nome1;

    if (idade2 > idadeMaisVelha) {
      idadeMaisVelha = idade2;
      nomeMaisVelha = nome2;
    } else if (idade2 < idadeMaisNova) {
      idadeMaisNova = idade2;
      nomeMaisNova = nome2;
    }

    if (idade3 > idadeMaisVelha) {
      idadeMaisVelha = idade3;
      nomeMaisVelha = nome3;
    } else if (idade3 < idadeMaisNova) {
      idadeMaisNova = idade3;
      nomeMaisNova = nome3;
    }

    if (idade4 > idadeMaisVelha) {
      idadeMaisVelha = idade4;
      nomeMaisVelha = nome4;
    } else if (idade4 < idadeMaisNova) {
      idadeMaisNova = idade4;
      nomeMaisNova = nome4;
    }

    System.out.println("A pessoa mais velha é: " + nomeMaisVelha);
    System.out.println("A pessoa mais nova é: " + nomeMaisNova);
    System.out.println("A pessoa intermedia é: " + nomeIntermedio);

    sc.close();
  }
}
