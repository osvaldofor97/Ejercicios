
package Composicion;

public class Main_Composicion {

    public static void main(String[] args) {
        Automovil objAutomovil = new Automovil("BMW", 4, 12, 15, 2000);
        System.out.println("El vehiculo tiene "+objAutomovil.getNumeroRuedas()+" ruedas");
        System.out.println("El vehiculo es modelo "+objAutomovil.getModelo());
    }
    
}
