/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        /* o valor desse é fixo o a = 15 e b = 10, o usuario não vai digitar*/
        int a = 15;
        int b = 10;
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma " + soma);

    }
    
    void subtracao() {
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A da subtração : " ));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B da subtração : " ));
       int subt = a - b;
        JOptionPane.showMessageDialog(null, "O valor da subtracao : " + subt);
    }
    
    void multiplicacao(){
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A da multiplicação : " ));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b da multiplicação : " ));
       int mult = a * b;
        JOptionPane.showMessageDialog(null, "O valor multiplicacao : " + mult);
    }
    
      void divisao(){
          /* Usando double porque provavelmente pode ter número fracionado */
       double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A da divisão : " ));
       double b =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b da divisão : " ));
       double div = a / b;
        JOptionPane.showMessageDialog(null, "O valor da divisao : " + div);
    }
}
