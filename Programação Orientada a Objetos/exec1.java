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

public class exec1 {
    
}