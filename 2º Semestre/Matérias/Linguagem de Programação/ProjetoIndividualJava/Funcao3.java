package ProjetoIndividualJava;

import java.util.Scanner;

public class Funcao3 {
    // Fazer um depósito
    public static void main(String nome, String conta, Double saldoTotal, Double valorInvestido) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("Você selecionou a opção do depósito, então, digite o valor a ser depositado: ");
        Double valorDeposito = scanDouble.nextDouble();
        Double saldoDeposito = saldoTotal + valorDeposito;

        System.out.println(
                "Você confirma o depósito? \n" +
                        "S -> sim\n" +
                        "N -> não"
        );
        String confirmacao = scanString.nextLine();

        if (confirmacao.equals("n") || confirmacao.equals("N")) {
            System.out.println("Depósito negado. Você voltará ao menu agora.");
            Utils.Menu(nome, conta, saldoTotal, valorInvestido);
        } else if (confirmacao.equals("S") || confirmacao.equals("s")) {
            System.out.println(String.format(
                " Nome                       | %s \n" +
                " Conta                      | %s \n" +
                " Saldo (pré-operação)       | R$%.2f \n" +
                " Operação                   | Depósito\n" +
                " Saldo (pós-operação)       | R$%.2f \n",
            nome, conta, saldoTotal, saldoDeposito));

            saldoTotal = saldoDeposito;
            Utils.RetornoMenu(nome, conta, saldoTotal, valorInvestido);
        }
    }
}
