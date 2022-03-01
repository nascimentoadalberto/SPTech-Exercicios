package ProjetoIndividualJava;

import java.util.Scanner;

public class Funcao4 {
    // Fazer uma transferência
    public static void main(String nome, String conta, Double saldoTotal) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você selecionou a opção da transferência, então, digite os dados a seguir: ");
        System.out.print("Nome do Destinatário: ");
        String contaDestinatario = scan.nextLine();
        System.out.print("Conta do Destinatário: ");
        String nomeDestinatario = scan.nextLine();
        System.out.println("Banco do Destinatário");
        String bancoDestinatario = scan.nextLine();
        System.out.print("Agora, digite o valor a ser depositado: ");
        Double valorTransfer = scan.nextDouble();
        Double saldoTransfer = saldoTotal - valorTransfer;


        System.out.println(
                "Você confirma a transferência? \n" +
                "S -> sim\n" +
                "N -> não"
        );
        String confirmacao = scan.nextLine();

        if (valorTransfer > saldoTotal) {
            System.out.println("Transferência cancelada. Você voltará ao menu agora.");
            Utils.Menu(nome, conta, saldoTotal);
        } else {
            if (confirmacao.equals("n") || confirmacao.equals("N")) {
                System.out.println("Transferência cancelada. Você voltará ao menu agora.");
                Utils.Menu(nome, conta, saldoTotal);
            } else if (confirmacao.equals("S") || confirmacao.equals("s")) {
                System.out.println(String.format(
                        " Nome                       | %s \n" +
                        " Conta                      | %s \n" +
                        " Saldo (pré-operação)       | R$.2f \n" +
                        " Operação                   | Transferência\n" +
                        " Nome do Destinatário       | %s \n" +
                        " Conta do Destinatário      | %s \n" +
                        " Banco do Destinatário      | %s \n" +
                        " Valor transferido          | R$.2f \n" +
                        " Saldo (pós-operação)       | R$.2f \n",
                nome, conta, saldoTotal, nomeDestinatario, contaDestinatario,
                bancoDestinatario, valorTransfer, saldoTransfer));

                saldoTotal = saldoTransfer;
            }
        }
    }
}
