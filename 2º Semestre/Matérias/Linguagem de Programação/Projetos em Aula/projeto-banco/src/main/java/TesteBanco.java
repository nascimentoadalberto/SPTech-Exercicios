import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TesteBanco {
    public static void main(String[] args) {
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());

        String criacaoTablePokemon = "create table if not exists pokemon (\n" +
                "id_Pokemon int not null primary key auto_increment,\n" +
                "nome_Pokemon varchar(255) not null,\n" +
                "tipo_Pokemon varchar(255) not null\n" +
                ");";
        String selectPokemon = "select * from pokemon where tipo_Pokemon='Fantasma'";

        template.execute("drop table if exists pokemon");
        template.execute(criacaoTablePokemon);
        template.update("insert into pokemon values (1, 'Charizard', 'Fogo'), (2, 'Rayquaza', 'Dragão'), (null, 'Gyarados', 'Água'), (null, 'Gengar', 'Fantasma');");
        List listaPokemon01 = template.queryForList("select * from pokemon;");

        System.out.println(listaPokemon01);
        System.out.println(template.queryForList(selectPokemon));
    }
}
