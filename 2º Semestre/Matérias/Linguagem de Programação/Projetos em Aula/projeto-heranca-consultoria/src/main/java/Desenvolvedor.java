public abstract class Desenvolvedor {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = 0;
        this.valorHoraTrabalhada = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getSalario(){
        Double totalSalario = qtdHorasTrabalhadas * valorHoraTrabalhada;
        return totalSalario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", qtdHorasTrabalhadas=" + qtdHorasTrabalhadas +
                ", valorHoraTrabalhada=" + valorHoraTrabalhada +
                '}';
    }
}
