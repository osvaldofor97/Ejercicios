
package Agregacion;

public class Main_Agregacion {

    public static void main(String[] args) {
        Empleado objEmpleado1=new Empleado("Oswaldo");
        Empleado objEmpleado2=new Empleado("Maria");
        Empleado objEmpleado3=new Empleado("Fernana");
        Empleado listaEmpleados[]=new Empleado[3];
        
        listaEmpleados[0]=objEmpleado1;
        listaEmpleados[1]=objEmpleado2;
        
        
        Banco objBanco = new Banco("Bancolombia",listaEmpleados);
        objBanco.imprimirEmpleado();
        objBanco.setEmpleado(objEmpleado3, 1);
        
        objBanco.imprimirEmpleado();
    }
    
}
