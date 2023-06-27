package Ejecicio1;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(int cilindraje,String placa) {
        super(placa);
        this.cilindraje = cilindraje;
    }
    
    public int caluclarImpuesto(){
        return 0;
    }
}
