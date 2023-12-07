package aula_16.atividades;
// Crie uma classe Pessoa com atributos como nome e idade. Em seguida, crie classes derivadas Professor e Estudante que herdam de Pessoa. Adicione características específicas para cada pessoa.
public class Pessoa {
  private String nome;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
