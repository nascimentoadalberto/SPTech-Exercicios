package Lista_01;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salário bruto: ");
        Double bruto = scan.nextDouble();
        System.out.println("Digite sua condução (apenas ida): ");
        Double ida = scan.nextDouble();

        Double vt = ida * 44;
        Double descontos = (bruto * 0.1) + (bruto * 0.2) + vt;
        Double liquido = bruto - descontos;

        System.out.println(String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", bruto, descontos, liquido));
    }


}
