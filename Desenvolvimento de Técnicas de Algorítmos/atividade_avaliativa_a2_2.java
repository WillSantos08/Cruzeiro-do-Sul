import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade_avaliativa_a2_2 {
    public static void main (String args[]){
        Scanner obj = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double valorMorango = 0, valorMaca = 0, valorPera = 0, pesoMorango, pesoMaca, pesoPera, totalProduto;

        System.out.println("Informe quantos quilos (Kg) de Morango você deseja: ");
        pesoMorango = obj.nextDouble();

        System.out.println("Informe quantos quilos (Kg) de Maçã você deseja: ");
        pesoMaca = obj.nextDouble();

        System.out.println("Informe quantos quilos (Kg) de Pêra você deseja: ");
        pesoPera = obj.nextDouble();

        // Morango
        if (pesoMorango >= 5) {
            valorMorango = (pesoMorango * 2.20);
        }
        else if (pesoMorango <= 5) {
            valorMorango = (pesoMorango * 2.50);
        }
        // Maçã
        if (pesoMaca > 5) {
            valorMaca = (pesoMaca * 2.50);
        }
        else if (pesoMaca <= 5) {
            valorMaca = (pesoMaca * 2.80);
        }
        // Pêra
        if (pesoPera > 5) {
            valorPera = (pesoPera * 2.10);
        }
        else if (pesoPera <= 5) {
            valorPera = (pesoPera * 2.20);
        }

        // Se o valor do morango for maior que R$ 25,00
        if (pesoMorango > 8 && valorMorango > 25) {
            valorMorango = valorMorango - (valorMorango * 0.05);
        }
        if (pesoMaca > 8 && valorMaca > 25) {
            valorMaca = valorMaca - (valorMaca * 0.05);
        }
        if (pesoPera > 8 && valorPera > 25) {
            valorPera = valorPera - (valorPera * 0.05);
        }

        totalProduto = valorMorango + valorMaca + valorPera;

        System.out.println("Morangos (Kg): " + pesoMorango + "\nR$ " + df.format(valorMorango) + "\nMaçãs (Kg): " + pesoMaca + "\nR$ " + df.format(valorMaca) + "\nPêras (Kg): " + pesoPera + "\nR$ " + df.format(valorPera) + "\n\nValor Total: R$ " + df.format(totalProduto));
    }
}