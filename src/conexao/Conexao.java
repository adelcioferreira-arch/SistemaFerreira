package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL =
        "jdbc:mysql://localhost:3306/db_adelcio_ferreira";

private static final String USUARIO =
        "root";

private static final String SENHA =
        "";

    public static Connection getConexao() {

        try {

            Connection conn = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    SENHA
            );

            System.out.println("Conectado com sucesso!");

            return conn;

        } catch (Exception e) {

            System.out.println("Erro na conexão:");
            System.out.println(e);

            return null;
        }
    }
}
