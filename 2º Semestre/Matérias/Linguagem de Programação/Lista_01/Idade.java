package Lista_01;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println(String.format("Olá %s, qual o seu ano de nascimento?", nome));
        Integer anoNascimento = scan.nextInt();
        Integer calculoData = 2030 - anoNascimento;
        System.out.println(String.format("Em 2030 você terá %d anos", calculoData));
    }
}
