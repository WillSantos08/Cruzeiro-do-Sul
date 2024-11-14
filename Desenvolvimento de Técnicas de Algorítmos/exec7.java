import java.util.Scanner;
public class exec7 {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        int codCargo;
        double vAum, aSal, nSal;
        String nCargo;

        System.out.println("Informe o código de seu cargo: ");
        codCargo = obj.nextInt();

        System.out.println("Informe o seu atual salário: ");
        aSal = obj.nextDouble();

        switch(codCargo) {
            case 1 -> {
                nCargo = "Escrituário";
                vAum = aSal * 0.50;
            }
            case 2 -> {
                nCargo = "Secretário";
                vAum = aSal * 0.35;
            }
            case 3 -> {
                nCargo = "Caixa";
                vAum = aSal * 0.20;
            }
            case 4 -> {
                nCargo = "Gerente";
                vAum = aSal * 0.10;
            }
            case 5 -> {
                nCargo = "Diretor";
                vAum = aSal * 0;
            }
            default -> {
                System.out.println("O código do cargo é inválido");
                return;
            }
        }

        nSal = vAum + aSal;

        System.out.println("Seu cargo: " + nCargo + "\nValor do Aumento: " + vAum + "\nNovo Salário: " + nSal);
    }
}