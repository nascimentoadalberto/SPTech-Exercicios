public class Animacao {
    private String nome;;
    private Integer anoLancamento;

    public Animacao(String nome, Integer anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Animacao{" + "nome=" + nome + ", anoLancamento=" + anoLancamento + '}';
    }


}