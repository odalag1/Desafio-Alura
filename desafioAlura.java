import java.util.Scanner;

public class desafioAlura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeDoCliente = "";
        System.out.print("Boa noite! Seja bem-vindo(a)! Qual é o seu nome? ");
        nomeDoCliente = leitor.nextLine();
        int saldo = 0;
        System.out.print("Que ótimo tê-lo(a) aqui, " + nomeDoCliente + "! Quanto você gostaria de depositar para começar? ");
        saldo = leitor.nextInt();
        System.out.println("\nDados iniciais do cliente\n");
        System.out.println("Nome do cliente: " + nomeDoCliente);
        System.out.println("Tipo de conta: Conta-Corrente");
        System.out.println("Saldo inicial: " + saldo + " reais\n");
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma das opções abaixo para continuar:\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção desejada: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("\nSeu saldo atual é de: " + saldo + " reais.\n");
            } else if (opcao == 2) {
                float deposito = 0;
                System.out.print("\nDigite o valor que você deseja depositar: ");
                deposito = leitor.nextFloat();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso! Seu saldo agora é de " + saldo + " reais.\n");
            } else if (opcao == 3) {
                float transferir = 0;
                System.out.print("\nDigite o valor que você deseja transferir: ");
                transferir = leitor.nextFloat();
                if (transferir > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência. Tente um valor menor.\n");
                } else {
                    saldo -= transferir;
                    System.out.println("Transferência concluída! Seu saldo atual é de: " + saldo + " reais.\n");
                }
            } else if (opcao == 4) {
                System.out.println("\nObrigado por utilizar nosso sistema, " + nomeDoCliente + "! Até logo!");
                break;
            } else {
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções disponíveis no menu.\n");
            }
        }
    }
}