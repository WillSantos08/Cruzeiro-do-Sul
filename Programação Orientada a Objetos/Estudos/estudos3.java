package Estudos;
import java.util.Scanner;

public class estudos3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double resposta1 = obj.nextDouble(), total = 0.0;

        System.out.println("1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão \n5. Resto");
        int respostaTemp = obj.nextInt();

        System.out.println("Digite um número: ");
        double resposta2 = obj.nextDouble();

        switch(respostaTemp) {
            case 1:
                total = resposta1 + resposta2;
            case 2:
                total = resposta1 - resposta2;
            case 3:
                total = resposta1 * resposta2;
            case 4:
                total = resposta1 / resposta2;
            case 5:
                total = resposta1 % resposta2;
        }

        System.out.println("Total: " + total);
        obj.close();
    }
}
