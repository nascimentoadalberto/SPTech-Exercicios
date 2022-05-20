import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void adicionarContato(String nome, String telefone, Boolean bloqueado) {
        this.contatos.add(new Contato(nome, telefone, bloqueado));
    }

    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nome='" + nome + '\'' +
                ", contatos=" + contatos +
                '}';
    }
}