/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;
import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) 
    {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade : "));
        
        JOptionPane.showMessageDialog(null, "Sua idade é : " + idade);
    }
}
