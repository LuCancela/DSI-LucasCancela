/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

// testando para ver se a cone~]ao é estabelecida e consiga fazer ações no banco
public class Teste {
    public static void main(String[] args) { 
    Connection con = Conexao.abrirConexao(); 
    CarroBean cb = new CarroBean(); 
    CarroDAO cd = new CarroDAO(con); 
    
 //Testando método inserir 
 
    cb.setPlaca("5897"); 
    cb.setCor("Vermelho"); 
    cb.setDescricao("Carro 4"); 
    cb.setMarca("Honda");
    cb.setModelo("fusca");
    cb.setChassi("12345678998745632");
    cb.setCalota("Esportiva");
    cb.setTamanho("Grande");
    cb.setTipo("SUV");
    cb.setHorario("10");
    cb.setPeriodo("Manhã");
    cb.setSenha("25");
    
    // mostra o que aconteceu no método 
    System.out.println(cd.inserir(cb));
    
    cb.setPlaca("8797"); 
    cb.setCor("Azul"); 
    cb.setDescricao("Carro 2"); 
    cb.setMarca("Honda");
    cb.setModelo("HRV");
    cb.setChassi("12345678888745632");
    cb.setCalota("Esportiva");
    cb.setTamanho("Grande");
    cb.setTipo("SUV");
    cb.setHorario("10");
    cb.setPeriodo("Manhã");
    cb.setSenha("25");
    
    System.out.println(cd.alterar(cb));
   
    List<CarroBean> lista = cd.listarTodos();
        
        // se a lista for diferente de nula imprima dessa forma os valores 
        if(lista != null){
            for(CarroBean carro : lista){
                System.out.println("Placa: "+carro.getPlaca());
                System.out.println("Cor: "+carro.getCor());
                System.out.println("Descricao: "+carro.getDescricao());
                System.out.println("Modelo: "+carro.getModelo());
                System.out.println("Marca: "+carro.getMarca());
                System.out.println("Chassi: "+carro.getChassi());
                System.out.println("Calota: "+carro.getCalota());
                System.out.println("Tamanho: "+carro.getTamanho());
                System.out.println("Tipo: "+carro.getTipo()); 
                System.out.println("Horario: "+carro.getHorario()); 
                System.out.println("Periodo: "+carro.getPeriodo()); 
                System.out.println("Senha: "+carro.getSenha()); 
            }
        }
        Conexao.fecharConexao(con);
    }
    
}
