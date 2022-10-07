package ForEach;

public class Persona {
    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre) {
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
