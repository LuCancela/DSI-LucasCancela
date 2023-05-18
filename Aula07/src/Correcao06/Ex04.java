/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correcao06;

/**
 *
 * @author CAMARGO
 */
public class Ex04 {
    void Parimpar(){
        
        int par = 0;
        int impar = 0;
        int total = 0;
       
        
        for(int i= 0; i <=100; i ++){
            
            if(i % 2 == 0){
                
                par= par + i;
                System.out.println("Par " + par +"\n");
            }
            else{
                impar= impar + i;
                System.out.println("ímpar " + impar + "\n");
            }
        }
        
        System.out.println("Os pares são maiores");
        total = impar + par;
        System.out.println(total);
    }
}
