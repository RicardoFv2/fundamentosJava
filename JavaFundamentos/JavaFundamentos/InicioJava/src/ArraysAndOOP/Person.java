package ArraysAndOOP;

public class Person {
    private String nombre;
    private Person nombres[];

    public Person(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String asignarApellido() {
        String apellido = "Myers";
        return apellido;
    }

    public void agregarPersona(Person arg) {
        nombres[0] = arg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
