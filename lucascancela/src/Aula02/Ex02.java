/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String [] args)
    {
        
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o valor de A : ");
        double a = x.nextDouble();
        System.out.println("Digite o valor de B : ");
        double b = x.nextDouble();
        
        double soma = a+b;
        
        System.out.println("O valor da soma é : " + soma);
        
        /*
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o valor de A : ");
        int a = x.nextInt();
        System.out.println("Digite o valor de B : ");
        int b = x.nextInt();
        int soma = a + b;
        *?
                
        /*
         int a = 10;
        int b = 10;
        int soma = a + b;
        */
                
       /*
        System.out.println("O valor da soma é : " + soma);
       */         
    }
}
