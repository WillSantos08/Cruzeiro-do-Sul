import java.util.Scanner;

public class Conta {
    @SuppressWarnings("unused")
    private String nome;
    private double saldo = 0;

    public void cadastrar(Scanner sc) {
        System.out.print("Digite seu nome completo: ");
        this.nome = sc.nextLine();
        System.out.println("Conta cadastrada com sucesso!");
    }

    public void sacar(Scanner sc) {
        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        sc.nextLine();

        if (saque <= this.saldo) {
            this.saldo -= saque;
            System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f%n", this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(Scanner sc) {
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        sc.nextLine();

        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f%n", this.saldo);
        } else {
            System.out.println("Valor inválido! O depósito deve ser maior que zero.");
        }
    }

    public void verSaldo() {
        System.out.printf("Seu saldo atual é: R$ %.2f%n", this.saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        int opcao;

        do {
            System.out.println("\nEscolha a opção desejada:");
            System.out.println("1 - Cadastrar\n2 - Sacar\n3 - Ver Saldo\n4 - Depositar\n5 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    conta.cadastrar(sc);
                    break;
                case 2:
                    conta.sacar(sc);
                    break;
                case 3:
                    conta.verSaldo();
                    break;
                case 4:
                    conta.depositar(sc);
                    break;
                case 5:
                    System.out.println("Saindo... Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }
}