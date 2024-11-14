import java.util.Scanner;

public class exec13 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int numero = 0, ContagemNegativa = 0, ContagemPositiva = 0;

        for (int i = 0; i == 10; i++) {
            System.out.println("Digite um número (positivo ou negativo): ");
            numero = obj.nextInt();
        }

        if (numero < 0) {
            ContagemNegativa++;
        } else if (numero > 0) {
            ContagemPositiva++;
        } else {
            System.out.println("Valor Null/Zero.");
        }

        System.out.println("Números Positivos: " + ContagemPositiva + "\nNúmerosNegativos: " + ContagemNegativa);
    }
}
