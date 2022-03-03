package ProjetoIndividualJava;

import java.util.Scanner;

public class Funcao2 {
    // Fazer um saque
    public static void main(String nome, String conta, Double saldoTotal, Double valorInvestido) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("Você selecionou a opção do saque, então, digite o valor a ser retirado: ");
        Double valorSaque = scanDouble.nextDouble();
        Double saldoSaque = saldoTotal - valorSaque;

        System.out.println(
            "Você confirma o saque? \n" +
                "S -> sim\n" +
                "N -> não"
        );
        String confirmacao = scanString.nextLine();

        if (valorSaque > saldoTotal) {
            System.out.println("Saque cancelado. O valor do saque é maior que o seu saldo. Você voltará ao menu agora.");
            Utils.Menu(nome, conta, saldoTotal, valorInvestido);
        } else {
            if (confirmacao.equals("n") || confirmacao.equals("N")) {
                System.out.println("Saque negado. Você voltará ao menu agora.");
                Utils.Menu(nome, conta, saldoTotal, valorInvestido);
            } else if (confirmacao.equals("S") || confirmacao.equals("s")) {
                System.out.println(String.format(
                    " Nome                       | %s \n" +
                    " Conta                      | %s \n" +
                    " Saldo (pré-operação)       | R$%.2f \n" +
                    " Operação                   | Saque \n" +
                    " Saldo (pós-operação)       | R$%.2f \n",
                nome, conta, saldoTotal, saldoSaque));

                saldoTotal = saldoSaque;

                Utils.RetornoMenu(nome, conta, saldoTotal, valorInvestido);
            }
        }
    }
}
