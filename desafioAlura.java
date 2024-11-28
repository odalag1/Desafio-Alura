import java.util.Scanner;

public class desafioAlura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeDoCliente = "";
        System.out.print("Boa noite, qual é o seu nome: ");
        nomeDoCliente = leitor.nextLine();
        int saldo = 0;
        System.out.print("quanto que você quer depositar: ");
        saldo = leitor.nextInt();
        System.out.println("Dados iniciais do cliente\n");
        System.out.println("Nome do cliente: " + nomeDoCliente);
        System.out.println("Tipo de conta: Conta-Corrente");
        System.out.println("Saldo atual: " + saldo +"\n");
        int opçao = 0;

        while (opçao != 4) {
            System.out.println("Operações\n");
            System.out.println("1- Consultar Saldo:");
            System.out.println("2- Depositar valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("Digite a opção desejada: \n");
            opçao = leitor.nextInt();

            if (opçao == 1) {
                System.out.println(" Saldo atual é: " + saldo +"\n");
            } else if (opçao == 2) {
                float deposito = 0;
                System.out.print("Digite quanto você quer depositar:");
                deposito = leitor.nextFloat();
                saldo += deposito;
                System.out.println("Saldo atualizado é " + saldo + "\n");
            } else if (opçao == 3) {
                float transferir = 0;
                System.out.print("Digite quanto você quer transferir do seu saldo: ");
                transferir = leitor.nextFloat();
                saldo -= transferir;
                System.out.println("Saldo atual é: " + saldo + "\n");
                if (transferir > saldo) {
                    System.out.println("Dinheiro insuficiente para transferencia do valor\n");
                }
            } else if (opçao == 4) {
                break;
            } else {
                System.out.println("opção invalida. Digite umas da quatro opções\n");
            }
        }
    }
}