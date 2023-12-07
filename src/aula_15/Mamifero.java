package aula_15;

public class Mamifero extends Animal {
  
  Mamifero() {
    super();
    System.out.println("Executou construtor de manifero.");
  }

  Mamifero(String nome) {
    super(nome); // construtor da super classe
    // super.getNome();
  }

  public void emitirSom() {
    System.out.println("fala");
  }
}
