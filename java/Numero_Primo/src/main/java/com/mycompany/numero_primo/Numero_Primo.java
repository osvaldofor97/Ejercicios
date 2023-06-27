
package com.mycompany.numero_primo;

import java.util.Scanner;

public class Numero_Primo {

    public static void main(String[] args) {
        //cree un programa que indique si un numero digitado por el usuario es un numero primo
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int numero=0;
        numero=in.nextInt();
        
        if (numero%2 != 0){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        
    }
    
}
