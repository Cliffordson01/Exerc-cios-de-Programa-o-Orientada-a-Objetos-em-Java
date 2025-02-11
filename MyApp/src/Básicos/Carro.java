/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Criação de Classe e Objeto: Crie uma classe Carro com atributos marca, modelo e ano.
Instancie objetos dessa classe e imprima seus valores.
 */
package Básicos;

// Definição da classe Carro
public class Carro {

    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;

     // Atributo estático para contar os carros criados
     private static int contadorDeCarros = 0;
     
     // Construtor que inicializa os atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        contadorDeCarros++; // Incrementa o contador cada vez que um novo objeto é criado
    }

     // Métodos getters e setters
     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
     // Método simples para exibir os detalhes do carro
     public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

     // Método estático para exibir o número de carros criados
     public static void exibirNumeroDeCarros() {
        System.out.println("Número de carros criados: " + contadorDeCarros);
    }

      // Método principal para testar a classe Carro
      public static void main(String[] args) {
        // Instanciando objetos da classe Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);
        
        // Exibindo os detalhes de cada carro
        System.out.println("Detalhes do carro 1:");
        carro1.exibirDetalhes();
        
        System.out.println("\nDetalhes do carro 2:");
        carro2.exibirDetalhes();
        
        // Exibindo o número de carros criados
        Carro.exibirNumeroDeCarros();
    }
}
