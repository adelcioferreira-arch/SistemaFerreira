package dao;

import bean.MpvPedidos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidosDAO {

    public void inserir(MpvPedidos pedido) {

        String sql =
                "INSERT INTO pedidos "
                + "(dataPedido, cliente, usuario, total, status, formaPagamento) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setDate(
                    1,
                    new java.sql.Date(
                            pedido.getDataPedido().getTime()
                    )
            );

            stmt.setInt(2, pedido.getCliente());
            stmt.setInt(3, pedido.getUsuario());
            stmt.setDouble(4, pedido.getTotal());
            stmt.setString(5, pedido.getStatus());
            stmt.setString(6, pedido.getFormaPagamento());

            stmt.execute();

            stmt.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
