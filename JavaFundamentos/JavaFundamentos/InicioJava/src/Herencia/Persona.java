package Herencia;

public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String dirreccion;

    public Persona(){}
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String dirreccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.dirreccion = dirreccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", dirreccion='").append(dirreccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
