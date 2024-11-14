
import java.util.Scanner;


public class exec4 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int horas, valor, salbruto;
        double inss, ir = 0, liq;

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        horas = obj.nextInt();
        System.out.println("Insira o valor da hora trabalhada: ");
        valor = obj.nextInt();

        salbruto = (horas + valor);

        if (salbruto <= 1000) {
            inss = salbruto * 0.08;
        }
        else {
            inss = salbruto * 0.09;
        }

        if (salbruto <= 500){
            ir = 0;
        }
        else if (salbruto > 500 && salbruto <= 1000) {
            ir = salbruto * 0.06;
        }
        else if (salbruto > 1000) {
            ir = salbruto * 0.07;
        }

        liq = salbruto - inss - ir;
        System.out.println("O seu salário líquido é de: R$ " + liq);
    }
}