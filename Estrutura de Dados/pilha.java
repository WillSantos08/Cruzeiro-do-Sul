import java.util.Stack;

public class pilha {

    static Stack<String> pilha = new Stack<>();

    static void shift(String prato){

        int lastIndex = pilha.size() - 1;

        if (lastIndex == -1) {
            pilha.push(prato);
            return;
        }

        for (int i = pilha.size() - 1; i >= 0; i--) {
            if (lastIndex == i) {
                pilha.push(pilha.get(i));
            } else {
                pilha.set(i + 1, pilha.get(i));
            }
        }

        pilha.set(0, prato);
    }


    public static void main(String[] args) {
        shift("PRATO A\n");
        shift("PRATO B\n");
        shift("PRATO C\n");
        shift("PRATO D\n");
    }
}




