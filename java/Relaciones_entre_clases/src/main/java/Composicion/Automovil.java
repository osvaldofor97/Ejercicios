
package Composicion;

public class Automovil {
    private String modelo;
    private Rueda ruedas[];
    private int radioRuedas;
    private int anchoRuedas;
    private double cilindraje;

    public Automovil(String modelo, int cantidadRuedas, int radioRuedas, int anchoRuedas, double cilindraje) {
        this.modelo = modelo;
        ruedas = new Rueda[cantidadRuedas]; //inicialización de variables tipo vector 
        this.radioRuedas = radioRuedas;
        this.anchoRuedas = anchoRuedas;
        this.cilindraje = cilindraje;
        
        for (int i = 0; i < cantidadRuedas; i++) {          //Asi se agrega la informacion 
            ruedas[i]= new Rueda(radioRuedas,anchoRuedas);  //para el vector que se esta usando como atributo
        }
    }
    
    public int getNumeroRuedas(){
        return ruedas.length;
    }

    public String getModelo() {
        return modelo;
    }
    
    
}
