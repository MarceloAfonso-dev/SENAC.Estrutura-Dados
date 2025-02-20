package model;

import java.util.Arrays;

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

    public String toString() {
        return Arrays.toString(elementos);
    }
}
