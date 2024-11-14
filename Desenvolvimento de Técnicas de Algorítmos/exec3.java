import java.util.Scanner;
public class exec3 {
    public static void main (String args[]){
        Scanner obj = new Scanner(System.in);
        int n1, n2, resto;
        System.out.println("Informe o primeiro valor: ");
        n1 = obj.nextInt();
        System.out.println("Informe o segundo valor: ");
        n2 = obj.nextInt();

        resto = n1 % n2;

        System.out.println("Soma: " + (n1 + n2) + "\nSubtração: " + (n1 - n2) + "\nMultiplicação: " + (n1 * n2) + "\nDivisão: " + (n1 / n2) + "\nResto: " + (resto));
    }
}