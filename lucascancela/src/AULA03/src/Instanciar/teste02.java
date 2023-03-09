/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instanciar;

import javax.swing.JOptionPane;


public class teste02 {
    
    public static void main(String[] args) {
        Funcalc chamar = new Funcalc ();
     try{
     int op = Integer.parseInt(JOptionPane.showInputDialog("digite o operador: "));
     
     if (op == 1){
    chamar.soma();
    }else if (op == 2){
        chamar.subtracao();
    }else if (op == 3){
        chamar.multiplicacao();
    }else{
        System.out.println("Valor invalido");
    }
     
    }catch (Exception e ){
    JOptionPane.showMessageDialog(null, "valor invalido");

}}}
