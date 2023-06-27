package Logica;

public class Usuario {
    private int Identificacion;
    private String Nombre;
    private String Apellido;

    public Usuario() {
    }

    public Usuario(int Identificacion, String Nombre, String Apellido) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
}
