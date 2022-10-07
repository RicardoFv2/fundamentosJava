package Herencia;

import java.util.Date;

public class MainHerencia {
    public static void main(String[] args) {
    Empleado emp1 = new Empleado("Ricardo",1000);
    Empleado emp2 = new Empleado("Joan",2000);

    emp1.setEdad(24);
    emp1.setGenero('M');
    emp1.setDirreccion("Calle");
    System.out.println(emp1);

    Cliente c1 = new Cliente(new Date(),false);
        System.out.println("\nImprimimos el objeto Cliente1");
        System.out.println(c1);

        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDirreccion("Mexico, DF");
        System.out.println("\nVolvemos a imprimir");
        System.out.println(c1);

        System.out.println(emp1.obtenerDetalles());
    }
}
