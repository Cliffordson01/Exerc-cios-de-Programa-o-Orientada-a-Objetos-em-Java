/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Classe Empregado e Especializações: Crie uma hierarquia onde Empregado tem subclasses
Programador e Designer, cada uma com um método que imprime sua função.
 */
package Herança;

// Classe Empregado (superclasse)
class Empregado {
    private String nome;
    private int idade;

    // Construtor para inicializar nome e idade
    public Empregado(String nome, int idade) {
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

    // Método para exibir informações gerais do empregado
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método genérico para função do empregado (pode ser sobrescrito nas subclasses)
    public void funcao() {
        System.out.println("Função: Empregado");
    }
}

// Classe Programador (subclasse de Empregado)
class Programador extends Empregado {

    // Construtor que chama o construtor da superclasse
    public Programador(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da superclasse (Empregado)
    }

    // Sobrescrita do método funcao para o Programador
    @Override
    public void funcao() {
        System.out.println("Função: Programador - Desenvolve sistemas e escreve código.");
    }
}

// Classe Designer (subclasse de Empregado)
class Designer extends Empregado {

    // Construtor que chama o construtor da superclasse
    public Designer(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da superclasse (Empregado)
    }

    // Sobrescrita do método funcao para o Designer
    @Override
    public void funcao() {
        System.out.println("Função: Designer - Cria designs visuais e interfaces.");
    }
}

// Classe principal para testar as classes Empregado, Programador e Designer
public class Empregados {
    public static void main(String[] args) {
        // Criando objetos de Programador e Designer
        Empregado programador = new Programador("Carlos", 30);
        Empregado designer = new Designer("Ana", 28);

        // Exibindo informações e função de cada empregado
        System.out.println("Informações do Programador:");
        programador.exibirInformacoes();
        programador.funcao();

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("Informações do Designer:");
        designer.exibirInformacoes();
        designer.funcao();
    }
}
