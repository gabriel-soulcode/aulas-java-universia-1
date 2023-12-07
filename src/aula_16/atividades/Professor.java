package aula_16.atividades;

public class Professor extends Pessoa {
  private float salario;
  private String especializacao;

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public String getEspecializacao() {
    return especializacao;
  }

  public void setEspecializacao(String especializacao) {
    this.especializacao = especializacao;
  }
}
