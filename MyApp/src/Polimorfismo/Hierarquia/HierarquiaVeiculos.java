/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Hierarquia de Veículos: Crie uma hierarquia de classes Veiculo -> Carro -> CarroEletrico, e
sobrescreva um método abastecer() para se adaptar a cada tipo de veículo.
 */
package Polimorfismo.Hierarquia;

// Classe Veiculo (superclasse)
class Veiculo {
    private String modelo;
    private int ano;

    // Construtor para inicializar modelo e ano
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para abastecer o veículo (será sobrescrito nas subclasses)
    public void abastecer() {
        System.out.println("Abastecendo o veículo.");
    }

    // Métodos getters
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

// Classe Carro (subclasse de Veiculo)
class Carro extends Veiculo {

    // Construtor que chama o construtor da superclasse
    public Carro(String modelo, int ano) {
        super(modelo, ano);  // Chama o construtor da superclasse (Veiculo)
    }

    // Sobrescrita do método abastecer para carros convencionais
    @Override
    public void abastecer() {
        System.out.println("Abastecendo o carro com combustível.");
    }
}

// Classe CarroEletrico (subclasse de Carro)
class CarroEletrico extends Carro {

    // Construtor que chama o construtor da superclasse
    public CarroEletrico(String modelo, int ano) {
        super(modelo, ano);  // Chama o construtor da superclasse (Carro)
    }

    // Sobrescrita do método abastecer para carros elétricos
    @Override
    public void abastecer() {
        System.out.println("Carregando a bateria do carro elétrico.");
    }
}

// Classe principal para testar as classes Veiculo, Carro e CarroEletrico
public class HierarquiaVeiculos {
    public static void main(String[] args) {
        // Criando objetos dos tipos Veiculo, Carro e CarroEletrico
        Veiculo veiculo = new Veiculo("Modelo Genérico", 2022);
        Carro carro = new Carro("Fusca", 1978);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla Model 3", 2023);

        // Chamando o método abastecer para cada tipo de veículo
        System.out.println("Abastecendo um veículo genérico:");
        veiculo.abastecer();

        System.out.println("\nAbastecendo um carro convencional:");
        carro.abastecer();

        System.out.println("\nAbastecendo um carro elétrico:");
        carroEletrico.abastecer();
    }
}
