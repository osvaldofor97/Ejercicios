
package Herencia;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    
    public Masajista(int dni, String nombre, String apellido, int edad, String titulacion){
        super(dni,nombre,apellido,edad);
        this.titulacion=titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    public void darMasaje(){
        System.out.println(nombre+" esta dando un masaje.");
    }
}
