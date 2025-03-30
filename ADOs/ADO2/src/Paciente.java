public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private boolean preferencial;

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        preferencial = this.idade >= 60 ? true : false;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", CPF: " + this.cpf;
    }

    public boolean equals(Paciente paciente) {
        return this.nome.equals(paciente.getNome()) && this.idade == paciente.getIdade() && this.cpf.equals(paciente.getCpf());
    }
}
