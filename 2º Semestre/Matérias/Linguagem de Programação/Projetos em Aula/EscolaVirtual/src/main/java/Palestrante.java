public class Palestrante extends Professor {
    private Integer qttyLives;
    private Double valorLives;

    public Palestrante(String nome, String curso, Integer qttyLives, Double valorLives) {
        super(nome, curso);
        this.qttyLives = qttyLives;
        this.valorLives = valorLives;
    }

    public Integer getQttyLives() {
        return qttyLives;
    }

    public void setQttyLives(Integer qttyLives) {
        this.qttyLives = qttyLives;
    }

    public Double getValorLives() {
        return valorLives;
    }

    public void setValorLives(Double valorLives) {
        this.valorLives = valorLives;
    }

    public Double calcularGanho() {
        return (super.calcularGanho() * getValorLives());
    }

    @Override
    public String toString() {
        return "Palestrante{" +
                "qttyLives=" + qttyLives +
                ", valorLives=" + valorLives +
                '}';
    }
}
