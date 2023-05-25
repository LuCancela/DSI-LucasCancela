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
        FestaBean fb = new FestaBean();
        FestaDAO fd = new FestaDAO(con);
        List<FestaBean>lista = fd.listarTodos();
        
        if(lista != null){
            for (FestaBean festa : lista) {
                System.out.println("idPessoa: " + festa.getIdPessoa());
                System.out.println("Nome: " + festa.getNome());
                System.out.println("Sobrenome: " + festa.getSobrenome());
                System.out.println("Idade: " + festa.getIdade());
                System.out.println("RG: " + festa.getRg());
                System.out.println("CPF: " + festa.getCpf());
                System.out.println("Email: " + festa.getEmail());
                System.out.println("Telefone: " + festa.getTelefone());
                System.out.println("Bebida: " + festa.getBebida());
                System.out.println("Tipo de Ingresso: " + festa.getTipoIngresso());
                System.out.println("Valor: R$" + festa.getValorIngresso());

            }   
        }
        
    }
    
}
