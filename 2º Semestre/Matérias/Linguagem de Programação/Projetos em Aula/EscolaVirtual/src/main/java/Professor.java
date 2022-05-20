public class Professor {
    private String nome;
    private String curso;
    private Double valorCurso;
    private Integer qttyAlunos;

    public Professor(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.valorCurso = 0.0;
        this.qttyAlunos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Integer getQttyAlunos() {
        return qttyAlunos;
    }

    public void setQttyAlunos(Integer qttyAlunos) {
        this.qttyAlunos = qttyAlunos;
    }

    public Double calcularGanho() {
        return ((getValorCurso() * 0.05) * getQttyAlunos());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", valorCurso=" + valorCurso +
                ", qttyAlunos=" + qttyAlunos +
                '}';
    }
}
