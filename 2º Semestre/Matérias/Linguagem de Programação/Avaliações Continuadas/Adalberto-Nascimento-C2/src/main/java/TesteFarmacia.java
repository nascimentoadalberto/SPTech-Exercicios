public class TesteFarmacia {
    public static void main(String[] args) {
        Medicamento medicamento1 = new Medicamento(1, "Dipirona");
        Medicamento medicamento2 = new Medicamento(2, "Dorflex");

        Farmacia farmacia1 = new Farmacia("Drogasil");

        System.out.println(medicamento1);
        System.out.println(medicamento2);

        farmacia1.realizarVenda(medicamento1, 20.0);

        farmacia1.cadastrarEstoque(medicamento1, 10);
        farmacia1.cadastrarEstoque(medicamento2, 15);

        farmacia1.realizarVenda(medicamento1, 20.0);
        farmacia1.realizarVenda(medicamento2, 100.0, 20);

        System.out.println(medicamento1);
        System.out.println(medicamento2);

        System.out.println(farmacia1);
    }
}
