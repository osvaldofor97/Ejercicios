
package RetoN2segundoCicloMinTic;

/*Los pacientes de una EPS tienen distintos cobros de cuota moderadora y se requiere crear un
programa para despachar el producto al paciente de acuerdo a su estado de cotización, si es 
cotizante debe pagar $3500 y si no es cotizante, debe pagar $14000.*/

public class Producto {
    private String nombre;   
    private String codigo; 
    private String categoria;
    private String laboratorio;
    private boolean cotizante;
    
    public Producto(String nombre, String codigo, String categoria, String laboratorio, boolean cotizante){
        this.nombre=nombre;
        this.codigo=codigo;
        this.categoria=categoria;
        this.laboratorio=laboratorio;
        this.cotizante=cotizante;
    }
    
    public float costo(){
        float precio;
        
        if (cotizante==true) {
            precio=3500f;
        }else{
            precio=14000f;
        }
        
        return precio;
    }
    
   public void info() {
     System.out.println("[Producto]:");   	 
     System.out.println("Nombre:" +this.nombre);
     System.out.println("Codigo: " + this.codigo);
     System.out.println("Categoria: " + this.categoria);
     System.out.println("Laboratorio: " + this.laboratorio);
     System.out.println("Precio: " + this.costo());
    }
    
}
