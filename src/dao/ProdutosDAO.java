package dao;

import bean.MpvProdutos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutosDAO {

    public void inserir(MpvProdutos produto) {

        String sql =
                "INSERT INTO produtos "
                + "(nome, descricao, preco, estoque) "
                + "VALUES (?, ?, ?, ?)";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    produto.getNome());

            stmt.setString(2,
                    produto.getDescricao());

            stmt.setDouble(3,
                    produto.getPreco());

            stmt.setInt(4,
                    produto.getEstoque());

            stmt.execute();

            stmt.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}