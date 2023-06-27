package com.mycompany.pares_internos;

import java.util.Scanner;

public class Pares_internos {

    public static void main(String[] args) {
        /*Calcule un programa que le solicite al usuario dos numero y muestre 
        por consola todos los números pares internos que contenga estos números.*/
        
        Scanner in = new Scanner(System.in);
        
        int numero1=0; int numero2=0;
        
        System.out.println("Digite el primer numero: ");
        numero1=in.nextInt();
        System.out.println("Digite el segundo numero: ");
        numero2=in.nextInt();
        
        for (int i = numero1; i <= numero2; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
        
    }
    
}
