public class Horista extends Funcionario{
    private Integer qttyHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qttyHora, Double valorHora) {
        super(cpf, nome);
        this.qttyHora = qttyHora;
        this.valorHora = valorHora;
    }

    public Integer getQttyHora() {
        return qttyHora;
    }

    public void setQttyHora(Integer qttyHora) {
        this.qttyHora = qttyHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "qttyHora=" + qttyHora +
                ", valorHora=" + valorHora +
                '}';
    }

    @Override
    public Double calcularSalario() {
        return (getQttyHora() * getValorHora());
    }
}
