package bloquesCodigo;

public class Persona {
    private final int idPersona;

    private static int contadorPersonas;

    static {
        contadorPersonas = 10;
        System.out.println("Ejecuta el bloque estatico");
    }
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;
    }
    Persona(){
        System.out.println("Ejecuta Constructor");
    }
    public int getIdPersona() {
        return idPersona;
    }
    public static int getContadorPersonas() {
        return contadorPersonas;
    }
}

