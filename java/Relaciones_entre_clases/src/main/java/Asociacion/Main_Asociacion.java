
package Asociacion;

public class Main_Asociacion {

    public static void main(String[] args) {
       Empleado objEmpleado=new Empleado("Oswaldo");
       Empleado objEmpleado1=new Empleado("Maria");
       
       System.out.println(objEmpleado.getNombreEmpleado());
       objEmpleado.setNombreEmpleado("Oswaldo Forero");
       System.out.println(objEmpleado.getNombreEmpleado());
               
       Banco objBanco = new Banco("Bancolombia");
       
       System.out.println("El empleado "+objEmpleado.getNombreEmpleado()+" trabaja en "+objBanco.getNombreBanco());
       System.out.println("El empleado "+objEmpleado1.getNombreEmpleado()+" trabaja en "+objBanco.getNombreBanco());
    }
    
}
