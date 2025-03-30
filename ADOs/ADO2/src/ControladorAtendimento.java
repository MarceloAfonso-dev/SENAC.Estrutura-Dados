public class ControladorAtendimento {
    private FilaPrioritaria filaPrioritaria;
    private FilaComum filaComum;
    private int prioridadeCount;

    public ControladorAtendimento(int capacidade) {
        filaPrioritaria = new FilaPrioritaria(capacidade);
        filaComum = new FilaComum(capacidade);
    }

    public void inserir(Paciente p) throws Exception {
        if (p.isPreferencial())
            filaPrioritaria.inserir(p);
        else
            filaComum.inserir(p);
    }

    public Paciente proximo() throws Exception {
        return selecionarProximo(false);
    }

    public void chamarProximo() throws Exception {
        Paciente p = selecionarProximo(true);
        System.out.println("Chamando: " + p);
    }

    private Paciente selecionarProximo(boolean remove) throws Exception {
        if (prioridadeCount < 3 && filaPrioritaria.tamanho() > 0) {
            Paciente p = filaPrioritaria.proximo();
            if (remove) filaPrioritaria.chamarProximo();
            prioridadeCount++;
            return p;
        }
        if (filaComum.tamanho() > 0) {
            Paciente p = filaComum.proximo();
            if (remove) filaComum.chamarProximo();
            prioridadeCount = 0;
            return p;
        }
        if (filaPrioritaria.tamanho() > 0) {
            Paciente p = filaPrioritaria.proximo();
            if (remove) filaPrioritaria.chamarProximo();
            prioridadeCount = Math.min(prioridadeCount + 1, 3);
            return p;
        }
        throw new Exception("Fila vazia");
    }

    public void excluirSenha(boolean isPrioritaria, int pos) throws Exception {
        if (isPrioritaria)
            filaPrioritaria.remover(pos);
        else
            filaComum.remover(pos);
    }

    public void listarSenhas() {
        System.out.println("Fila Prioritária:");
        filaPrioritaria.listar();
        System.out.println("Fila Comum:");
        filaComum.listar();
    }
}
