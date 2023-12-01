package aula_07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// modificador de acesso -> public, private
// define que o método é membro da classe -> static
public class Metodos {

  static double raizQuadrada(double valor) {
    return Math.sqrt(valor);
  }

  static void bemVindo(String nome) {
    System.out.println("Bem vindo(a), " + nome);
  }

  static void mostrarDataHora() {
    LocalDateTime dataHora = LocalDateTime.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    System.out.println(formatador.format(dataHora));
  }

  public static void main(String[] args) {
    double raiz = raizQuadrada(400);
    System.out.println(raiz);

    bemVindo("Gabriel Braga");
    mostrarDataHora();

    Computador comp = new Computador();
    comp.ligar();
    comp.executar("Visual Studio Code");

    System.out.println("\u001B[32mHello World\u001B[0m");
  }
}

// Metodos objMetodos = new Metodos(); //  criação do objeto metodos
// objMetodos.main(); // membro do objeto (sem static)
// Metodos.main(); // membro da classe (com static)