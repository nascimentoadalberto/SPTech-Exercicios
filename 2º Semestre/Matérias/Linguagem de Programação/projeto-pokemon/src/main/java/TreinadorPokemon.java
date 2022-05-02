import java.util.Locale;

public class TreinadorPokemon {
    private String nomeTreinador;
    private Integer lvlTreinador;

    public TreinadorPokemon(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
        this.lvlTreinador = 1;
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public Integer getLvlTreinador() {
        return lvlTreinador;
    }

    public void setLvlTreinador(Integer lvlTreinador) {
        this.lvlTreinador = lvlTreinador;
    }

    @Override
    public String toString() {
        return String.format("\nTreinador de Pokémon\n{" +
                "\n     Nome do Treinador: %s" +
                "\n     Nível do Treinador: %d\n" +
                "}\n",
                nomeTreinador,
                lvlTreinador);
    }

    public void treinarPokemon(Pokemon pokemon) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Treinando Pokémon...");
        }

        // criando variáveis auxiliares
        Double aumentoForca = pokemon.getForcaPokemon() * 0.1;

        // setando os valores novos
        pokemon.setForcaPokemon(pokemon.getForcaPokemon() + aumentoForca); // aumentando a força do Pokémon em 10%
        pokemon.setDocesPokemon(pokemon.getDocesPokemon() + 10); // aumentando a quantidade de doces em 10
        lvlTreinador = lvlTreinador + 2; // aumentando o nível do treinador em 2

        System.out.println(String.format("%s treinado com sucesso!", pokemon.getNomePokemon().toUpperCase(Locale.ROOT)));
    }

    public void evoluirPokemon(Pokemon pokemon, String evolucao) {
        // criando variáveis auxiliares
        Integer quantDoces = pokemon.getDocesPokemon();
        Double forca = pokemon.getForcaPokemon();

        if (quantDoces >= 50) {
            System.out.println(
                String.format(
                    "Pokémon %s evoluiu para -> %s",
                    pokemon.getNomePokemon().toUpperCase(Locale.ROOT),
                    evolucao.toUpperCase(Locale.ROOT)
                )
            );

            pokemon.setNomePokemon(evolucao);
            pokemon.setDocesPokemon(quantDoces - 50);
            lvlTreinador = lvlTreinador + 10;

            if (forca == 0.0) {
                pokemon.setForcaPokemon(200.0);
            } else {
                pokemon.setForcaPokemon(forca * 10);
            }
        } else {
            System.out.println("Não foi possível evoluir o Pokémon selecionado. Quantidade de doces insuficiente.");
        }
    }
}
