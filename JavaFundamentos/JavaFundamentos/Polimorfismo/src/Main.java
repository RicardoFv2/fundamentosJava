public class Main {
    public static void main(String[] args) {
    Empleado emp = new Empleado("Ricardo", 1000);
    imprimirDetalles(emp);

    Gerente ger = new Gerente("Juan",2000,"Finanzas");
    imprimirDetalles(ger);
    }

    public static void imprimirDetalles (Empleado emp) {
        System.out.println(emp.obtenerDetalles());

    }
}