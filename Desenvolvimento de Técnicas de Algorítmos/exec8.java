import java.util.Scanner;
public class exec8 {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        int tempo;
        double salario, resultado, bonus;
        String sexo;

        System.out.println("Informe seu sexo: ");
        sexo = obj.nextLine();

        System.out.println("Informe seu tempo de empresa em anos: ");
        tempo = obj.nextInt();

        System.out.println("Informe seu salário: ");
        salario = obj.nextDouble();

        if (sexo.equalsIgnoreCase("Homem") && tempo >= 15) {
            bonus = salario * 0.25;
            resultado = salario + bonus;
            System.out.println("Seu salário após o bonus é de R$" + resultado);
        } else  if (sexo.equalsIgnoreCase("Mulher") && tempo >= 10) {
            bonus = salario * 0.30;
            resultado = salario + bonus;
            System.out.println("Seu salário após o bonus é de R$" + resultado);
        } else if ((sexo.equalsIgnoreCase("Homem") && tempo != 15) || (sexo.equalsIgnoreCase("Mulher") && tempo != 10)) {
            bonus = 500;
            resultado = salario + bonus;
            System.out.println("Seu salário após o bonus é de R$" + resultado);
        } else {
            System.out.println("Você não existe!");
        }
    }
}