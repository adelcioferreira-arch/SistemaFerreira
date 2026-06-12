package dao;

import bean.MpvUsuarios;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuariosDAO {

    public void inserir(MpvUsuarios usuario) {

        String sql =
                "INSERT INTO usuarios "
                + "(nome, apelido, cpf, dataNascimento, nivel, senha, ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    usuario.getMpvNome());

            stmt.setString(2,
                    usuario.getMpvApelido());

            stmt.setString(3,
                    usuario.getMpvCpf());

            stmt.setDate(
                    4,
                    new java.sql.Date(
                            usuario.getMpvDataNascimento().getTime()
                    )
            );

            stmt.setInt(5,
                    usuario.getMpvNivel());

            stmt.setString(6,
                    usuario.getMpvSenha());

            stmt.setString(7,
                    usuario.getMpvAtivo());

            stmt.execute();

            stmt.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    public boolean validarLogin(
            String apelido,
            String senha) {

        String sql =
                "SELECT * FROM usuarios "
                + "WHERE apelido = ? "
                + "AND senha = ?";

        try {

            Connection conn =
                    Conexao.getConexao();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, apelido);
            stmt.setString(2, senha);

            ResultSet rs =
                    stmt.executeQuery();

            return rs.next();

        } catch (Exception e) {

            System.out.println(e);

            return false;
        }
    }
}
