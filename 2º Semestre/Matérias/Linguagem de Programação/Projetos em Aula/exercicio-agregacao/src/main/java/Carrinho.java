import java.util.List;

public class Carrinho {
    private String cliente;
    private List produtos;

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public Boolean existsPorNome(String nome) {


        return false;
    }

    public void limparCarrinho(){
        this.produtos.clear();
    }

    public void removerPorNome(String nome){
        for (int i = 0; i < this.produtos.size(); i++) {
            // if (produto.(nome) == nome) {}


        }
    }


}
