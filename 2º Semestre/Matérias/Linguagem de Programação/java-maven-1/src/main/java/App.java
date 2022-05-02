import com.github.britooo.looca.api.core.Looca;
import com.github.javafaker.Faker;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Faker faker = new Faker(Locale.forLanguageTag("pt-br"));
        Looca looca = new Looca();

//        System.out.println("Nome: " + faker.name().fullName());
        System.out.println(looca.getMemoria());
        System.out.println(looca.getProcessador());
        System.out.println(looca.getTemperatura());
        System.out.println(looca.getSistema());


    }
}
