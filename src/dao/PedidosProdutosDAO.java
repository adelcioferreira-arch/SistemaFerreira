package dao;

import bean.MpvPedidosProdutos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidosProdutosDAO {

    public void inserir(
            MpvPedidosProdutos item) {

        String sql =
                "INSERT INTO pedidos_produtos "
                + "(pedido, produto, quantidade, valorUnitario, desconto, subtotal) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(1, item.getPedido());
            stmt.setInt(2, item.getProduto());
            stmt.setInt(3, item.getQuantidade());
            stmt.setDouble(4, item.getValorUnitario());
            stmt.setDouble(5, item.getDesconto());
            stmt.setDouble(6, item.getSubtotal());

            stmt.execute();

            stmt.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
