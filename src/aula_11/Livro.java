package aula_11;

public class Livro {
  
  String titulo;
  String autor;
  String isbn;
  String resumo;
  int anoPublicacao;
  int paginas;

  Livro() {

  }

  Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    // titulo = "Vidas Secas";
  }

  Livro(String titulo, String autor, int paginas) {
    this(titulo, autor); // chamada para contrutor acima
    this.paginas = paginas;
  }

  Livro(
    String titulo,
    String autor,
    String isbn,
    String resumo,
    int anoPublicacao,
    int paginas) {
      this(titulo, autor, paginas);
      this.isbn = isbn;
      this.resumo = resumo;
      this.anoPublicacao = anoPublicacao;
  }

}

// new Livro();