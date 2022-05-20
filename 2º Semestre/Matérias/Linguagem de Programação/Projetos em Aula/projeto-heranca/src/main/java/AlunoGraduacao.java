public class AlunoGraduacao extends Aluno{
    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao(Double notaContinuada, Double notaIntegrada, Integer ra, String nome) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlunoGraduacao{notaContinuada=").append(notaContinuada);
        sb.append(", notaIntegrada=").append(notaIntegrada);
        sb.append(", ra=").append(ra);
        sb.append(", ra=").append(nome);
        return sb.toString();
    }
}