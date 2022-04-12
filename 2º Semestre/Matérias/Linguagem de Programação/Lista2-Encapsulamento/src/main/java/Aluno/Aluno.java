public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;

    public void setRa(String newRa) {
        ra = newRa;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }
    public void setCurso(String newCurso) {
        curso = newCurso;
    }
    public void setNota1(Double newNota1) {
        if (newNota1 >= 0.0 || newNota1 <= 10.0) {
            nota1 = newNota1;
        }
    }
    public void setNota2(Double newNota2) {
        if (newNota2 <= 10.0 && newNota2 >= 0.0) {
            nota2 = newNota2;
        } else {
            nota2 = 0.0;
        }

    }

    public String getRa() {
        return ra;
    }
    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return curso;
    }
    public Double getNota1() {
        return nota1;
    }
    public Double getNota2() {
        return nota2;
    }
    public Double getMediaNotas() {
        Double mediaNotas = (nota1 + nota2) / 2;
        return mediaNotas;
    }
}

