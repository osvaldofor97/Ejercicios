/*
Planteamiento de la situación

Dentro de las actividades de desarrollo de software de la compañía donde trabajas se utiliza tecnología
Java, en uno de los proyectos surge la situación de agregar productos a un lote. El scrum master de tu
equipo de desarrollo te asigna la incidencia para implementar una función que permita calcular el costo
de almacenamiento dentro del módulo de productos.

Planteamiento del reto

Generar una función llamada calcularCostoAlmacenamiento(boolean refigerado, float valorBase) que reciba
dos parámetros, uno de tipo boolean que indica  si un medicamento es refrigerado o no refrigerado y otro
de tipo float que indique el valorBaseDeAlmacenamiento del medicamento y retorne un valor float con el
precio de almacenamiento teniendo en cuenta lo siguiente: 


Condiciones

-> Si un medicamento  es refrigerado la variable booleana será true. 
-> Si un medicamento es refrigerado su costo de almacenamiento tendrá un 30% adicional al valor base,
   si no un costo adicional del 15%;
-> Tenga en cuenta el orden de los parámetros 

*/

package reton1segundociclomintic.reton1segundociclomintic;

public class RetoN1segundoCicloMinTic {

    public static void main(String[] args) {
        System.out.println("El costo de almacenamiento para un medicamento refrigerado es: $"+calcularCostoAlmacenamiento(true,100)+" COP");
        System.out.println("El costo de almacenamiento para un medicamento NO refrigerado es: $"+calcularCostoAlmacenamiento(false,100)+" COP");
    }
    
    public static float calcularCostoAlmacenamiento(boolean refigerado, float valorBase){
    
        float CostoAlmacenamiento=0;
        
        if (refigerado==true) {
            CostoAlmacenamiento=valorBase*0.30f;
            CostoAlmacenamiento+=valorBase;
        }else{
            CostoAlmacenamiento=valorBase*0.15f;
            CostoAlmacenamiento+=valorBase;
        }
        
        return CostoAlmacenamiento;
    } 
}
