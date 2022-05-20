public class Farmacia {
    private String nome;
    private Integer quantidadeMedicamentoVendidos;
    private Integer quantidadeDescontosAplicados;

    public Farmacia(String nome) {
        this.nome = nome;
        this.quantidadeMedicamentoVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeMedicamentoVendidos() {
        return quantidadeMedicamentoVendidos;
    }

    public void setQuantidadeMedicamentoVendidos(Integer quantidadeMedicamentoVendidos) {
        this.quantidadeMedicamentoVendidos = quantidadeMedicamentoVendidos;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public void setQuantidadeDescontosAplicados(Integer quantidadeDescontosAplicados) {
        this.quantidadeDescontosAplicados = quantidadeDescontosAplicados;
    }

    public void realizarVenda(Medicamento medicamento, Double valorVenda){
        Integer idMedicamento = medicamento.getId();
        String nomeMedicamento = medicamento.getNomeMedicamento();
        Integer estoqueMedicamento = medicamento.getQuantidadeEstoque();
        Integer quantidadeVendida = 1;
        Integer totalVendas = getQuantidadeMedicamentoVendidos();

        if (estoqueMedicamento < 1) {
            System.out.println("Operação inválida. Estoque insuficiente.");
        } else {
            medicamento.setQuantidadeEstoque(estoqueMedicamento - quantidadeVendida);
            medicamento.setValorVenda(valorVenda);
            setQuantidadeMedicamentoVendidos(totalVendas + quantidadeVendida);

            System.out.println(String.format(
                "\n-----------------------\n" +
                "Id: %d \nNome: %s\nQuantidade em Estoque: %d \nValor: R$%.2f \n\nValor final: R$%.2f" +
                "\n-----------------------\n",
                idMedicamento, nomeMedicamento, estoqueMedicamento, valorVenda, (valorVenda * quantidadeVendida)
            ));
        }
    }

    public void realizarVenda(Medicamento medicamento, Double valorVenda, Integer valorBonus){
        Integer idMedicamento = medicamento.getId();
        String nomeMedicamento = medicamento.getNomeMedicamento();
        Integer estoqueMedicamento = medicamento.getQuantidadeEstoque();
        Integer quantidadeVendida = 1;
        Integer totalVendas = getQuantidadeMedicamentoVendidos();
        Integer totalDescontos = getQuantidadeDescontosAplicados();
        Double desconto = (valorBonus * 100) / valorVenda;

        if (estoqueMedicamento < 1) {
            System.out.println("Operação inválida");
        } else {
            medicamento.setQuantidadeEstoque(estoqueMedicamento - quantidadeVendida);
            medicamento.setValorVenda(valorVenda - desconto);
            setQuantidadeMedicamentoVendidos(totalVendas + quantidadeVendida);
            setQuantidadeDescontosAplicados(totalDescontos + quantidadeVendida);



            System.out.println(String.format(
                "\n-----------------------\n" +
                "Id: %d \nNome: %s\n Quantidade em Estoque: %d \nValor: R$%.2f \n\nValor do desconto: R$%.2f" +
                "\n-----------------------\n",
                idMedicamento, nomeMedicamento, estoqueMedicamento, (valorVenda - desconto), desconto
            ));
        }
    }

    public void cadastrarEstoque(Medicamento medicamento, Integer quantidadeAumentada){
        String nomeMedicamento = medicamento.getNomeMedicamento();
        Integer estoqueMedicamento = medicamento.getQuantidadeEstoque();

        medicamento.setQuantidadeEstoque(estoqueMedicamento + quantidadeAumentada);
        System.out.println(String.format("O estoque do medicamento %s foi aumentado!", nomeMedicamento));
    }

    @Override
    public String toString() {
        return String.format(
                "\n-----------------------\n" +
                "Farmácia %s \nQuantidade de vendas: %d \nDescontos Aplicados: %d" +
                "\n-----------------------\n",
                nome, quantidadeMedicamentoVendidos, quantidadeDescontosAplicados);
    }
}
