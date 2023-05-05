package com.poo1.preparacao.testes;

public class coversaoEstuturaCodiparaSele {
  public static void main(String[] args) {
    int var = 8;
    /*
     * if (var -= 1) {
     * System.out.println("good");
     * } else if (var == 2) {
     * System.out.println("bettar");
     * } else if (var == 3) {
     * System.out.println("best");
     * } else {
     * System.out.println("invalid");
     * }
     */
    switch (var -= 1) { // var = var -1
      case 1:
        System.out.println("good");
        break;
      case 2:
        System.out.println("bettar");
        break;
      case 3:
        System.out.println("best");
        break;
      default:
        System.out.println("invalid");
        break;
    }
  }
}
