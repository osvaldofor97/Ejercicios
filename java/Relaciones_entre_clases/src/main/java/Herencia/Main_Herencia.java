package Herencia;


public class Main_Herencia {


    public static void main(String[] args) {
        
       Futbolista objFutbolista = new Futbolista(123456789,"Jose","Osorio",22,10,"delantero");
       
        System.out.println("____________INFORMACION DEL JUGADOR____________");
        System.out.println("El nombre del futbolista es: "+objFutbolista.getNombre()+" "+objFutbolista.getApellido());
        System.out.println("El DNI de "+objFutbolista.getNombre()+" es:"+objFutbolista.getDni());
        System.out.println(objFutbolista.getNombre()+" tiene "+objFutbolista.getEdad()+" años");
        objFutbolista.concentrarse();
        objFutbolista.viajar();
        objFutbolista.Entrenar();
        objFutbolista.JugarPartido();
        System.out.println("\n");
        
      Entrenador objEntrenador = new Entrenador(7894545,"Camilo","Gallardo",22,"federacion de futbol colombiano");
        
        System.out.println("____________INFORMACION DEL ENTRENADOR____________");
        System.out.println("El nombre del entrenador es: "+objEntrenador.getNombre()+" "+objEntrenador.getApellido());
        System.out.println("El DNI de"+objEntrenador.getNombre()+" es:"+objEntrenador.getDni());
        System.out.println(objEntrenador.getNombre()+" tiene "+objEntrenador.getEdad()+" años");
        System.out.println(objEntrenador.getNombre()+" obtuvo su titulo en la "+objEntrenador.getFeredacion());
        objEntrenador.concentrarse();
        objEntrenador.viajar();
        objEntrenador.dirigirPartido();
        System.out.println("\n");
        
      Masajista objMasajista = new Masajista(45678123,"Christian","Castiblanco",30,"Universidad EAN");
      
        System.out.println("____________INFORMACION DEL MASAJISTA____________");
        System.out.println("El nombre del entrenador es: "+objMasajista.getNombre()+" "+objMasajista.getApellido());
        System.out.println("El DNI de"+objMasajista.getNombre()+" es:"+objMasajista.getDni());
        System.out.println(objMasajista.getNombre()+" tiene "+objMasajista.getEdad()+" años");
        objMasajista.concentrarse();
        objMasajista.viajar();
        objMasajista.darMasaje();
    }
    
}
