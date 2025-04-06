import java.util.ArrayList;
import java.util.Scanner;

class Conta {
    private String nome;
    private double saldo;
    public String tipo;

    // Construtor Conta
    public Conta(String nome, double saldoInicial, String tipo) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.tipo = "Normal";
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

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f%n", saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

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
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(String nome, double saldoInicial, String tipo) {
        super(nome, saldoInicial, tipo);
        this.tipo = "Poupança";
    }
}

class ContaEspecial extends Conta {
    public ContaEspecial(String nome, double saldoInicial, String tipo) {
        super(nome, saldoInicial, tipo);
        this.tipo = "Especial";
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
        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine();

        Conta novaConta = new Conta(nome, saldoInicial);
        contas.add(novaConta);
        System.out.println("Conta cadastrada com sucesso!");
    }

public class exec1 {
    
}