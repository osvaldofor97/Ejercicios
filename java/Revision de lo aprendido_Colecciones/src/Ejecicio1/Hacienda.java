package Ejecicio1;

import java.util.ArrayList;
import java.util.List;

public class Hacienda implements PatronHacienda{
    public List<Vehiculo> vehiculos;

    public Hacienda (){
        vehiculos = new ArrayList<>();    
    }
    
    @Override
    public void agregarVehiculo(Vehiculo c) {
        vehiculos.add(c);
    }

    @Override
    public void mostrarImpuestosVehiculo(){
        for (Vehiculo vehiculo: vehiculos) {
            System.out.println(vehiculo);
        }
    }
    
}
