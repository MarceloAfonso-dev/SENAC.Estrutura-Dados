public class Fila {
    private Vetor pacientes;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila(int capacidade){
        pacientes = new Vetor(capacidade);
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void inserir(Paciente paciente) throws Exception {
        if (isFull()){
            throw new RuntimeException("Fila cheia");
        }
        pacientes.adiciona(paciente);
        ultimo = (ultimo + 1) % pacientes.elementos.length;
        total++;
    }

    public Paciente retirar() throws Exception {
        if (isEmpyt()){
            throw new RuntimeException("Fila vazia");
        }
        Paciente paciente = (Paciente) pacientes.busca(primeiro);
        primeiro = (primeiro + 1) % pacientes.elementos.length;
        total--;
        return paciente;
    }

    public boolean isEmpyt(){
        return total == 0;
    }

    public boolean isFull(){
        return total == pacientes.elementos.length;
    }
}
