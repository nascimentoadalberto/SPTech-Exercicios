package ProjetoIndividualJava;

import java.util.Scanner;

public class Funcao1 {
    // Ver extrato
    public static void main(String nome, String conta, Double saldoTotal, Double valorInvestido) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você selecionou a opção do extrato, então, para iniciarmos, precisamos de algumas informações.\n" +
                "Por favor, digite a soma total das saídas feitas nessa semana: ");
        Double extratoSaida = scan.nextDouble();
        System.out.println("Ótimo, agora, por favor, digite as entradas:");
        Double extratoEntrada = scan.nextDouble();

        System.out.println(String.format(
                " Nome        | %s \n" +
                " Conta       | %s \n" +
                " Saldo       | R$%.2f \n" +
                " Entradas    | R$%.2f \n" +
                " Saídas      | R$%.2f \n" +
                " Investidos  | RS%.2f",
        nome, conta, saldoTotal, extratoEntrada, extratoSaida, valorInvestido));

        Utils.RetornoMenu(nome, conta, saldoTotal, valorInvestido);
    }
}
