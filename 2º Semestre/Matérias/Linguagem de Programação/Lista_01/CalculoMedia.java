package Lista_01;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite duas notas: ");
        Double nota1 = scan.nextDouble();
        Double nota2 = scan.nextDouble();

        Double media = (nota1 + nota2) / 2;

        System.out.println(String.format("Olá %s, sua média é %.1f", nome, media));
    }
}
