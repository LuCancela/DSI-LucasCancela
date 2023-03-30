/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correcao06;

public class Exe06 {
    public static void main (String[] args){
       
        int par = 0;
        int impar = 0;
                
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i + "Par");
                par = par + i;
            }
            else{
                System.out.println(i + "Impar");
                impar = impar + i;
                
            }
        }
        System.out.println("Os valores pares são: " + par);
        System.out.println("Os valores impares são: " + impar);
    
    
        
        if(par > impar){
            System.out.println("Os números Pares são maiores");
        }
        else {
            System.out.println("Os números Ímpares são maiores");
        }
    }
}
        
