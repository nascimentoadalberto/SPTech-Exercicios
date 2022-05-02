public class PetShop {
    private String nome;
    private Double faturamento;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "PetShop{\n" +
                "   Nome da loja: " + nome +
                ",\n    Faturamento da loja:" + faturamento + "\n" +
                '}';
    }

    public void darBanho(Pet petInformado, Double valorInformado) {
        faturamento += valorInformado;

        Integer quantVisitasAtual = petInformado.getQuantVisitas();
        petInformado.setQuantVisitas(quantVisitasAtual + 1);
        petInformado.setTotalGastos(petInformado.getTotalGastos() + valorInformado);
    }

    public void darBanhoDesconto(Pet petInformado, Double valorInformado, Integer descontoInformado) {
        Double descontoFornecido = (descontoInformado / 100.00) * valorInformado;
        Double valorGasto = valorInformado - descontoFornecido;

        Integer quantVisitasAtual = petInformado.getQuantVisitas();
        petInformado.setQuantVisitas(quantVisitasAtual + 1);
        petInformado.setTotalGastos(petInformado.getTotalGastos() + valorGasto);
    }
}
