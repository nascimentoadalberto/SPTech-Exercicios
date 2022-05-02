package ac1;

import java.util.Scanner;

public class VendaLivros {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Bem vindo escritor! Realize o controle de lançamento de seu livro: ");
        System.out.print("Quantidade de livros em estoque: ");
        Integer livrosEstoque = scanNumber.nextInt();

        System.out.print("Meta de venda dos livros (%): ");
        Integer metaVendas = scanNumber.nextInt();
        Integer calculoVendas = (livrosEstoque * metaVendas) / 100;

        System.out.println(String.format("Para atingir a meta, você precisa vender %d livros!", calculoVendas));

        MenuOpcoes.main(livrosEstoque, metaVendas);
    }
}

// Feito por Adalberto Nascimento, 2ADSB, RA: 01212091