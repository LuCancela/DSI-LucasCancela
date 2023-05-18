/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercício;

public class Ex03 {
    
    public static void main(String[]args){
        
        int soma = 1;
        int sub = 0;
        
        System.out.println(sub);
        System.out.println(soma);
         
        for(int i=0; i< 12; i++){
            
            soma= soma + sub;
            sub= soma - sub ;
            System.out.println(soma);
            
        }
    }
    
}