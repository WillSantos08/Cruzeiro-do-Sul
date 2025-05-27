import java.util.Random;

public class Personagem {
    String nome;
    int vida;
    int forca;

    int calculoDano() {
        Random random = new Random();
        int d4 = 1 + random.nextInt(4);
        int dano = forca + d4;
        return dano;
    }

    void Atacar() {
        System.out.format("O personagem %s ataca seu inimigo, causando %d de dano!\n", nome, calculoDano());
    }

}