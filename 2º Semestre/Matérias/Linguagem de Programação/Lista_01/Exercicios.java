package Lista_01;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o tempo (em minutos) de aquecimento: ");
        Integer aquecimento = scan.nextInt();

        System.out.println("Digite o tempo (em minutos) de exercícios aeróbicos: ");
        Integer aerobico = scan.nextInt();

        System.out.println("Digite o tempo (em minutos) de musculação: ");
        Integer musculacao = scan.nextInt();

        Integer minutos = (aquecimento + aerobico + musculacao);
        Integer calorias = ((aquecimento * 12) + (aerobico * 20) + (musculacao * 25));

        System.out.println(String.format("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", nome, minutos, calorias));
    }

}