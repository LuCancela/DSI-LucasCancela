/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    Long id;
    String nome;
    String sobrenonome;
    String cpf;
    String cep;
    String email;
    String telefone;
    String idade;
    String sexo;
    private final Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Usuario usuario) {

        String sql = "INSERT INTO usuario(nome,sobrenome,cpf,cep,email,telefone, idade,sexo)VALUES(?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getCep());
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getTelefone());
            stmt.setString(7, usuario.getIdade());
            stmt.setString(8, usuario.getSexo());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
