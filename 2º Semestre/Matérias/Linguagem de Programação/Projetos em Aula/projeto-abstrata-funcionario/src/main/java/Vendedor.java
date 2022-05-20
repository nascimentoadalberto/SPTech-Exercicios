public class Vendedor extends Funcionario {
    private Double vendas;
    private Double comissao;
    private Funcionario funcionario;

    public Vendedor(String cpf, String nome, Double vendas, Double comissao, Funcionario funcionario) {
        super(cpf, nome);
        this.vendas = vendas;
        this.comissao = comissao;
        this.funcionario = funcionario;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = getVendas() * 0.25;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", comissao=" + comissao +
                ", funcionario=" + funcionario +
                '}';
    }

    @Override
    public Double calcularSalario() {
        return (getVendas() + getComissao());
    }
}
