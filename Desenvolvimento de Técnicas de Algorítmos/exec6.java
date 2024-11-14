import java.util.Scanner;
public class exec6 {
    public static void main (String args []) {
        Scanner obj = new Scanner(System.in);
        
        int A, B, C, X;

        System.out.println("Informe o valor 'A':");
        A = obj.nextInt();

        System.out.println("Informe o valor 'B':");
        B = obj.nextInt();

        System.out.println("Informe o valor 'X':");
        X = obj.nextInt();

        if (X >= 10) {
            C = A + B;
        }
        else {
            C = A - B;
        }

        System.out.println("O resultado final é" + C);
    }
}