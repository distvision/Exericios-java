package com.cursojava.matrizes.exercicios;

import java.util.Scanner;

public class exer4 {
  public static void main(String[] args) {
    /**
     * Faça um programa para armazenar em uma matriz os compromissos de
     * agenda pessoal.
     * cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas
     * podemos associar um tarefa especifica (compromisso agendado).
     * O programa deve ter um menu onde o usuario indica o dia mês que deseja
     * alterar e a hora, entrando em seguida com o compromisso, ou entao, o
     * usuario pode também consultar a agenda, fornecendo o dia e a hora
     * obter o compromisso armazenado.
     */

    Scanner sc = new Scanner(System.in);

    String[][] compromisso = new String[31][24];

    boolean sair = false;
    byte opcao;
    while (!sair) {
      System.out.println("Digite 1 para adicionar compromisso");
      System.out.println("Digite 2 para verificar compromisso");
      System.out.println("Digite 0 para sair");

      opcao = sc.nextByte();

      if (opcao == 1) { // Adicionar compromisso
        boolean diaValido = false;
        int dia = 0;
        while (!diaValido) {
          System.out.println("Digite o dia do mês");
          dia = sc.nextInt();
          if (dia > 0 && dia <= 31) {
            diaValido = true;
          } else {
            System.out.println("Dia invalido, digite novamente");
          }
        }
        // hora
        boolean horaValida = false;
        int hora = 0;
        while (!horaValida) {
          System.out.println("Digite hora do compromisso");
          hora = sc.nextInt();
          if (hora >= 0 && hora <= 24) {
            horaValida = true;
          } else {
            System.out.println("hora invalida, digite novamente");
          }
        }

        dia--;
        System.out.println("Digite o compromisso");
        compromisso[dia][hora] = sc.next();

      } else if (opcao == 2) { // verificar compromisso
        boolean diaValido = false;
        int dia = 0;
        while (!diaValido) {
          System.out.println("Digite o dia do mês");
          dia = sc.nextInt();
          if (dia > 0 && dia <= 31) {
            diaValido = true;
          } else {
            System.out.println("Dia invalido, digite novamente");
          }
        }
        // hora
        boolean horaValida = false;
        int hora = 0;
        while (!horaValida) {
          System.out.println("Digite hora do compromisso");
          hora = sc.nextInt();
          if (hora >= 0 && hora <= 24) {
            horaValida = true;
          } else {
            System.out.println("hora invalida, digite novamente");
          }
        }

        dia--;
        System.out.println("O compromisso agendado é: ");
        System.out.println(compromisso[dia][hora]);

      } else if (opcao == 0) {
        sair = true;
      } else {
        System.out.println("Opcao invalida, digite novamente");
      }
    }

    sc.close();
  }
}
