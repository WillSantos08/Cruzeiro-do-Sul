public class App {
    public static void main(String[] args) throws Exception {

        // Guerreiro
        Personagem guerreiro = new Personagem();
        guerreiro.nome = "Obaladin";
        guerreiro.vida = 15;
        guerreiro.forca = 5;
        guerreiro.Atacar();

        // Inimigo
        Personagem inimigo = new Personagem();
        inimigo.nome = "Goblin";
        inimigo.vida = 7;
        inimigo.forca = 2;
        inimigo.Atacar();
    }
}