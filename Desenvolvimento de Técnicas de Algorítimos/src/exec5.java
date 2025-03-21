import java.util.Scanner;
public class exec5 {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);
        double HT, VH, PA, SB, NS;

        System.out.println("Informe a quantidade de Horas Trabalhadas no mês (HT):");
        HT = obj.nextDouble();

        System.out.println("Informe o valor de Horas Trabalhadas (VH):");
        VH = obj.nextDouble();

        System.out.println("Informe o valor de Percentual de Aumento (PA):");
        PA = obj.nextDouble();

        SB = HT * VH;
        NS = SB + ((SB * PA)/100);

        System.out.println("O seu novo valor de Salário Bruto é de " + (NS));

        obj.close();
    }
}