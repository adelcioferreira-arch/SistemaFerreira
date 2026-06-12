package dao;

import bean.MpvClientes;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientesDAO {

    public void inserir(MpvClientes cliente) {

        String sql =
                "INSERT INTO clientes "
                + "(nome, cpf, email) "
                + "VALUES (?, ?, ?)";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    cliente.getNome());

            stmt.setString(2,
                    cliente.getCpf());

            stmt.setString(3,
                    cliente.getEmail());

            stmt.execute();

            stmt.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
