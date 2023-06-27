
package Revision_de_lo_aprendido3;

public class Moto extends Vehiculo {
        private int cilindraje;
        
    public Moto(int cilindraje,String placa) {
        super(placa);
        this.cilindraje=cilindraje;
    }
    
    public int calcularImpuesto(){
        if (cilindraje > 150) {
            return 90000;
        }else{
            return 45000;
        }
        
    }
    
}
