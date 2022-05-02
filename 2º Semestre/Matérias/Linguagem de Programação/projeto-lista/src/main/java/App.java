import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // var nomes = []
        String[] testeArray = new String[10];

        testeArray[0] = "Alo";
        testeArray[1] = "oi";

        List listaEstranha = new ArrayList();


        listaEstranha.add("Matheus Moreschi");
        listaEstranha.add(42);
        listaEstranha.add(10.0);
        listaEstranha.add(true);

        System.out.println(listaEstranha);

        List<String> nomes = new ArrayList<String>();

        nomes.add("Giuliana");
        nomes.add("Matheus Moreschi");


        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }

        nomes.add(0, "Gerson");

        System.out.println(".".repeat(15));
        System.out.println("Depois do add(0, Gerson");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(String.format("Nome: %s", nomes.get(i)));
        }

        nomes.set(1, "Brandão");

        System.out.println(".".repeat(15));
        System.out.println("Depois do set(0, Brandão)");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(String.format("Nome: %s", nomes.get(i)));
        }

        nomes.remove(0);

        System.out.println(".".repeat(15));
        System.out.println("Depois do remove 0");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(String.format("Nome: %s", nomes.get(i)));
        }

        if (nomes.isEmpty()) {
            System.out.println("Está vazia!");
        } else {
            System.out.println("Não está vazia!");
        }

        System.out.println(".".repeat(20));

        nomes.add("Giuliana");
        nomes.add("Diego");
        nomes.add("Huk");

        nomes.forEach(nome -> {
            System.out.println("Nome: " + nome);
        });

        List<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(1);
        numerosInteiros.add(10);
        numerosInteiros.add(100);
        numerosInteiros.add(1000);

        for (Integer numerosInteiro : numerosInteiros) {
            System.out.println(numerosInteiro);
        }


        Animacao a1 = new Animacao("Shrek", 2001);
        Animacao a2 = new Animacao("One Piece", 1999);
        Animacao a3 = new Animacao("Samurai X", 1994);
        Animacao a4 = new Animacao("A Viagem de Chihiro", 2003);
        Animacao a5 = new Animacao("Dragon Ball", 1986);

        List<Animacao> animacoes = new ArrayList<>();
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);
        animacoes.add(a5);

        List<String> nomesAnimacao = new ArrayList<>();
        List<Integer> anosAnimacao = new ArrayList<>();

        for (Animacao animacao : animacoes) {
            System.out.println(animacao);
        }

    }


}