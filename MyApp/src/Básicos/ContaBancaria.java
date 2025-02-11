/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Classe ContaBancaria: Implemente uma classe com saldo e métodos para depositar e sacar
dinheiro.
 */
package Básicos;
// Definição da classe ContaBancaria
public class ContaBancaria {
    // Atributo privado saldo
    private double saldo;

    // Construtor para inicializar o saldo da conta bancária
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Método para consultar o saldo da conta
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Método principal para testar a classe ContaBancaria
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial
        ContaBancaria minhaConta = new ContaBancaria(1000.00);
        
        // Exibindo saldo inicial
        minhaConta.consultarSaldo();
        
        // Realizando um depósito
        minhaConta.depositar(500.00);
        
        // Realizando um saque
        minhaConta.sacar(200.00);
        
        // Tentando realizar um saque com saldo insuficiente
        minhaConta.sacar(2000.00);
        
        // Exibindo saldo final
        minhaConta.consultarSaldo();
    }
}

