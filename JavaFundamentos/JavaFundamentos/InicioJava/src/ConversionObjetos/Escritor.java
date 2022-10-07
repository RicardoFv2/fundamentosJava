package ConversionObjetos;

public class Escritor extends Empleado{
    //Utilizamos una enumeracion
    final TipoEscritura tipoEscritura ;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar el metodo del padre y solo agregar
        //a este metodo lo de la clase y esto es invocar un metodo sobreescrito
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    public String  getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
