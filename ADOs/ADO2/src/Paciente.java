public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private boolean preferencial;

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        preferencial = idade >= 60;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Paciente)) return false;
        Paciente p = (Paciente) obj;
        return nome.equals(p.nome) && idade == p.idade && cpf.equals(p.cpf);
    }
}
