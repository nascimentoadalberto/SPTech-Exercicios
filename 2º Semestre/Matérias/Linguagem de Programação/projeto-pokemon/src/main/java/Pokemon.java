public class Pokemon {
    private String nomePokemon;
    private String tipoPokemon;
    private Double forcaPokemon;
    private Integer docesPokemon;

    public Pokemon(String nomePokemon, String tipoPokemon, Double forcaPokemon) {
        this.nomePokemon = nomePokemon;
        this.tipoPokemon = tipoPokemon;
        this.forcaPokemon = forcaPokemon;
        this.docesPokemon = 0;
    }

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public Double getForcaPokemon() {
        return forcaPokemon;
    }

    public void setForcaPokemon(Double forcaPokemon) {
        this.forcaPokemon = forcaPokemon;
    }

    public Integer getDocesPokemon() {
        return docesPokemon;
    }

    public void setDocesPokemon(Integer docesPokemon) {
        this.docesPokemon = docesPokemon;
    }

    @Override
    public String toString() {
        return String.format("\n\nPokémon {" +
                "\n     Nome do Pokémon: %s\n     Tipo do Pokémon: %s" +
                "\n     Força do Pokémon: %.2f\n     Total de doces do Pokémon: %d\n}\n\n",
                nomePokemon, tipoPokemon,
                forcaPokemon, docesPokemon);
    }
}
