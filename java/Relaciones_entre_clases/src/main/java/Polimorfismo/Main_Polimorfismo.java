
package Polimorfismo;


public class Main_Polimorfismo {

   
    public static void main(String[] args) {
        Perro objPerro = new Perro("BullTerrier","Macho","Dollar");
        objPerro.hacerSonido();
        
        Gato objGato = new Gato("Angora","Hembra","Kitty");
        objGato.hacerSonido();
        
        Animal objAnimal = new Animal ("Raton callejero","Macho","Fernando");
        objAnimal.hacerSonido();
    }
    
}
