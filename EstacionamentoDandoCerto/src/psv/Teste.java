/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;
import java.util.*;

/**
 *
 * @author CAMARGO
 */
public class Teste {
   public static void main(String[] args) { 
 Connection con = Conexao.abrirConexao(); 
 CarroBean cb = new CarroBean(); 
 CarroDAO cd = new CarroDAO(con); 
 //Testando método inserir 
  cb.setPlaca("JKL2897"); 
 cb.setCor("Verde"); 
 cb.setDescricao("Carro 3"); 
 System.out.println(cd.inserir(cb));
    }
    
}
