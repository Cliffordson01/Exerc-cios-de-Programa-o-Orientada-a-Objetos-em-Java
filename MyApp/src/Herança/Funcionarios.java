/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Classe Funcionario e Gerente: Crie uma classe Funcionario com nome e salario. Crie uma
subclasse Gerente que tem um bônus adicional.
 */
package Herança;

// Classe Funcionario (superclasse)
class Funcionario {
    private String nome;
    private double salario;

    // Construtor para inicializar nome e salario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}

// Classe Gerente (subclasse de Funcionario)
class Gerente extends Funcionario {
    private double bonus;

    // Construtor que chama o construtor da superclasse
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);  // Chama o construtor da superclasse (Funcionario)
        this.bonus = bonus;
    }

    // Método para calcular o salário total (salário + bônus)
    public double calcularSalarioTotal() {
        return getSalario() + bonus;
    }

    // Método para exibir informações do gerente (incluindo o bônus)
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();  // Chama o método da superclasse
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário total (com bônus): R$ " + calcularSalarioTotal());
    }
}

// Classe principal para testar as classes Funcionario e Gerente
public class Funcionarios {
    public static void main(String[] args) {
        // Criando um objeto Funcionario
        Funcionario funcionario = new Funcionario("João", 3000.00);
        System.out.println("Informações do Funcionário:");
        funcionario.exibirInformacoes();
        
        System.out.println("\n-------------------------------------------------\n");
        
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("Maria", 5000.00, 1500.00);
        System.out.println("Informações do Gerente:");
        gerente.exibirInformacoes();
    }
}