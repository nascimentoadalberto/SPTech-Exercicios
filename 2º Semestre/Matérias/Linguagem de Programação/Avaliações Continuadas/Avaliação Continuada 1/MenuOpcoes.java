package ac1;

import java.util.Scanner;

public class MenuOpcoes {
    public static void main(Integer livrosEstoque, Integer metaVendas) {
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Escolha os próximos passos: \n" +
                "1 - Vender livros\n" +
                "2 - Sair");
        Integer opcao = scanNumber.nextInt();

        switch (opcao) {
            case 1 -> Vender.main(livrosEstoque, metaVendas);
            case 2 -> Encerrar.main();
        }
    }
}

// Feito por Adalberto Nascimento, 2ADSB, RA: 01212091