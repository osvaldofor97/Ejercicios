
package revisionaprendido2mintic.revisionaprendido2;

public class Principal {

    public static void main(String[] args) {
        Tiquete t = new Tiquete("1", 500, 2);
        System.out.println(t.costoTiquete());
        
        Tiquete t1= new Tiquete("2",1500,3);
        System.out.println(t1.costoTiquete());
        	
        Tiquete t2= new Tiquete("3",5000,1);
        System.out.println(t2.costoTiquete());
    }
    
}
