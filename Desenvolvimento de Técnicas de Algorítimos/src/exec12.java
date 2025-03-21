import java.util.Scanner;
import java.util.Random;

public class exec12 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        Random generator = new Random();

        int numSorteado = generator.nextInt(10), escolhaJogador = 0, count = 0;

        while (count <= 3) {
            System.out.println("Tente advinhar o número sorteado: ");
            escolhaJogador = obj.nextInt();

            if (escolhaJogador == numSorteado) {
                System.out.println("PARABÉNS! VOCÊ ACERTOU O NÚMERO!");
                break;
            } else if (escolhaJogador > numSorteado) {
                count++;
                System.out.println("O NÚMERO DIGITADO É MAIOR DO QUE O SORTEADO, TENTE NOVAMENTE!");
            } else if (escolhaJogador < numSorteado) {
                count++;
                System.out.println("O NÚMERO DIGITADO É MENOR DO QUE O SORTEADO, TENTE NOVAMENTE!");
            }
        }

        if (escolhaJogador != numSorteado) {
            System.out.println("VOCÊ PERDEU O JOGO!");
        }

        obj.close();
    }
}
