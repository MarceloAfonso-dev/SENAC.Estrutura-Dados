import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorAtendimento ctrl = new ControladorAtendimento(10);

        try {
            ctrl.inserir(new Paciente("Marcelo", 19, "123"));
            ctrl.inserir(new Paciente("Marcos", 19, "222"));
            ctrl.inserir(new Paciente("Victor", 36, "796"));
            ctrl.inserir(new Paciente("Machado", 19, "55555"));
            ctrl.inserir(new Paciente("Marilda", 61, "456"));
            ctrl.inserir(new Paciente("Altair", 63, "031"));
            ctrl.inserir(new Paciente("Ignes", 86, "555"));
            ctrl.inserir(new Paciente("Roseli", 60, "22555"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            System.out.println("1. Solicitar nova senha (Comum ou Prioridade)");
            System.out.println("2. Excluir uma senha");
            System.out.println("3. Listar todas as senhas");
            System.out.println("4. Visualizar próximo");
            System.out.println("5. Chamar próximo");
            System.out.println("6. Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();
            sc.nextLine();
            try {
                if (op == 1) {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    ctrl.inserir(new Paciente(nome, idade, cpf));
                } else if (op == 2) {
                    System.out.print("Fila (1 - Prioritária, 2 - Comum): ");
                    int filaTipo = sc.nextInt();
                    System.out.print("Posição da senha: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    ctrl.excluirSenha(filaTipo == 1, pos);
                } else if (op == 3) {
                    ctrl.listarSenhas();
                } else if (op == 4) {
                    System.out.println("Próximo: " + ctrl.proximo());
                } else if (op == 5) {
                    ctrl.chamarProximo();
                } else if (op == 6) {
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
