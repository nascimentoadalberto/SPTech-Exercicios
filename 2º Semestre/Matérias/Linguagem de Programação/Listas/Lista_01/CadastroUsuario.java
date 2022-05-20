package Lista_01;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastre seu username: ");
        String loginCorreto = scan.nextLine();
        System.out.println("Cadastre sua senha: ");
        String senhaCorreta = scan.nextLine();
        System.out.println("Você deseja ter quantas tentativas de login?");
        Integer tentativas = scan.nextInt();

        String login;
        String senha;

        for (int i = (tentativas - 1); i >= 0; i--) {
            System.out.println("Login: ");
            login = scan.nextLine();

            System.out.println("Senha: ");
            senha = scan.nextLine();

            if (tentativas == 0) {
                System.out.println("Seu acesso foi bloqueado.");
            }
            if (login != loginCorreto || senha != senhaCorreta) {
                System.out.println(String.format("Login incorreto. Você tem %d tentativas antes de ser bloqueado.", tentativas));
                tentativas--;
            }
        }
    }
}
