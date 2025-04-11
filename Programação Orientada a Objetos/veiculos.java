public interface veiculos {
    void acelerar();
    void frear();
}

class Carro implements veiculos {
    public void acelerar() {
        System.out.println("**SONS DE UM MOTOR INJETADO V8**");
    }

    public void frear() {
        System.out.println("**SONS DE FRENAGEM**");
    }
}

class Bicicleta implements veiculos {
    public void acelerar() {
        System.out.println("**RAN~ DAN DAN DAN DAN HAHAHAHAHHAHAHAHHA RAAAAAAAAAAAAA~**");
    }

    public void frear() {
        System.out.println("**CHEGA FÍ ACABOU A GRAÇA**");
    }
}

class testarVeiculos {
    public static void main(String[] args) {
        veiculos meuCarro = new Carro();
        veiculos minhaBicicleta = new Bicicleta();


        // ACELERA MUITO, ACELERA!
        meuCarro.acelerar();
        minhaBicicleta.acelerar();

        // PARÔ CHEGA FI, ACABOU A GRAÇA
        meuCarro.frear();
        minhaBicicleta.frear();
    }
}