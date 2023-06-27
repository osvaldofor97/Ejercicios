/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:

● Si trabaja 40 horas o menos se le paga el 0.015 del SMLV por hora laborada.

● Si trabaja más de 40 horas se le paga a 0.02 del SMLV por hora laborada.

Realice una función que se llame salario que reciba como parámetro la cantidad de horas del obrero y 
retorne un valor double con el salario devengado para dar solución al problema.

El SMLV es 1000000*/


package com.mycompany.salarioobrero;

public class SalarioObrero {

    public static void main(String[] args) {
        System.out.println(salario(50));
    }
    
    public static double salario(double horas){
        double resultadoSalario;
        
        if (horas<=40) {
            resultadoSalario=1000000*0.015;
            resultadoSalario*=horas;
        }else{
            resultadoSalario=1000000*0.02;
            resultadoSalario*=horas;
        }
        
        return resultadoSalario;
    }
}
