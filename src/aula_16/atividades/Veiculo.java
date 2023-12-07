package aula_16.atividades;
// Desenvolva uma classe Veiculo com atributos como modelo e ano. Crie uma classe derivada Carro e Barco que herdam de Veiculo e adicionam atributos específicos. Implemente construtores apropriados.
public class Veiculo {
  private String modelo;
  private int ano;

  Veiculo() {

  }

  Veiculo(String modelo, int ano) {
    this.modelo = modelo;
    this.ano = ano;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}
