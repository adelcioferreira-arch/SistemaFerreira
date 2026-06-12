package dao;

import bean.MpvFornecedores;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FornecedoresDAO {

    public void inserir(
            MpvFornecedores fornecedor) {

        String sql =
                "INSERT INTO fornecedores "
                + "(razaoSocial, nomeFantasia, email) "
                + "VALUES (?, ?, ?)";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    fornecedor.getRazaoSocial());

            stmt.setString(2,
                    fornecedor.getNomeFantasia());

            stmt.setString(3,
                    fornecedor.getEmail());

            stmt.execute();

            stmt.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
