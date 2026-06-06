import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Relatório");
            System.out.println("0 - Sair");
S
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastrar");
                    break;

                case 2:
                    System.out.println("Listar");
                    break;

                case 3:
                    System.out.println("Buscar");
                    break;

                case 4:
                    System.out.println("Excluir");
                    break;

                case 5:
                    System.out.println("Relatório");
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}