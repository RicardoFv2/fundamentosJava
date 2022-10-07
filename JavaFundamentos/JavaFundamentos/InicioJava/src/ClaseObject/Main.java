package ClaseObject;

public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Juan", 10000);
        Empleado emp2 = new Empleado("Juan", 10000);

        compararObjetos(emp1,emp2);
    }
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        //Llamada metodo toString
        //Por default se manda a llamar el metodo toString dentro del sout
        System.out.println("Contenido objeto: " + emp1);

        if (emp1 == emp2){
            System.out.println("Los objetos tienen la misma direccion de memoria" );
        } else {
            System.out.println("Los objetos tienen distinta direccion de memoria ");
        }
        if (emp1.equals(emp2)){
            System.out.println("Los objetos tenen el mismo contenido, son iguales");
        }else {
            System.out.println("Los objetos NO tienen el mismo contenido, No son iguales");
        }
        if (emp1.hashCode() == emp2.hashCode()){
            System.out.println("Los objetos tienen el mismo codigo hash");
        }else {
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }
    }
}
