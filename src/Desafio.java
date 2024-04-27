import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "José";
        String tipoConta = "ContaCorrente";
        double saldo = 2500.99;
        int opcao = 0;

        System.out.println("*************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*************");

        String menu = """
                1- Consultar Saldo.
                2- Transferir Valor.
                3- Receber Valor.
                4- Sair

                \n*************
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja receber?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}

