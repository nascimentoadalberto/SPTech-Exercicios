package ProjetoIndividualJava;

import java.util.Scanner;

public class Funcao5 {
    public static void main(String nome, String conta, Double saldoTotal) {
        // Investimentos
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.println("Você selecionou a opção de investimentos, então, atente-se ao seguinte detalhe: o dinheiro a ser\n" +
                " investido será retirado do saldo da sua conta vigente. Esclarecido isso, por favor, digite os dados a seguir: ");
        System.out.println("Digite o nome da sua corretora: ");
        String nomeCorretora = scanString.nextLine();
        System.out.println("Digite o valor a ser investido: ");
        Double valorInvestido = scanDouble.nextDouble();
        System.out.println("Selecione o tipo de investimento: \n" +
                "1 -> Renda Fixa \n" +
                "2 -> Renda Variável \n" +
                "3 -> Fundos Imobiliários \n" +
                "4 -> LCI/LCA \n" +
                "5 -> Ações de Empresas \n" +
                "6 -> Tesouro Direto \n" +
                "7 -> CDB \n");
        Integer scanTipoInvestimento = scanDouble.nextInt();
        Double rendimento = 0.0;
        String tipoInvestimento = "";

        if (scanTipoInvestimento > 7 || scanTipoInvestimento < 0) {
            System.out.println("Investimento cancelado. O tipo do investimento selecionado não existe na nossa lista. Você voltará ao menu agora.");
            Utils.Menu(nome, conta, saldoTotal, valorInvestido);
        } else if (scanTipoInvestimento == 1) {
            rendimento = valorInvestido * 0.0449;
            tipoInvestimento = "Renda Fixa";
        } else if (scanTipoInvestimento == 2) {
            rendimento = valorInvestido * 0.058;
            tipoInvestimento = "Renda Variável";
        } else if (scanTipoInvestimento == 3) {
            rendimento = valorInvestido * 0.4253;
            tipoInvestimento = "Fundos Imobiliários";
        } else if (scanTipoInvestimento == 4) {
            rendimento = valorInvestido * 0.0478;
            tipoInvestimento = "LCI/LCA";
        } else if (scanTipoInvestimento == 5) {
            rendimento = valorInvestido * 0.4013;
            tipoInvestimento = "Ações de Empresas";
        } else if (scanTipoInvestimento == 6) {
            rendimento = valorInvestido * 0.14;
            tipoInvestimento = "Tesouro Direto";
        } else if (scanTipoInvestimento == 7) {
            rendimento = valorInvestido * 0.0417;
            tipoInvestimento = "CDB";
        }

        Double saldoAposInvestimento = saldoTotal - valorInvestido;
        System.out.println(
                "Você confirma o investimento? \n" +
                        "S -> sim\n" +
                        "N -> não"
        );
        String confirmacao = scanString.nextLine();

        if (valorInvestido > saldoTotal) {
            System.out.println("Investimento cancelado. O valor do investimento é maior que o seu saldo. Você voltará ao menu agora.");
            Utils.Menu(nome, conta, saldoTotal, valorInvestido);
        } else {
            if (confirmacao.equals("n") || confirmacao.equals("N")) {
                System.out.println("Investimento negado. Você voltará ao menu agora.");
                Utils.Menu(nome, conta, saldoTotal, valorInvestido);
            } else if (confirmacao.equals("S") || confirmacao.equals("s")) {
                System.out.println(String.format(
                        " Nome                       | %s \n" +
                        " Conta                      | %s \n" +
                        " Saldo (pré-operação)       | R$%.2f \n" +
                        " Operação                   | Investimento\n" +
                        " Tipo de investimento       | %s \n" +
                        " Nome da corretora          | $s \n" +
                        " Rendimento a.a.            | R$%.2f \n" +
                        " Valor investido            | R$%.2f\n" +
                        " Saldo (pós-operação)       | R$%.2f \n" +
                        " ",
                        nome, conta, saldoTotal, tipoInvestimento, nomeCorretora, rendimento, valorInvestido, saldoAposInvestimento));

                saldoTotal = saldoAposInvestimento;
                Utils.RetornoMenu(nome, conta, saldoTotal, valorInvestido);
            }
        }
    }
}
