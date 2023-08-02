/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

// importe de bibliotecas 

import java.sql.*;
import java.util.*;

public class CarroDAO {
    // aqui faz a conexão com o banco mandando a conexão e a recebendo 
    private Connection con;
    public CarroDAO(Connection con){
        
        setCon(con);
        
    }
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con = con;
    }
    
    // apartir daqui são comando sql para fazer ações com o banco inserindo dados por exemplo
    public String inserir(CarroBean carro){
        String sql = 
                "insert into carro(placa, cor, descricao, marca, modelo, chassi, calota, tamanho, "
                + "tipo, horario, periodo, senha) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            
            // aqui ele prepara o código para trabalhar em sql e fazer a conexão com o banco retornando todos os valores enviados
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            ps.setString(4, carro.getMarca());
            ps.setString(5, carro.getModelo());
            ps.setString(6, carro.getChassi());
            ps.setString(7, carro.getCalota());
            ps.setString(8, carro.getTamanho());
            ps.setString(9, carro.getTipo());
            ps.setString(10, carro.getHorario());
            ps.setString(11, carro.getPeriodo());
            ps.setString(12, carro.getSenha());
            
            // um if, else para saber se os dados foram ou não enviados
            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            }else{
                return "erro ao inserir";
            }
        
           // aqui será lançada uma mensagem de erro caso o proprío aconteça 
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    // alerar algum valor do banco 
    public String alterar(CarroBean carro){
        String sql = "update carro set cor = ?, descricao = ?";
        sql += " where placa = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());
            ps.setString(4, carro.getMarca());
            ps.setString(5, carro.getModelo());
            ps.setString(6, carro.getChassi());
            ps.setString(7, carro.getCalota());
            ps.setString(8, carro.getTamanho());
            ps.setString(9, carro.getTipo());
            ps.setString(10, carro.getHorario());
            ps.setString(11, carro.getPeriodo());
            ps.setString(12, carro.getSenha());
            
             // um if, else para saber se os valores foram alterados 
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            }else{
                return "Erro ao alterar";
            }
            
            // aqui será lançada uma mensagem de erro caso o proprío aconteça 
        }catch(SQLException e){
            return e.getMessage();
        }
        
    }
    
    public String excluir(CarroBean carro){
        String sql = "delete carro where placa = ? ";

        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            
            
             // um if, else para saber se os valores foram ou não apagados
            if(ps.executeUpdate() > 0){
                return "Excluido com sucesso";
            }else{
                return "Erro ao excluir";
            }
            
               // aqui será lançada uma mensagem de erro caso o proprío aconteça 
        }catch(SQLException e){
            return e.getMessage();
        }
        
    }
    
    // aqui será listado o valor pedido 
    public List<CarroBean> listarTodos(){
        String sql = "select * from carro ";
        
        //listar a classe e então os valores atribuidos naquela classe em suas váriaveis 
        List<CarroBean> listaCarro = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            // armazenamento de dodos da consulta do banco 
            ResultSet rs = ps.executeQuery();
            
            // se o resultado não for nulo recaba os valores das variáveis 
            if(rs != null){
                while(rs.next()){
                    CarroBean cb = new CarroBean();
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));
                    cb.setMarca(rs.getString(4));
                    cb.setModelo(rs.getString(5));
                    cb.setChassi(rs.getString(6));
                    cb.setCalota(rs.getString(7));
                    cb.setTamanho(rs.getString(8));
                    cb.setTipo(rs.getString(9));
                    cb.setHorario(rs.getString(10));
                    cb.setPeriodo(rs.getString(11));
                    cb.setSenha(rs.getString(12));
                    listaCarro.add(cb);
                }
                
                // retorno da lista ou não 
                return listaCarro;
            }else{
                return null;
            }
            
            // retorne nulo 
        }catch(SQLException e){
            return null;
        }
        
    }
    
}