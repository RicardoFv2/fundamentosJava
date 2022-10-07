package ConversionObjetos;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    //Sobreescribimos el metodo padre hereado
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar el metodo del padre
        //y solo agregar a este metodo de la clase hoja
        //esto es invocar un metodo sobreescrito

        return super.obtenerDetalles() + ", departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
