/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areas;

import javax.swing.JOptionPane;

public class decisao {

    void triangulo() {

        // try{
        System.out.println("Vamos calcular a área do triangulo ");
        int tbase = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        int taltura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));

        int area = (tbase * taltura) / 2;

        JOptionPane.showMessageDialog(null, "Esta é a área do triângulo: " + area);
    }
    //catch(Exeption e ){
    //   System.out.println("caracter inválido tente novamente");
    //}


    void retangulo(){
        
        System.out.println("Vamos calcular a área do seu retângulo ");
        int  rbase = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        int raltura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        int area = (rbase * raltura);
        
        JOptionPane.showMessageDialog(null,"O Valor da area do retangulo é: " + area);
    }
    void quadrado(){
        System.out.println("Vamos calcular a área do seu quadrado ");
        int ladoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado a: "));
        int ladob = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado b: "));
        
        int area = (ladoa * ladob);
        
        JOptionPane.showMessageDialog(null, "O valor da area do quadrado é: " + area);
    }

}
