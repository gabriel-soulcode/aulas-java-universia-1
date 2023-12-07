package aula_16;

public abstract class Pessoa {
  private String nome;
  
  Pessoa() {

  }

  Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
