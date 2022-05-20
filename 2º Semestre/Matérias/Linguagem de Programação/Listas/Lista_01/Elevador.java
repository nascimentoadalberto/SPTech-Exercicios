package Lista_01;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso limite do elevador: ");
        Double limitePeso = scan.nextDouble();
        System.out.println("Digite o limite de pessoas dentro do elevador: ");
        Integer limitePessoas = scan.nextInt();

        System.out.println("Digite o peso da 1º pessoa: ");
        Double primeiraPessoa = scan.nextDouble();
        System.out.println("Digite o peso da 2º pessoa: ");
        Double segundaPessoa = scan.nextDouble();
        System.out.println("Digite o peso da 3º pessoa: ");
        Double terceiraPessoa = scan.nextDouble();

        Double pesoTotal = primeiraPessoa + segundaPessoa + terceiraPessoa;

        System.out.println(String.format(
                "Entraram 3 pessoas no elevador, no qual cabem %d pessoas. \n" +
                "O peso total no elevador é de %.2f, sendo que ele suporta %.2f",
                limitePessoas, pesoTotal, limitePeso));
    }
}
