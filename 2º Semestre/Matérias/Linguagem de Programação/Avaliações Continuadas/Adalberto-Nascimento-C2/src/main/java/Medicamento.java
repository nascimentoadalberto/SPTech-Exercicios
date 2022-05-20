public class Medicamento {
    private Integer id;
    private String nomeMedicamento;
    private Integer quantidadeEstoque;
    private Double valorVenda;

    public Medicamento(Integer id, String nomeMedicamento) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.quantidadeEstoque = 0;
        this.valorVenda = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format(
            "\n-----------------------\n" +
            "Id: %d \nNome: %s \nQuantidade em Estoque: %d \nValor: %.2f \n" +
            "\n-----------------------\n",
            id, nomeMedicamento, quantidadeEstoque, valorVenda);
    }
}
