import model.ContaBancaria;
import model.VetorObjeto;

import java.math.BigDecimal;

public class MainTest {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Fulano", "123.456.789-00");
        ContaBancaria conta2 = new ContaBancaria("Ciclano", "987.654.321-00");
        ContaBancaria conta3 = new ContaBancaria("Beltrano", "456.789.123-00");
        ContaBancaria conta4 = new ContaBancaria("João", "789.123.456-00");
        ContaBancaria conta5 = new ContaBancaria("Maria", "321.654.987-00");
        ContaBancaria conta6 = new ContaBancaria("José", "654.987.321-00");
        conta1.depositar(new BigDecimal("1000"));
        conta2.depositar(new BigDecimal("2000"));
        conta3.depositar(new BigDecimal("3000"));
        conta4.depositar(new BigDecimal("1000000"));
        conta5.depositar(new BigDecimal("100000000"));
        conta6.depositar(new BigDecimal("250"));


        VetorObjeto vetor = new VetorObjeto(5);

        try {
            vetor.adiciona(conta1);
            vetor.adiciona(conta2);
            vetor.adiciona(conta3);
            vetor.adiciona(conta4);
            vetor.adiciona(conta5);

            System.out.println("Tamanho do vetor de Contas Bancárias: " + vetor.tamanho());
            System.out.println("Conta na posição 5: " + vetor.busca(4));
            System.out.println("Dados de Maria: " + vetor.busca1("Maria"));

            vetor.adiciona(conta6);
            System.out.println("Tamanho do vetor de após passar de 5 Contas: " + vetor.tamanho());
            System.out.println(vetor.toString());
            vetor.remove(1);
            System.out.println("Dados após exclusão da primeira conta: \n" + vetor.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
