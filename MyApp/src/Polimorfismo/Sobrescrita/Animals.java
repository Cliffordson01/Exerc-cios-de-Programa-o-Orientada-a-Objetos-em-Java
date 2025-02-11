/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Polimorfismo de Sobrescrita: Modifique Animal para que tenha um método emitirSom(). Em
Cachorro e Gato, sobrescreva esse método.
 */

package Polimorfismo.Sobrescrita;

// Classe Animal (superclasse)
class Animal {
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

    // Método para emitir som (será sobrescrito nas subclasses)
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}

// Classe Cachorro (subclasse de Animal)
class Cachorro extends Animal {

    // Construtor que chama o construtor da superclasse
    public Cachorro(String nome, int idade) {
        super(nome, idade); // Chama o construtor da superclasse (Animal)
    }

    // Sobrescrita do método emitirSom para o Cachorro
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

    // Sobrescrita do método emitirSom para o Gato
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau!");
    }
}

// Classe principal para testar as classes Animal, Cachorro e Gato
public class Animals {
    public static void main(String[] args) {
        // Criando objetos de Cachorro e Gato
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Whiskers", 3);

        // Chamando o método emitirSom para cada animal
        System.out.println(cachorro.getNome() + " (Cachorro) está:");
        cachorro.emitirSom();

        System.out.println("\n-------------------------------------------------\n");

        System.out.println(gato.getNome() + " (Gato) está:");
        gato.emitirSom();
    }
}
