/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: . Classe InstrumentoMusical: Crie uma superclasse InstrumentoMusical e subclasses como
Violao e Piano, cada uma com um método tocar().
 */
package Herança;

// Classe InstrumentoMusical (superclasse)
class InstrumentoMusical {
    private String nome;

    // Construtor para inicializar nome
    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    // Método para exibir o nome do instrumento
    public void exibirNome() {
        System.out.println("Instrumento: " + nome);
    }

    // Método abstrato para tocar o instrumento
    public void tocar() {
        System.out.println("Tocando um instrumento musical.");
    }
}

// Classe Violao (subclasse de InstrumentoMusical)
class Violao extends InstrumentoMusical {

    // Construtor que chama o construtor da superclasse
    public Violao() {
        super("Violão");
    }

    // Sobrescrita do método tocar para o Violão
    @Override
    public void tocar() {
        System.out.println("Tocando Violão: dedilhando as cordas.");
    }
}

// Classe Piano (subclasse de InstrumentoMusical)
class Piano extends InstrumentoMusical {

    // Construtor que chama o construtor da superclasse
    public Piano() {
        super("Piano");
    }

    // Sobrescrita do método tocar para o Piano
    @Override
    public void tocar() {
        System.out.println("Tocando Piano: pressionando as teclas.");
    }
}

// Classe principal para testar as classes InstrumentoMusical, Violao e Piano
public class InstrumentoMusicais {
    public static void main(String[] args) {
        // Criando objetos de Violao e Piano
        InstrumentoMusical violao = new Violao();
        InstrumentoMusical piano = new Piano();

        // Exibindo informações e tocando os instrumentos
        violao.exibirNome();
        violao.tocar();

        System.out.println("\n-------------------------------------------------\n");

        piano.exibirNome();
        piano.tocar();
    }
}
