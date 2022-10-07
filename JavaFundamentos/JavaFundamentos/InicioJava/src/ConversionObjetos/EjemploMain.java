package ConversionObjetos;

public class EjemploMain {
    public static void main(String[] args) {
        //1. Creamos un tipo de mas alta jerarquia
        Empleado empleado;
        //Asignamos una referencia de un objeto de menor jerarquia
        //Esto es upcasting, no hay necesidad de una notacion especial

        empleado = new Escritor("Roy",15000,TipoEscritura.CLASICO);
        imprimirDetalles(empleado);

        //Sin embargo si quisieramos acceder al detalle de la clase Escritor
        //No es posible, ya que esas caracteristicas no estan en comun
        //entre todas las clases de la jerarquia de clases
        //empleado.getTipoDeEscritursEnTexto();

        empleado = new Gerente("Laura",18000,"Sistemas");
        //empleado.getDepartamento();
        imprimirDetalles(empleado);
    }
    public static void  imprimirDetalles(Empleado empleado){
        String resultado = null;

        System.out.println("\nDetalle: " + empleado.obtenerDetalles());

        if (empleado instanceof  Escritor){

            Escritor escritor = (Escritor) empleado;

            resultado = escritor.getTipoDeEscrituraEnTexto();

            resultado = ((Escritor) empleado).tipoEscritura.getDescripcion();

            System.out.println("Resultado tipoEscritura:" + resultado);
        } else if (empleado instanceof  Gerente) {

            resultado = ((Gerente) empleado).getDepartamento();

            System.out.println("Resultado departamento: " + resultado);
        }
    }
}
