import java.util.Scanner;
public class exec2 {
    public static void main (String args[]){
        Scanner obj = new Scanner (System.in);
        double vlrGasto;
        System.out.println("Informe o valor gasto:");
        vlrGasto = obj.nextDouble();

System.out.println("valor com 10% = " + (vlrGasto + (vlrGasto * 10)/100));
obj.close();
    }
}