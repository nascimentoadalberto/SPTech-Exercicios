import java.util.List;

public class App {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Cindy", "12345678", false);
        Contato contato2 = new Contato("Jesus", "98765432", false);
        Contato contato3 = new Contato("GuiBig", "56473892", true);

        Grupo hiveward = new Grupo("Hiveward");

        System.out.println(contato1);
        System.out.println("---------------------------");
        System.out.println(contato2);
        System.out.println("---------------------------");
        System.out.println(contato3);
        System.out.println("---------------------------");
        //System.out.println(hiveward);

        hiveward.adicionarContato(contato1);
        hiveward.adicionarContato(contato2);
        hiveward.adicionarContato(contato3);

        //hiveward.setContatos((List<Contato>) contato2);
        //hiveward.setContatos((List<Contato>) contato3);


        System.out.println("---------------------------");
        System.out.println(hiveward);
    }
}
