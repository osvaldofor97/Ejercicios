
package Polimorfismo;

public class Perro extends Animal{
    
    public Perro(String especie, String sexo, String nombre) {
        super(especie, sexo, nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("El perro esta ladrando");
    }
    
}
