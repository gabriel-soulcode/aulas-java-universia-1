package aula_16.atividades;
// Crie a classes ContaBancaria para e inclua uma classe derivada ContaCorrente que permite um limite de saque de até 3000. Adicione uma exceção para lidar com saques que ultrapassem esse limite.
public class ContaBancaria {
  private Double saldo = 3000.0;

  public void sacar(double valor) {
    if(valor > 3000.0) {
      throw new RuntimeException("Limite de saque excessido.");
    } else {
      saldo -= valor;
    }
  }
}
