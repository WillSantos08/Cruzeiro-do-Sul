import java.util.Scanner;
public class exec1 {
    public static void main (String agrs[]){
        Scanner obj = new Scanner(System.in);
        int n1, n2, n3, n4, media;
        System.out.println("Informe o primeiro número:");
        n1 = obj.nextInt();
        System.out.println("Informe o segundo número:");
        n2 = obj.nextInt();
        System.out.println("Informe o terceiro número:");
        n3 = obj.nextInt();
        System.out.println("Informe o quarto número:");
        n4 = obj.nextInt();

        media = ((n1 + n2 + n3 + n4)/ 4);

        System.out.println("A média dos números informados é de: " + (media));
    }
}