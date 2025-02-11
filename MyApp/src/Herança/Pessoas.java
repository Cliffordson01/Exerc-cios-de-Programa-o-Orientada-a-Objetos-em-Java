/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Classe Professor e Aluno: Crie uma hierarquia onde Aluno e Professor herdam de Pessoa,
cada um com atributos específicos.
 */
package Herança;

class Pessoa {
    private String nome;
    private int idade;

    // Construtor para inicializar nome e idade
    public Pessoa(String nome, int idade) {
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

    // Método para exibir informações básicas da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Classe Aluno (subclasse de Pessoa)
class Aluno extends Pessoa {
    private String curso;

    // Construtor que chama o construtor da superclasse
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);  // Chama o construtor da superclasse (Pessoa)
        this.curso = curso;
    }

    // Método para exibir informações do aluno
    public void exibirInformacoesAluno() {
        super.exibirInformacoes();  // Chama o método da superclasse
        System.out.println("Curso: " + curso);
    }
}

// Classe Professor (subclasse de Pessoa)
class Professor extends Pessoa {
    private String materia;

    // Construtor que chama o construtor da superclasse
    public Professor(String nome, int idade, String materia) {
        super(nome, idade);  // Chama o construtor da superclasse (Pessoa)
        this.materia = materia;
    }

    // Método para exibir informações do professor
    public void exibirInformacoesProfessor() {
        super.exibirInformacoes();  // Chama o método da superclasse
        System.out.println("Matéria: " + materia);
    }
}

// Classe principal para testar as classes Pessoa, Aluno e Professor
public class Pessoas {
    public static void main(String[] args) {
        // Criando um objeto Aluno
        Aluno aluno = new Aluno("Lucas", 20, "Ciência da Computação");
        System.out.println("Informações do Aluno:");
        aluno.exibirInformacoesAluno();  // Exibe informações do aluno
        
        System.out.println("\n-------------------------------------------------\n");
        
        // Criando um objeto Professor
        Professor professor = new Professor("Maria", 45, "Matemática");
        System.out.println("Informações do Professor:");
        professor.exibirInformacoesProfessor();  // Exibe informações do professor
    }
}
