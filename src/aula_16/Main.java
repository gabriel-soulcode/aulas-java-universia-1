package aula_16;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Fagner");
    Funcionario funcionario = new Funcionario();
    // Pessoa pessoa = new Pessoa(); // erro
    // Polimorfismo -> Muitas formas
    Pessoa pessoa = new Funcionario();
    pessoa = new Cliente();
  }
}
