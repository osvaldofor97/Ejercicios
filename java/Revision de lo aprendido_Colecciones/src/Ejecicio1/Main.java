package Ejecicio1;

public class Main {

    public static void main(String[] args) {
        Hacienda h= new Hacienda();
        h.agregarVehiculo(new Moto(250,"XTZ000"));
        h.agregarVehiculo(new Moto(145,"XTZ111"));
        h.agregarVehiculo(new Moto(200,"XTZ222"));
        h.agregarVehiculo(new Moto(100,"XTZ333"));
        h.mostrarImpuestosVehiculo();
    }
    
}
