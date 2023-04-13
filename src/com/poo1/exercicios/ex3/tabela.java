package com.poo1.exercicios.ex3;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tabela {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    JFrame frame;
    JTable tabela;

    frame = new JFrame();
    frame.setTitle("tabela");

    String[][] data = {
        { "Fred", "23" },
        { "Anand Jha", "34" }
    };

    // Column Names
    String[] columnNames = { "Name", "Idade" };

    tabela = new JTable(data, columnNames);
    tabela.setBounds(30, 40, 200, 300);

    JScrollPane sp = new JScrollPane(tabela);
    frame.add(sp);
    // Frame Size
    frame.setSize(500, 200);
    // Frame Visible = true
    frame.setVisible(true);
    sc.close();
  }
}
