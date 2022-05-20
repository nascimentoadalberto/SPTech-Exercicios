public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile) {
        super(nome);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    public Double getSalario(Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
        Double totalSalario = (qtdHorasTrabalhadas * valorHoraTrabalhada) + super.getSalario();
        return totalSalario;
    }

    @Override
    public String toString() {
        return "DesenvolvedorMobile{" +
                "qtdHorasTrabalhadasMobile=" + qtdHorasTrabalhadasMobile +
                ", valorHoraTrabalhadaMobile=" + valorHoraTrabalhadaMobile +
                '}';
    }
}
