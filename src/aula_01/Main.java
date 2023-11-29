package aula_01;

public class Main {
    // método = função
    // o método principal é resposável por dar inicio a execução de um programa em java
    public static void main(String[] args) {

        // Tipagem Dinâmica - JavaScript (Interpretado) (Client-Side)
        // Tipagem Estática - Java (Compilado) (Server-Side)

        // int -> Integer -> Inteiro (Numerico Inteiro)
        // long -> Long -> Longo (Numero Inteiro)
        // double -> Double -> Dobro (Numerico Decimal)
        // float -> Float -> Flutuante (Numerico Decimal)
        // boolean -> Boolean (Lógico)
        // char -> Charactere -> Caractere (Numerico/Textual)
        // String -> Sequência ou Cadeia (Textuais)

        int integer = 2147483647;
        long inteiroLongo = 214748366456448L;
        double flutuanteLongo = 474836645644.5466;
        float flutuante = 5435345.67F;
        boolean logico = false;
        char letra = 'I';
        letra = 'G';
        integer = 17;
        // integer = "Oi";
        String nome = "Gabriel gosta de chocolate.";

        System.out.println(nome);
        System.out.println(flutuante);
    }
}