/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Classe Produto: Crie uma classe Produto com nome, preco e quantidade. Implemente um
método para calcular o valor total em estoque.
 */
package Básicos;
// Definição da classe Produto
public class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor que inicializa os atributos
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular o valor total em estoque
    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    // Método principal para testar a classe Produto
    public static void main(String[] args) {
        // Instanciando objetos da classe Produto
        Produto produto1 = new Produto("Camiseta", 49.99, 100);
        Produto produto2 = new Produto("Calça", 79.90, 50);
        
        // Calculando o valor total em estoque para cada produto e formatando o resultado para 2 casas decimais
        System.out.println("Valor total em estoque do produto " + produto1.getNome() + ": R$ " + String.format("%.2f", produto1.calcularValorEstoque()));
        System.out.println("Valor total em estoque do produto " + produto2.getNome() + ": R$ " + String.format("%.2f", produto2.calcularValorEstoque()));
    }
}
