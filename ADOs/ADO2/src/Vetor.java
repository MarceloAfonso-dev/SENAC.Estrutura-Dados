public class Vetor {
    public Object[] elementos;
    public int tamanho;

    public Vetor(int capacidade) {
        elementos = new Object[capacidade];
        tamanho = 0;
    }

    public void adiciona(Object elemento) throws Exception {
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public Object busca(int pos) throws Exception {
        if (pos < 0 || pos >= tamanho) throw new Exception("Posição inválida");
        return elementos[pos];
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            Object[] novo = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }

    public void remove(int pos) throws Exception {
        if (pos < 0 || pos >= tamanho) throw new Exception("Posição inválida");
        for (int i = pos; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }
}
