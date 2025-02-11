/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Criando uma Hierarquia de Classes: Crie uma classe Animal com os atributos nome e idade.
Depois, crie as classes Cachorro e Gato que herdam de Animal.
 */
package Herança;

// Classe Animal (superclasse)
class Animal {
    private String nome;
    private int idade;

    // Construtor padrão
    public Animal() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    // Construtor que recebe nome e idade
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para exibir informações do animal
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

// Classe Cachorro (subclasse de Animal)
class Cachorro extends Animal {

    // Construtor que chama o construtor da superclasse
    public Cachorro(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da superclasse (Animal)
    }

    // Método específico de Cachorro
    public void latir() {
        System.out.println("O cachorro " + getNome() + " está latindo!");
    }
}

// Classe Gato (subclasse de Animal)
class Gato extends Animal {

    // Construtor que chama o construtor da superclasse
    public Gato(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da superclasse (Animal)
    }

    // Método específico de Gato
    public void miar() {
        System.out.println("O gato " + getNome() + " está miando!");
    }
}

// Classe principal para testar a hierarquia
public class Animals {
    public static void main(String[] args) {
        // Criando um objeto Cachorro usando o construtor com nome e idade
        Cachorro cachorro = new Cachorro("Rex", 3);
        cachorro.exibirInformacoes();  // Exibe informações do cachorro
        cachorro.latir();  // O cachorro late

        System.out.println();

        // Criando um objeto Gato usando o construtor com nome e idade
        Gato gato = new Gato("Mimi", 2);
        gato.exibirInformacoes();  // Exibe informações do gato
        gato.miar();  // O gato mia
    }
}