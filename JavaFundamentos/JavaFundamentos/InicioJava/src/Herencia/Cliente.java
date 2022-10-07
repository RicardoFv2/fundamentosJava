package Herencia;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(Date fechRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechRegistro = fechRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechRegistro() {
        return fechRegistro;
    }

    public void setFechRegistro(Date fechRegistro) {
        this.fechRegistro = fechRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    public static void setContadorClientes(int contadorClientes) {
        Cliente.contadorClientes = contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "idCliente=" + idCliente +
                ", fechRegistro=" + fechRegistro +
                ", vip=" + vip +
                '}';
    }
}
