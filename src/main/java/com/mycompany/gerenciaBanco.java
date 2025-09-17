package com.mycompany;

import java.util.Scanner;

// Classe para os dados e operações da conta
class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    // Construtor para inicializar os dados do cliente
    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0; // Saldo inicial é zero
    }

    // Método para consultar o saldo
    public void consultarSaldo() {
        System.out.println("---------------------------------");
        System.out.println("Cliente: " + nome + " " + sobrenome);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        System.out.println("---------------------------------");
    }

    // Método para realizar um depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        consultarSaldo();
    }

    // Método para realizar um saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
        consultarSaldo();
    }
}

// Classe principal que contém o método main
public class gerenciaBanco {

    // Método para exibir o menu de opções
    public static void exibirMenu() {
        System.out.println("\n--- Menu de Operações ---");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Realizar Depósito");
        System.out.println("3. Realizar Saque");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Coleta de dados do usuário
        System.out.println("--- Cadastro de Conta Bancária ---");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        // 2. Instanciação do objeto ContaBancaria
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);
        System.out.println("\nConta criada com sucesso para " + nome + " " + sobrenome + "!");

        int opcao;
        // 3. Loop do menu de operações
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            // 4. Estrutura de decisão para tratar a escolha do usuário
            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso sistema. Encerrando a aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}

