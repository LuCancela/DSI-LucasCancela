/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;


public class Teste {
    public static void main(String[] args){
        Connection con = Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("JKK1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro 1");
        System.out.println(cd.inserir(cb));
        
    }
}

