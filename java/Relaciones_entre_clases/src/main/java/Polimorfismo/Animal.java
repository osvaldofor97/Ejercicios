
package Polimorfismo;

class Animal {
    protected String especie;
    protected String sexo;
    protected String nombre;
    
    public Animal(String especie,String sexo,String nombre){
        this.especie=especie;
        this.sexo=sexo;
        this.nombre=nombre;
    }
    
    public void hacerSonido(){
        System.out.println("El animal esta haciendo un sonido");
    }
}
