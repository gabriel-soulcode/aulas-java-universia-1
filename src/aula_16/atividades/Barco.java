package aula_16.atividades;

public class Barco extends Veiculo {
  private String tipo;

  Barco() {

  }

  Barco(String modelo, int ano, String tipo) {
    super(modelo, ano);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
