/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercício;

public class Ex03Prof {
    public static void main(String[]args){
        
        int n1 = 0;
        int n2 = 1;
        int result = 0;
         
        for(int i=0; i< 10; i++){
            if(n1 == 0){
                System.out.println(n1);
                System.out.println(n2);
            }
            
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            
            System.out.println(result);
            
        }
    }
}
