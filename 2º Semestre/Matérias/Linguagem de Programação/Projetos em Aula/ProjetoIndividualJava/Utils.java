package ProjetoIndividualJava;

import java.util.Scanner;

public class Utils {
    public static void Menu(String nome, String conta, Double saldoTotal, Double valorInvestido) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println(nome + ", selecione uma das opções abaixo para iniciarmos seu atendimento:\n" +
                "1 -> Ver extrato\n" +
                "2 -> Realizar saque\n" +
                "3 -> Realizar depósito\n" +
                "4 -> Realizar uma transferência\n" +
                "5 -> Realizar um investimento\n" +
                "6 -> Encerrar o programa");

        Integer optionsMenu = scanDouble.nextInt();

        switch (optionsMenu) {
            case 1 -> Funcao1.main(nome, conta, saldoTotal, valorInvestido);
            case 2 -> Funcao2.main(nome, conta, saldoTotal, valorInvestido);
            case 3 -> Funcao3.main(nome, conta, saldoTotal, valorInvestido);
            case 4 -> Funcao4.main(nome, conta, saldoTotal, valorInvestido);
            case 5 -> Funcao5.main(nome, conta, saldoTotal);
            case 6 -> Funcao6.main();
        }
    }

    public static void RetornoMenu(String nome, String conta, Double saldoTotal, Double valorInvestido) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("Deseja voltar para o menu?\n" +
                "1 -> sim\n" +
                "2 -> não\n");
        Integer optionsRetornoMenu = scanDouble.nextInt();

        switch (optionsRetornoMenu) {
            case 1 -> Utils.Menu(nome, conta, saldoTotal, valorInvestido);
            case 2 -> Funcao6.main();
        }
    }
}
