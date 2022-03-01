package Lista_01;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        Double produto = scan.nextDouble();

        System.out.println("Digite a quantidade vendida: ");
        Integer quant = scan.nextInt();

        System.out.println("Digite o valor pago pelo cliente: ");
        Double pagamento = scan.nextDouble();

        Double precoFinal = (produto * quant);
        Double pagamentoMenor = precoFinal - pagamento;
        Double troco = pagamento - precoFinal;

        if (pagamento == precoFinal) {
            System.out.println("Boas compras! Não há troco pendente.");
        } else if (pagamento < precoFinal) {
            System.out.println(String.format("Ainda faltam R$%.2f para completar o pagamento.", pagamentoMenor));
        } else if (pagamento > precoFinal) {
            System.out.println(String.format("Seu troco será de R$%.2f. Volte sempre!", troco));
        }
    }
}