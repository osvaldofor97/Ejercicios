package Herencia;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String posicion;

    public Futbolista(int dni, String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(dni, nombre, apellido, edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }  
    
    public void JugarPartido(){
        System.out.println(nombre+" esta jugando un partido");
    }
    
    public void Entrenar(){
        System.out.println(nombre+" esta entrenando");
    }
    
    @Override
    public void concentrarse(){
        System.out.println(nombre+" no puede salir del hotel porque debe concentrarse mucho mas");
    } 
        
}
