package com.poo1.preparacao.testes;

public class num123_2022 {
  public static void main(String[] args) {
    // 1. categorias dos operadores
    // a) <= => Relacional
    // b) && => Logico
    // c) -- => Decremento
    // d) ?: => Ternarios

    // 2. Ordene consoante as precedencia de maior para menor
    // --; %; >=; &&

    /*
     * 3. Diga a saida abaixo quando o x= 10?
     * 
     * int x = 10;
     * int y = 10;
     * int a = 5 * ++x; // 55
     * int b = 5 * y--; // 50
     * 
     * System.out.println("a= " + a);
     * System.out.println("b= " + b);
     */

    /*
     * O valor das expressoes abaixo
     * 
     * int a = 8;
     * a = a++ * 2 + 3 * -a;
     * System.out.println("a=: " + a); // -11
     */
    /*
     * 
     * int b = 7;
     * int z = (++b * (b++ + 5));
     * System.out.println("z=: " + z); // 104
     */

    /*
     * 
     * int c = 5;
     * c += c++ + ++c + --c + c--;
     * System.out.println("z=: " + c); // 29
     */

    int d = 9;
    d++;
    System.out.println(d);
    d -= d - - -d; // d=d-(d-(-(-d))) <=> d=d-(d-(+d))
    System.out.println("ola" + d); // 10
  }
}
