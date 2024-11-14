import java.util.Scanner;

public class exec11 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int nota = 0, idade = 0, qtdRegular = 0, qtdBom = 0, qtdOtimo = 0;
        double contaIdade = 0, somaIdade = 0;
        String SN = "s";

        // Loop de Repetição
        while (SN.equals("s")) {
            System.out.println("Informe a sua idade: ");
            idade = obj.nextInt();

            System.out.println("Informe sua nota: ");
            nota = obj.nextInt();

            if (nota == 3) {
                qtdOtimo++;
                contaIdade++;
                somaIdade = somaIdade + idade;
            } else if (nota == 2) {
                qtdBom++;
            } else if (nota == 1) {
                qtdRegular++;
            } else {
                System.out.println("O valor inserído não é válido!");
            }

            System.out.println("Deseja continuar a computar dados? (S/N)");
            SN = obj.next();
        }

        System.out.println("Média das Idades - " + somaIdade/contaIdade + "\nQuantidade Ótimo - " + qtdOtimo + "\nQuantidade Bom - " + qtdBom + "\nQuantidade Regular - " + qtdRegular);
    }
}