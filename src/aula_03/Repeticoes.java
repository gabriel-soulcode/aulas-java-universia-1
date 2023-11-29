package aula_03;

import java.util.Scanner;

public class Repeticoes {
  public static void main(String[] args) {
    System.out.println("Estudando Repetições");

    // for, while, do while
    for(int i = 0; i < 10; i++) {
      System.out.println("O valor de i é: " + i);
    }

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número (while)");
    int numero = teclado.nextInt();
    while(numero <= 0) {
      numero = teclado.nextInt();
    }

    do {
      System.out.println("Digite um número (do while)");
      numero = teclado.nextInt();
    } while(numero <= 0);

    int[] numeros = {1, 2, 3, 4, 5, 9, 0};
    String[] nomes = {"Gabriel", "Adriano", "Almir"};
    // for each
    for(int n : numeros) {
      System.out.println(n);
    }

    for(int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }
  }
}
