/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import javax.swing.JOptionPane;
    
public class ex04 {
    public static void main (String[] args) {
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro lado: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo lado: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro lado: "));
        JOptionPane.showMessageDialog(null," valores digitados:"+n1+","+n2+","+n3);
        
        if (n1 == n2 && n3 == n1) {
            JOptionPane.showMessageDialog(null, "Seu triangulo é equilatero");
        } else if ((n1 == n2 && n2 != n3) || (n1 != n2 && n1 == n3) || (n3 != n1 && n2 == n1 ) || (n1 != n2 && n2 == n3)){
           JOptionPane.showMessageDialog(null, "Seu triangulo é isóceles");
        } else if (n1 != n2 && n2 != n3 && n3 != n1){
            JOptionPane.showMessageDialog(null, "Seu triangulo é escaleno");  
        }
        
       }
    {
     
        }
            
    }

