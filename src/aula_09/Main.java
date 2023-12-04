package aula_09;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    
    Produto lampada = new Produto(); // instanciar
    lampada.codigo = "1234567890";
    lampada.descricao = "Super lampada 1200w 500horas de uso";
    lampada.nome = "Super Lampada";
    lampada.preco = 10.0;
    lampada.disponibilidade = true;

    Produto panela = new Produto();
    panela.codigo = "0987654321";
    panela.descricao = "Panela Tramoteno 3L antiaderente";
    panela.nome = "Panela Tramoteno 3L";
    panela.preco = 150.0;
    panela.disponibilidade = false;

    System.out.println(lampada.nome);
    System.out.println(panela.nome);

    double total = lampada.preco + panela.preco;
    System.out.println("Total: " + total);

    Usuario gabriel = new Usuario();
    gabriel.nome = "Gabriel Braga";
    gabriel.email = "gabriel@soulcode.com";
    gabriel.senha = "hojetemhappyhour";
    gabriel.dataNascimento = LocalDate.parse("2001-12-07");
    gabriel.endereco = new Endereco();
    gabriel.endereco.logradouro = "R. Ali Perto Memória";
    gabriel.endereco.numero = "1002A";
    gabriel.endereco.cidade = "Tianguá";
    gabriel.endereco.uf = "CE";
    gabriel.endereco.cep = "123090-37";

    gabriel.falar("Oi, pessoal. Tudo bem?");
    gabriel.apresentar();
  }
}
