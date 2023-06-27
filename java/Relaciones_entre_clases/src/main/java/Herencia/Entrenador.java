
package Herencia;

public class Entrenador extends SeleccionFutbol{
    private String federacion;
    
    public Entrenador(int dni, String nombre, String apellido, int edad, String federacion){
        super(dni,nombre,apellido,edad);
        this.federacion=federacion;
    }
    
    public String getFeredacion(){
        return federacion;
    }
    
    public void setFederacion(String federacion){
        this.federacion=federacion;
    }
    
    public void dirigirPartido(){
        System.out.println(nombre+" esta dirigiendo el partido");
    }
}
