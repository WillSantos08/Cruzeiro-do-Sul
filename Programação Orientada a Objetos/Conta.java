import java.util.Scanner;

public class Conta {
    String Nome = "";
    double Saldo = 0;
    double Saque = 0;

    public void Cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        this.Nome = sc.nextLine();
        System.out.println("Digite seu saldo: ");
        this.Saldo = sc.nextDouble();
        sc.close();
    }

    public void Saque() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        this.Saque = sc.nextDouble();

        if (this.Saque <= this.Saldo) {
            this.Saldo -= this.Saque;
            System.out.println("Saque realizado com sucesso. Seu saldo atual é: " + this.Saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        sc.close();
    }

    public void Saldo() {
        System.out.println("Seu saldo atual é: " + this.Saldo);
    }

    public class InnerConta {

        public void menu() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha a opção desejada:\n1 - Cadastrar\n2 - Saque\n3 - Saldo\n4 - Sair");
            int opcao = sc.nextInt();

            while (opcao != 4) {
                switch (opcao) {
                    case 1:
                        Cadastrar();
                        break;
                    case 2:
                        Saque();
                        break;
                    case 3:
                        Saldo();
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                System.out.println("Escolha a opção desejada:\n1 - Cadastrar\n2 - Saque\n3 - Saldo\n4 - Sair");
                opcao = sc.nextInt();

                sc.close();
            }
            System.out.println("Saindo... Obrigado!");
        }
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        InnerConta innerConta = conta.new InnerConta();
        innerConta.menu();
    }
}