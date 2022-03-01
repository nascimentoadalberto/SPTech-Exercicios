package Lista_01;

import java.util.Scanner;

public class BolsaFilhos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos filhos você tem entre 0 e 3 anos: ");
        Integer filhosNovos = scan.nextInt();
        System.out.println("Digite quantos filhos você tem entre 4 e 16 anos: ");
        Integer filhosMeio = scan.nextInt();
        System.out.println("Digite quantos filhos você tem entre 17 e 18 anos: ");
        Integer filhosVelhos = scan.nextInt();

        Double bolsa = (25.12 * filhosNovos) + (15.88 * filhosMeio) + (12.44 * filhosVelhos);
        Integer totalFilhos = filhosNovos + filhosMeio + filhosVelhos;

        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilhos, bolsa));
    }
}
