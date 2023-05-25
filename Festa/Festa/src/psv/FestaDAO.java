package psv;

import java.sql.*;
import java.util.*;

public class FestaDAO {

    private Connection con;

    public FestaDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(FestaBean pessoa) {
        String sql = "INSERT INTO pessoa(nome, sobrenome, idade, rg, cpf, "
                + "email, telefone, bebida, tipoIngresso, valorIngresso) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, pessoa.getIdPessoa());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getSobrenome());
            ps.setInt(4, pessoa.getIdade());
            ps.setString(5, pessoa.getRg());
            ps.setString(6, pessoa.getCpf());
            ps.setString(7, pessoa.getEmail());
            ps.setString(8, pessoa.getTelefone());
            ps.setBoolean(9, pessoa.getBebida());
            ps.setString(10, pessoa.getTipoIngresso());
            ps.setString(11, pessoa.getValorIngresso());

            if (ps.executeUpdate() > 0) {
                return "INSERIDO COM SUCESSO!";
            } else {
                return "ERRO!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(FestaBean pessoa) {
        String sql = "UPDATE pessoa set nome = ?, sobrenome = ?,"
                + " idade = ?, rg = ?, cpf = ?,"
                + " email = ?, telefone = ?, bebida = ?,"
                + " tipoIngresso = ?, valorIngresso = ?";
        sql += "where idPessoa = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobrenome());
            ps.setInt(3, pessoa.getIdade());
            ps.setString(4, pessoa.getRg());
            ps.setString(5, pessoa.getCpf());
            ps.setString(6, pessoa.getEmail());
            ps.setString(7, pessoa.getTelefone());
            ps.setBoolean(8, pessoa.getBebida());
            ps.setString(9, pessoa.getTipoIngresso());
            ps.setString(10, pessoa.getValorIngresso());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "ERRO";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(FestaBean pessoa) {
        String sql = "delete from pessoa where idPessoa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, pessoa.getIdPessoa());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<FestaBean> listarTodos() {
        String sql = "select * from pessoa";
        List<FestaBean> listaFesta = new ArrayList<FestaBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    FestaBean fb = new FestaBean();
                    fb.setIdPessoa(rs.getInt(1));
                    fb.setNome(rs.getString(2));
                    fb.setSobrenome(rs.getString(3));
                    fb.setIdade(rs.getInt(4));
                    fb.setRg(rs.getString(5));
                    fb.setCpf(rs.getString(6));
                    fb.setEmail(rs.getString(7));
                    fb.setTelefone(rs.getString(8));
                    fb.setBebida(rs.getBoolean(9));
                    fb.setTipoIngresso(rs.getString(10));
                    fb.setValorIngresso(rs.getString(11));
                    listaFesta.add(fb);
                }
                return listaFesta;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

}
