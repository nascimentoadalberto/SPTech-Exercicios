import java.util.List;

public class Escola {
    private String nome;
    private Integer vagas;
    private List listaProf;

    public Escola(String nome, List listaProf) {
        this.nome = nome;
        this.vagas = 0;
        this.listaProf = listaProf;
    }


}
