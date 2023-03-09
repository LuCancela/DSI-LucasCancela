/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import javax.swing.JOptionPane;

public class ex03 {

public static void main (String[] args) {
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        JOptionPane.showMessageDialog(null, "o valor digitado " +a);
        JOptionPane.showMessageDialog(null, "o valor digitado " +b);
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        
};
};
