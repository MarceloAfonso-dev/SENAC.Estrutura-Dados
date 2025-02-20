import model.Vetor;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try {
            vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2");
            vetor.adicionar("Elemento 3");
            vetor.adicionar("Elemento 4");
            vetor.adicionar("Elemento 5");
            vetor.adicionar("Elemento 6");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.toString() + "\n Tamanho: " + vetor.tamanho());
    }
}