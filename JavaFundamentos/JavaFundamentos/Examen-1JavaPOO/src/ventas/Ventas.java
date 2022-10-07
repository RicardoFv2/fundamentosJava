package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Productos;

public class Ventas {
    public static void main(String[] args) {

        Productos prod1 = new Productos("Carro",10.99);
        Productos prod2 = new Productos("Pelota",5.99);
        Productos prod3 = new Productos("Juguete",8.99);
        Productos prod4 = new Productos("Lampara",19.99);
        Productos prod5 = new Productos("Caja",2.99);
        Productos prod6 = new Productos("Papel",5.50);

        Orden or1 = new Orden();
        or1.agregarProducto(prod1);
        or1.agregarProducto(prod2);
        or1.agregarProducto(prod3);

        or1.mostarOrden();
        System.out.println("TOTAL: " +  or1.calcularTotal(prod1.getPrecio() + prod2.getPrecio(),prod3.getPrecio()));

        Orden or2 = new Orden();
        or2.agregarProducto(prod4);
        or2.agregarProducto(prod5);
        or2.agregarProducto(prod6);

        or2.mostarOrden();
        System.out.println("TOTAL: " + or2.calcularTotal(prod4.getPrecio() ,prod5.getPrecio()));




    }




}
