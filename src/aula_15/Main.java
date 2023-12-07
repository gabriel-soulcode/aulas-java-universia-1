package aula_15;

public class Main {
  public static void main(String[] args) {
    Animal aguia = new Animal();
    aguia.setNome("Águia");
    aguia.setEspectativaVida(12);
    aguia.setEspecie("Ave");
    aguia.setHabitat("Montanhas");
    aguia.setSimetrico(true);
    aguia.setVertebrado(true);
    System.out.println(aguia.getNome());

    Ave galinha = new Ave();
    galinha.setNome("Galinha");
    galinha.setHabitat("Planicie");
    galinha.setEspectativaVida(5);
    System.out.println(galinha.getNome());
    System.out.println(galinha.getEspecie());
    System.out.println(galinha.getEnvergaduraAsa());
    
    galinha.emitirSom();

    Mamifero gato = new Mamifero("Gato");
    System.out.println(gato.getNome());
  }
}
