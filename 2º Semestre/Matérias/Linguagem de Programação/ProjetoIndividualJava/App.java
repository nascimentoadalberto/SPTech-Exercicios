package ProjetoIndividualJava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bem vindo(a) ao Banco Einstein!\n" +
                "Digite seu nome completo para começarmos: ");
        String nome = scan.nextLine();
        Utils.confirmacaoNomeCompleto(nome);
        System.out.println("E agora, digite o número da sua conta sem hífen, como no exemplo: 123456.");
        String conta = scan.nextLine();
        System.out.println("Por fim, digite o saldo total da sua conta: ");
        Double saldoTotal = scan.nextDouble();

        Utils.Menu(nome, conta, saldoTotal);
    }
}
