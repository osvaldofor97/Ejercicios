package Reto3_MINTIC;

public class Main_Reto3 {

    public static void main(String[] args) {
        
        Producto Suero = new Producto("Suero","14589",25,1500);
        Producto AntibioticoPastilla = new Producto("Antibiotico en pastilla","57896",30,1000);
        Producto Vacunas = new Producto("Vacunas","32658",10,2000);
    
        ProductoNoRefrigerado p= new ProductoNoRefrigerado();
        p.setValorBase(1000);
        System.out.println(p.calcularCostoDeAlmacenamiento());
    }
    
}
