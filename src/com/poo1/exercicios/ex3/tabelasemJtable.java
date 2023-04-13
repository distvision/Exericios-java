package com.poo1.exercicios.ex3;

import java.util.Scanner;

public class tabelasemJtable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome1, nome2, nome3;
    int idade1, idade2, idade3;

    System.out.print("Digite o nome e a idade do primeiro aluno: ");
    nome1 = sc.next();
    idade1 = sc.nextInt();

    System.out.print("Digite o nome e a idade do segundo aluno: ");
    nome2 = sc.next();
    idade2 = sc.nextInt();

    System.out.print("Digite o nome e a idade do terceiro aluno: ");
    nome3 = sc.next();
    idade3 = sc.nextInt();

    System.out.println("----------------------");
    System.out.println("|  dados dos Alunos  |");
    System.out.println("----------------------");
    System.out.println("|   Nome   |  Idade  |");
    System.out.println("----------------------");
    System.out.printf("|%10s|%9d|\n", nome1, idade1);
    System.out.printf("|%10s|%9d|\n", nome2, idade2);
    System.out.printf("|%10s|%9d|\n", nome3, idade3);
    System.out.println("----------------------");

    sc.close();
  }
}
