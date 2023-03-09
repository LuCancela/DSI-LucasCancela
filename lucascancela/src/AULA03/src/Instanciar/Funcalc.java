/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instanciar;
import javax.swing.JOptionPane;
public class Funcalc {
    
    
    void soma() {
         int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        JOptionPane.showMessageDialog(null, "o valor digitado " +a);
        JOptionPane.showMessageDialog(null, "o valor digitado " +b);
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        
       
    }
    
    void subtracao() {
         int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        int subtracao = a - b;
        
        JOptionPane.showMessageDialog(null, "A subtração é: " + subtracao);
    }
        
   void multiplicacao() {
         int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        int multiplicacao = a * b;
        
        JOptionPane.showMessageDialog(null, "A multiplicação é: " + multiplicacao); 
   }
}
