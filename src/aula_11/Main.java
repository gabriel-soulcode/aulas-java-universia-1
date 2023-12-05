package aula_11;

public class Main {
  public static void main(String[] args) {
    Livro cleanClode = new Livro("Clean Code", "Robet C. Martin");
    // cleanClode.titulo = "Clean Clode";
    // cleanClode.autor = "Robet C. Martin";
    cleanClode.resumo = "Estratégias para ter um código limpo.";
    cleanClode.isbn = "3433465457478";
    System.out.println(cleanClode.titulo);

    Livro vidasSecas = new Livro("Vidas Secas", "Graciliano Ramos");
    System.out.println(vidasSecas.titulo);
    System.out.println(vidasSecas.autor);

    Livro iracema = new Livro("Iracema", "José de Alencar");
    System.out.println(iracema.titulo);
    System.out.println(iracema.autor);

    Livro harryPotter = new Livro();
    harryPotter.titulo = "Harry Potter";
    System.out.println(harryPotter.titulo);

    Livro semLimites = new Livro("Sem Limites", "Jim Kwik", 340);
    System.out.println(semLimites.titulo);
    System.out.println(semLimites.paginas);

    Livro fundamentosJava = new Livro(
      "Java para Iniciantes",
      "Herbert Schildt",
      "64567457845",
      "Aprenda os conceitos e técnicas fundamentais da linguagem Java",
      2015,
      600
    );
    System.out.println(fundamentosJava.resumo);

    // Referência de Objetos
    Livro teste1 = new Livro("Titulo Teste", "Autor Teste");
    Livro teste2 = teste1; // copia da referencia do objeto
    teste2.titulo = "Novo Titulo Teste";
    System.out.println(teste1.titulo); // Novo Titulo Teste
    System.out.println(teste2.titulo); // Novo Titulo Teste

    int a = 3;
    int b = a; // "b" faz cópia de "a"
    b += 2;
    System.out.println(b); // 5
    System.out.println(a); // 3
  }
}
