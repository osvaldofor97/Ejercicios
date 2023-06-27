package Herencia;


public class SeleccionFutbol {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SeleccionFutbol(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
  
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void concentrarse(){
        System.out.println(nombre+" esta concentrado.");
    }
    
    public void viajar(){
        System.out.println(nombre+" puede viajar.");
    }
    
}
