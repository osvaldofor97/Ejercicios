package Agregacion;

public class Banco {
    private String Nombre;
    private Empleado Empleados[]; //<--- Agregación
    
    
    public Banco(String Nombre,Empleado Empleados[]){
        this.Nombre=Nombre;
        this.Empleados=Empleados;
    }
    
    public String getNombreBanco(){
        return Nombre;
    }
    
    public void setEmpleado(Empleado NuevoEmpleado,int posicion){
        Empleados[posicion]=NuevoEmpleado;
    }
    
    public void imprimirEmpleado(){
        System.out.println("En el banco "+Nombre+" trabajan las siguientes personas: ");
        for (int i = 0; i < Empleados.length; i++) {
            try{
            System.out.println("Nombre: "+Empleados[i].getNombreEmpleado());
            }catch (Exception e){
            }
            }
        }
    }
