/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) { 
    Connection con = Conexao.abrirConexao(); 
    CarroBean cb = new CarroBean(); 
    CarroDAO cd = new CarroDAO(con); 
    
 //Testando método inserir 
 
    cb.setPlaca("BLL2897"); 
    cb.setCor("Vermelho"); 
    cb.setDescricao("Carro 4"); 
    cb.setMarca("Honda");
    cb.setModelo("fusca");
    System.out.println(cd.inserir(cb));
    
    List<CarroBean> lista = cd.listarTodos();
    
        if(lista != null){
            for(CarroBean carro : lista){
                System.out.println("Placa: "+carro.getPlaca());
                System.out.println("Cor: "+carro.getCor());
                System.out.println("Descricao: "+carro.getDescricao());
                System.out.println("Modelo: "+carro.getModelo());
                System.out.println("Marca: "+carro.getMarca());
            }
        }
    }
    
}
