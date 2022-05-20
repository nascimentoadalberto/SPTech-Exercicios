package Lista_01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer primNum = scan.nextInt();
        System.out.println("Digite um número: ");
        Integer segNum = scan.nextInt();

        Integer soma = primNum + segNum;
        Integer sub = primNum - segNum;
        Integer mult = primNum * segNum;
        Integer div = primNum / segNum;

        System.out.println(String.format("Soma: %d \nSubtração: %d \nMultiplicação: %d \nDivisão: %d", soma, sub, mult, div));
    }
}
