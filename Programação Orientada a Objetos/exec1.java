import java.util.ArrayList;
import java.util.Scanner;

abstract class Conta {
    private String nome;
    private double saldo;
    public String tipo;

    public Conta(String nome, double saldoInicial, String tipo) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f%n", saldo);
        } else {
            System.out.println("Valor inválido! O depósito deve ser maior que zero.");
        }
    }

    public void verSaldo() {
        System.out.printf("Saldo atual de %s: R$ %.2f%n", nome, saldo);
    }

    protected boolean temSaldoSuficiente(double valor) {
        return valor <= saldo;
    }

    protected void diminuirSaldo(double valor) {
        saldo -= valor;
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(String nome, double saldoInicial) {
        super(nome, saldoInicial, "Poupança");
    }

    @Override
    public void sacar(double valor) {
        if (temSaldoSuficiente(valor)) {
            diminuirSaldo(valor);
            System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f%n", getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class ContaEspecial extends Conta {
    public ContaEspecial(String nome, double saldoInicial) {
        super(nome, saldoInicial, "Especial");
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + 500) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f%n", getSaldo());
        } else {
            System.out.println("Limite excedido.");
        }
    }
}

class ContaNormal extends Conta {
    public ContaNormal(String nome, double saldoInicial) {
        super(nome, saldoInicial, "Normal");
    }

    @Override
    public void sacar(double valor) {
        if (temSaldoSuficiente(valor)) {
            diminuirSaldo(valor);
            System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f%n", getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}


class Banco {
    private ArrayList<Conta> contas;
    private Scanner sc;

    public Banco() {
        this.contas = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void cadastrarConta() {
        System.out.println("Escolha o tipo de conta:\n1. Normal\n2. Poupança\n3. Especial");
        int escolha = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine();

        Conta novaConta;
        switch (escolha) {
            case 1:
                novaConta = new ContaNormal(nome, saldoInicial);
                break;
            case 2:
                novaConta = new ContaPoupanca(nome, saldoInicial);
                break;
            case 3:
                novaConta = new ContaEspecial(nome, saldoInicial);
                break;
            default:
                System.out.println("Opção inválida. Conta não cadastrada.");
                return;
        }

        contas.add(novaConta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public Conta buscarConta() {
    System.out.print("Digite o nome da conta: ");
    String nome = sc.nextLine();

    for (Conta conta : contas) {
        if (conta.getNome().equalsIgnoreCase(nome)) {
            System.out.printf("Conta encontrada!\nTitular: %s\nTipo: %s\n", conta.getNome(), conta.tipo);
            return conta;
        }
    }

    System.out.println("Conta não encontrada.");
    return null;
    }


    public void menu() {
        int opcao;
        do {
            System.out.println("\nEscolha a opção desejada:");
            System.out.println("1 - Cadastrar Conta\n2 - Ver Saldo\n3 - Sacar\n4 - Depositar\n0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarConta();
                    break;
                case 2:
                    Conta contaSaldo = buscarConta();
                    if (contaSaldo != null) contaSaldo.verSaldo();
                    break;
                case 3:
                    Conta contaSaque = buscarConta();
                    if (contaSaque != null) {
                        System.out.print("Digite o valor do saque: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        contaSaque.sacar(valor);
                    }
                    break;
                case 4:
                    Conta contaDeposito = buscarConta();
                    if (contaDeposito != null) {
                        System.out.print("Digite o valor do depósito: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        contaDeposito.depositar(valor);
                    }
                    break;
                case 0:
                    System.out.println("Saindo... Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.menu();
    }
}