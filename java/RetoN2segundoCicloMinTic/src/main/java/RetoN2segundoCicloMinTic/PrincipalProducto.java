
package RetoN2segundoCicloMinTic;

public class PrincipalProducto {

    public static void main(String[] args) {
        Producto p1 = new Producto("Aspirina","abc","C","Tecnoquimicas",false);
        p1.info();
        
        System.out.println("--------------------------------");
        
        Producto p2 = new Producto("Losartan","ABC","A","Bayer",true);
        p2.info();
        }
    
}
