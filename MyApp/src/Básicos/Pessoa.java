/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Classe Pessoa: Crie uma classe Pessoa com nome e idade. Adicione um método para
verificar se a pessoa é maior de idade.
 */
package Básicos;
// Definição da classe Pessoa
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor que inicializa os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters
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

    // Método para verificar se a pessoa é maior de idade
    public boolean verificarMaiorDeIdade() {
        return idade >= 18;
    }

    // Método principal para testar a classe Pessoa
    public static void main(String[] args) {
        // Instanciando objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Carlos", 20);
        Pessoa pessoa2 = new Pessoa("Ana", 17);
        
        // Verificando se as pessoas são maiores de idade
        System.out.println(pessoa1.getNome() + " é maior de idade? " + pessoa1.verificarMaiorDeIdade());
        System.out.println(pessoa2.getNome() + " é maior de idade? " + pessoa2.verificarMaiorDeIdade());
    }
}