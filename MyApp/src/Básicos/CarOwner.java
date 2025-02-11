/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Associação de Objetos: Crie uma classe Dono que possui um Carro. Instancie um objeto e
relacione-o com um carro. 
 */
package Básicos;
// Definição da classe Car
class Car {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor para inicializar os atributos do carro
    public Car(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir detalhes do carro
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

// Definição da classe Dono
class Dono {
    private String nome;
    private Car carro; // Associação com a classe Car

    // Construtor para inicializar o nome e o carro do dono
    public Dono(String nome, Car carro) {
        this.nome = nome;
        this.carro = carro;
    }

    // Método para exibir os dados do dono e do carro
    public void exibirInformacoes() {
        System.out.println("Nome do dono: " + nome);
        System.out.print("Detalhes do carro do dono: ");
        carro.exibirDetalhes();
    }
}

// Classe principal para testar a associação
public class CarOwner {
    public static void main(String[] args) {
        // Criando um objeto Car
        Car meuCarro = new Car("Ford", "Fiesta", 2020);
        
        // Criando um objeto Dono e associando-o ao carro
        Dono dono1 = new Dono("Carlos", meuCarro);
        
        // Exibindo informações do dono e seu carro
        dono1.exibirInformacoes();
    }
}
