package Estudos;

public class estudos2 {
    public static void main(String[] args) {
        String nome = "William";
        int idade = 21;
        double altura = 1.70;
        boolean gostaDeJava = false;

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nGosta de Java: " + gostaDeJava);
    }
}

class converteTemperatura {
    public static void main(String[] args) {
        double Celcius = 0;
        double Fahrenheit = Celcius * (9 / 5) + 32;
        
        System.out.println("Resultado = " + Fahrenheit);
    }
}