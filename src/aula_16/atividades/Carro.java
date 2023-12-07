package aula_16.atividades;

public class Carro extends Veiculo {
  private String carroceria;

  Carro() {

  }

  Carro(String modelo, int ano, String carroceria) {
    super(modelo, ano);
    this.carroceria = carroceria;
  }

  public String getCarroceria() {
    return carroceria;
  }

  public void setCarroceria(String carroceria) {
    this.carroceria = carroceria;
  }
}
