package model;

public class Vetor {
    public String elementos[];
    public int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) throws Exception {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        return this.elementos[posicao];
    }

    public int busca1(String elemento) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
