package com.gm.ventas;

import java.util.Arrays;

public class Orden {

    private int idOrden;

    protected Productos[] productos = new Productos[5];
    private static int contadorDeOrden;

    public Orden() {
        this.idOrden = ++contadorDeOrden;
    }

    public void agregarProducto(Productos p) {
        boolean isActive = true;
        for (int i = 0; isActive && i < productos.length; i++) {
            if (productos[i] == null){
                productos[i] = p;
                isActive = false;
            }
        }
    }
    public double calcularTotal(double a, double b) {
        return a + b;
    }

    public void mostarOrden() {
        for (int i = 0; i < productos.length; i++){
            if (productos[i] != null){
                System.out.println(productos[i].toString());
            }
        }
        System.out.println("ID orden " + idOrden + "\n");
    }

    @Override
    public String toString() {
        return "Orden{" +
                "idOrden=" + idOrden +
                ", productos=" + Arrays.toString(productos) +
                '}';
    }
}

