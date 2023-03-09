/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instanciar;

import javax.swing.JOptionPane;


public class teste {
    public static void main(String[] args) {
        Funcalc chamar = new Funcalc ();
        
        String op = JOptionPane.showInputDialog("Digite o operador ");
        
        if(op.equals("+")){
            chamar.soma();
        }else if(op.equals("-")){
            chamar.subtracao();
        }else if(op.equals("/")){
            chamar.multiplicacao();
        }else{
        System.out.println("valor invalido");
        
                
    }
        
        
        chamar.soma(); 
        chamar.subtracao();
        chamar.multiplicacao();
    }
    
}
