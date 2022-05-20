import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> funcionarios;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.funcionarios = new ArrayList();
    }

    public Boolean existePorNome(String nome){
        for (Desenvolvedor funcionario : funcionarios)
            if(nome == funcionario.getNome()) {
                return true;
            }
        return false;
    }

    public void contratar(Desenvolvedor dev){
        String nomeDev = dev.getNome();

        if (vagas == 0){
            System.out.println("Não há vagas disponíveis!!!");
        } else {
            for (Desenvolvedor funcionario : funcionarios) {
                if (nomeDev == funcionario.getNome()){
                    System.out.println("Desenvolvedor já contratado!!!");
                } else {
                    funcionarios.add(funcionario);
                    vagas--;
                }
            }
        }
    }

    public Integer getQuantidadeDesenvolvedores(){
        return funcionarios.size();
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        return null;
    }

    public Double getTotalSalarios(){
        for (Desenvolvedor funcionario : funcionarios) {

        }

        return null;
    }

    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        return null;
    }

    @Override
    public String toString() {
        return "Consultoria{" +
                "nome='" + nome + '\'' +
                ", vagas=" + vagas +
                '}';
    }
}
