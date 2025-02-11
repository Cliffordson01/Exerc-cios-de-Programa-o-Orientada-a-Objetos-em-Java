/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Polimorfismo em Métodos: Crie um método que recebe Animal como parâmetro e chama
emitirSom().
 */
package Polimorfismo.Métodos;

// Classe Animal (agora uma classe abstrata)
abstract class Animal {
    private String nome;
    private int idade;

    // Construtor para inicializar nome e idade
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

    // Método abstrato que será implementado nas subclasses
    public abstract void emitirSom(); // Agora é obrigatório nas subclasses
}

// Classe Cachorro (subclasse de Animal)
class Cachorro extends Animal {

    // Construtor que chama o construtor da superclasse
    public Cachorro(String nome, int idade) {
        super(nome, idade); // Chama o construtor da superclasse (Animal)
    }

    // Implementação do método emitirSom para o Cachorro
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }
}

// Classe Gato (subclasse de Animal)
class Gato extends Animal {

    // Construtor que chama o construtor da superclasse
    public Gato(String nome, int idade) {
        super(nome, idade); // Chama o construtor da superclasse (Animal)
    }

    // Implementação do método emitirSom para o Gato
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau!");
    }
}

// Classe principal para testar as classes Animal, Cachorro e Gato
public class Animals {

    // Método que recebe um objeto Animal e chama emitirSom()
    public static void fazerEmitirSom(Animal animal) {
        animal.emitirSom(); // Polimorfismo: a implementação do método depende do tipo real do objeto
    }

    public static void main(String[] args) {
        // Criando objetos de Cachorro e Gato
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Whiskers", 3);

        // Chamando o método fazerEmitirSom passando os objetos de Cachorro e Gato
        System.out.println(cachorro.getNome() + " (Cachorro) está:");
        fazerEmitirSom(cachorro); // Chama o método de Cachorro

        System.out.println("\n-------------------------------------------------\n");

        System.out.println(gato.getNome() + " (Gato) está:");
        fazerEmitirSom(gato); // Chama o método de Gato
    }
}
