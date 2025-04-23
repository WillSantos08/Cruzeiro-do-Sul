public interface forma {
    float area();
    void mostra();
    float perimetro();
}

//  Circunferencia:

class circunferencia implements forma {
    float raio;

    public circunferencia(float raio) {
        this.raio = raio;
    }

    public float area() {
        float area = (float) (Math.PI * Math.pow(raio, 2));
        return area;
    }

    public float perimetro() {
        float perimetro = (float) (2 * Math.PI * raio);
        return perimetro;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void mostra() {
        System.out.println("Circunferência\nÁrea: " + area() + "\nPerimetro: " + perimetro() + "\n");
    }
}

// Triângulo

class triangulo implements forma {
    float base;
    float altura;

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float area() {
        float area = base * altura;
        return area;
    }

    public float perimetro() {
        return 0f;
    }

    public void mostra() {
        System.out.println("Triângulo\nÁrea: " + area() + "\n");
    }
}

// Retângulo

class retangulo extends triangulo {
    public retangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float area() {
        float area = base * altura;
        return area;
    }

    @Override
    public float perimetro() {
        float perimetro = 2 * (base * altura);
        return perimetro;
    }

    @Override
    public void mostra() {
        System.out.println("Retângulo\nÁrea: " + area() + "\nPerímetro: " + perimetro() + "\n");
    }
}

class testarForma {
    public static void main(String[] agrs) {
        forma circulo = new circunferencia(4);
        forma triangulo = new triangulo(3, 5);
        forma retangulo = new retangulo(7, 3);
        
        // Mostra no console
        circulo.mostra();
        triangulo.mostra();
        retangulo.mostra();
    }
}