package ProjetoIndividualJava;

import java.util.Scanner;

public class Funcao4 {
    // Fazer uma transferência
    public static void main(String nome, String conta, Double saldoTotal, Double valorInvestido) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("Você selecionou a opção da transferência, então, digite os dados a seguir: ");
        System.out.print("Nome do Destinatário: ");
        String contaDestinatario = scanString.nextLine();
        System.out.print("Conta do Destinatário: ");
        String nomeDestinatario = scanString.nextLine();
        System.out.print("Banco do Destinatário: ");
        String bancoDestinatario = scanString.nextLine();
        System.out.print("Agora, digite o valor a ser transferido: ");
        Double valorTransfer = scanDouble.nextDouble();
        Double saldoTransfer = saldoTotal - valorTransfer;


        System.out.println(
                "Você confirma a transferência? \n" +
                "S -> sim\n" +
                "N -> não"
        );
        String confirmacao = scanString.nextLine();

        if (valorTransfer > saldoTotal) {
            System.out.println("Transferência cancelada. O valor da transferência é maior que o seu saldo. Você voltará ao menu agora.");
            Utils.Menu(nome, conta, saldoTotal, valorInvestido);
        } else {
            if (confirmacao.equals("n") || confirmacao.equals("N")) {
                System.out.println("Transferência negada. Você voltará ao menu agora.");
                Utils.Menu(nome, conta, saldoTotal, valorInvestido);
            } else if (confirmacao.equals("S") || confirmacao.equals("s")) {
                System.out.println(String.format(
                        " Nome                       | %s \n" +
                        " Conta                      | %s \n" +
                        " Saldo (pré-operação)       | R$%.2f \n" +
                        " Operação                   | Transferência\n" +
                        " Nome do Destinatário       | %s \n" +
                        " Conta do Destinatário      | %s \n" +
                        " Banco do Destinatário      | %s \n" +
                        " Valor transferido          | R$%.2f \n" +
                        " Saldo (pós-operação)       | R$%.2f \n",
                nome, conta, saldoTotal, nomeDestinatario, contaDestinatario,
                bancoDestinatario, valorTransfer, saldoTransfer));

                saldoTotal = saldoTransfer;

                Utils.RetornoMenu(nome, conta, saldoTotal, valorInvestido);
            }
        }
    }
}
