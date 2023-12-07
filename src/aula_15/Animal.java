package aula_15;

public class Animal {
  private String nome;
  private String especie;
  private String habitat;
  private int espectativaVida;
  private boolean vertebrado;
  private boolean simetrico;
  protected String cor; // acessado por classes filhas ou do mesmo pacote

  Animal() {
    System.out.println("Executou construtor de animal.");
  }

  Animal(String nome) {
    this.nome = nome;
  }

  public void emitirSom() {
    System.out.println("defina um som");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public int getEspectativaVida() {
    return espectativaVida;
  }

  public void setEspectativaVida(int espectativaVida) {
    this.espectativaVida = espectativaVida;
  }

  public boolean isVertebrado() {
    return vertebrado;
  }

  public void setVertebrado(boolean vertebrado) {
    this.vertebrado = vertebrado;
  }

  public boolean isSimetrico() {
    return simetrico;
  }

  public void setSimetrico(boolean simetrico) {
    this.simetrico = simetrico;
  }
}
