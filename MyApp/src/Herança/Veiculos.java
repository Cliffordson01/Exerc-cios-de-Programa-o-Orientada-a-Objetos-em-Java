/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo
cilindrada e um método para exibi-lo.
 */
package Herança;

// Classe Veiculo (superclasse)
class Veiculo {
    private String modelo;
    private int ano;

    // Construtor para inicializar modelo e ano
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir informações do veículo
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

// Classe Moto (subclasse de Veiculo)
class Moto extends Veiculo {
    private int cilindrada;  // Atributo específico da Moto

    // Construtor que chama o construtor da superclasse
    public Moto(String modelo, int ano, int cilindrada) {
        super(modelo, ano);  // Chama o construtor da superclasse (Veiculo)
        this.cilindrada = cilindrada;
    }

    // Método para exibir a cilindrada da moto
    public void exibirCilindrada() {
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }

    // Método sobrescrito para exibir informações completas da moto
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();  // Chama o método da superclasse
        exibirCilindrada();  // Exibe a cilindrada da moto
    }
}

// Classe principal para testar as classes Veiculo e Moto
public class Veiculos {
    public static void main(String[] args) {
        // Criando um objeto Veiculo
        Veiculo veiculo = new Veiculo("Fusca", 1975);
        System.out.println("Informações do Veículo:");
        veiculo.exibirInformacoes();
        
        System.out.println("\n-------------------------------------------------\n");
        
        // Criando um objeto Moto
        Moto moto = new Moto("Honda CBR", 2020, 1000);
        System.out.println("Informações da Moto:");
        moto.exibirInformacoes();
    }
}
