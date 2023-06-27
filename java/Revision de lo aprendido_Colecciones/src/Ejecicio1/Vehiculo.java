package Ejecicio1;

public class Vehiculo {
    protected String placa;
    
    public Vehiculo(String placa){
        this.placa=placa;
    }
    
    public int calcularImpuesto(){
        return 0;
    }

    @Override
    public String toString() {
        return placa;
    }
    
    
}
