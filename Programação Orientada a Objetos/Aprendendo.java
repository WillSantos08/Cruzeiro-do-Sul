class Carro { // Construtor do objeto
    String cor;
    int velocidade;

    void acelerar() { // Método do objeto
        velocidade += 10;
    }
}

public class Aprendendo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Criando objeto "meuCarro"
        meuCarro.cor = "Vermelho"; // Declarando parâmetro
        meuCarro.acelerar(); // Declarando método
    }
}