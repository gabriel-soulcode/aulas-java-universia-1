package aula_09;

import java.time.LocalDate;

public class Usuario {
  String nome;
  String senha;
  String email;
  LocalDate dataNascimento;
  Endereco endereco; // associação entre classes

  void falar(String texto) {
    System.out.println(texto);
  }

  void apresentar() {
    String texto = "Olá sou " + nome + " moro em " + endereco.logradouro;
    System.out.println(texto);
  }
}
