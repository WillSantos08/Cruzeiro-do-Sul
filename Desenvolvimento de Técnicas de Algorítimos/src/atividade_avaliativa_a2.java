import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade_avaliativa_a2 {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int codigoAumento;
        float valorProduto;
        double aumentoProduto = 0, totalProduto;

        System.out.println("Informe o valor do produto: ");
        valorProduto = obj.nextFloat();

        System.out.println("Informe o código do aumento: ");
        codigoAumento = obj.nextInt();

        switch (codigoAumento) {
            case 1:
                aumentoProduto = 0.10;
                break;
            case 2:
                aumentoProduto = 0.15;
                break;
            case 3: 
                aumentoProduto = 0.20;
                break;
            case 4:
                aumentoProduto = 0.25;
                break;
            default:
                System.out.println("O código do aumento é inválido!");
                break;
        }

        totalProduto = valorProduto + (valorProduto * aumentoProduto);

        System.out.println("O seu produto após o aumento é de: R$ " + df.format(totalProduto));
        obj.close();
    }
}