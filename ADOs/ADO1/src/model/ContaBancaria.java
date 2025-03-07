package model;

import java.math.BigDecimal;
import java.util.Random;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String agencia;
    private String numeroConta;
    private BigDecimal saldo;

    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = gerarAgencia();
        this.numeroConta = gerarNumeroConta();
        this.saldo = BigDecimal.ZERO;
    }

    private String gerarNumeroConta() {
        Random random = new Random();
        return String.valueOf(random.nextInt(99999)) + "-" + random.nextInt(9);
    }

    private String gerarAgencia() {
        Random random = new Random();
        return String.valueOf(random.nextInt(9999));
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "[Nome: " + this.nome + ", CPF: " + this.cpf + ", Agência: " + this.agencia + ", Número da Conta: " + this.numeroConta + ", Saldo: R$" + this.saldo + "]";
    }
}
