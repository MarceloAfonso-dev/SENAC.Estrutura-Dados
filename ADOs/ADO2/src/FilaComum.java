public class FilaComum {
    private Vetor pacientes;

    public FilaComum(int capacidade) {
        pacientes = new Vetor(capacidade);
    }

    public void inserir(Paciente p) throws Exception {
        pacientes.adiciona(p);
    }

    public Paciente proximo() throws Exception {
        if (pacientes.tamanho() == 0) throw new Exception("Fila vazia");
        return (Paciente) pacientes.busca(0);
    }

    public Paciente chamarProximo() throws Exception {
        if (pacientes.tamanho() == 0) throw new Exception("Fila vazia");
        Paciente p = (Paciente) pacientes.busca(0);
        pacientes.remove(0);
        return p;
    }

    public void remover(int pos) throws Exception {
        pacientes.remove(pos);
    }

    public int tamanho() {
        return pacientes.tamanho();
    }

    public void listar() {
        for (int i = 0; i < pacientes.tamanho(); i++) {
            try {
                System.out.println(pacientes.busca(i));
            } catch (Exception e) {}
        }
    }
}
