package ac1;

import java.util.Scanner;

public class Vender {
    public static void main(Integer livrosEstoque, Integer metaVendas) {
        Integer estoque = livrosEstoque;
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Digite a quantidade de livros escolhida: ");
        Integer quantLivros = scanNumber.nextInt();
        Integer contadorVenda = 1;
        Integer livrosVendidos = 0;
        Integer quantLivrosErro = 0;

        if (quantLivros > livrosEstoque || quantLivrosErro > livrosEstoque) {
            do {
                System.out.println(String.format("Infelizmente você não possui exemplares suficientes para a venda.\n" +
                        "Quantidade disponível: %d\n" +
                        "Digite uma quantidade válida: ", livrosEstoque));
                quantLivrosErro = scanNumber.nextInt();
                quantLivros = quantLivrosErro;
            } while (quantLivros > livrosEstoque || quantLivrosErro > livrosEstoque);
        }
        if (quantLivros < livrosEstoque) {
            for (contadorVenda = 1; contadorVenda <= quantLivros; contadorVenda++) {
                System.out.println(String.format("Vendendo %dº livro...", contadorVenda));
            }
            livrosVendidos = estoque - (contadorVenda + 1);
            System.out.println(String.format("Você acabou de vender %d livros!\n" +
                    "Quantidade em estoque: %d \n" +
                    "Meta de vendas: %d", quantLivros, livrosVendidos, metaVendas));
        }
        Encerrar.main();
    }
}

// Feito por Adalberto Nascimento, 2ADSB, RA: 01212091