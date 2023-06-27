package Reto4_MINTIC;

public class ProductoNoRefrigerado extends Producto{
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;
    
    public ProductoNoRefrigerado(String nombre, String id, double temperatura, double valorBase) {
        super(nombre, id, temperatura, valorBase);
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }
/*
    public ProductoNoRefrigerado() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }   
    
    @Override
    public double calcularCostoDeAlmacenamiento(){
        if (this.temperatura>=21) {
         return this.valorBase*1.2;
        }else{
         return this.valorBase*1.1;
        } 
    }
*/
    @Override
    public String toString() {
        return "ProductoNoRefrigerado{" + "nombre=" + nombre + ", id=" + id + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
}
