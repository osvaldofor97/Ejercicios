
package Asociacion;

public class Empleado {
    private String Nombre;
    
    
    public Empleado(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombreEmpleado(){
        return Nombre;
    }
    
    public void setNombreEmpleado(String Nombre){
        this.Nombre=Nombre;
    }
}

