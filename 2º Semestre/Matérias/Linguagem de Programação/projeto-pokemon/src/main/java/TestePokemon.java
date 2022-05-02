public class TestePokemon {
    public static void main(String[] args) {
        TreinadorPokemon Ash = new TreinadorPokemon("Ash");
        
        Pokemon toCharizard = new Pokemon("Charmander", "Fogo", 10.0);
        Pokemon toGyarados = new Pokemon("Magikarp", "Água", 0.0);
        Pokemon Eevee = new Pokemon("Eevee", "Normal", 13.0);

        for (int i = 0; i < 5; i++) {
            Ash.treinarPokemon(toCharizard);
            Ash.treinarPokemon(toGyarados);
        }

        System.out.println(toCharizard);
        System.out.println(toGyarados);
        System.out.println(Eevee);

        Ash.evoluirPokemon(toCharizard, "Charizard");
        Ash.evoluirPokemon(toGyarados, "Gyarados");

        System.out.println(toCharizard);
        System.out.println(toGyarados);
        System.out.println(Eevee);

        for (int i = 0; i < 2; i++) {
            Ash.treinarPokemon(Eevee);
        }

        System.out.println(Eevee);

        Ash.evoluirPokemon(Eevee, "Vaporeon");

        System.out.println(Ash);
    }
}
