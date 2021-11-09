package Entidades;

public abstract class informacionVentas {

    protected int idVentaContado,hora;
    protected double montoVenta;
    protected String fecha,metodoPago;

    public int getidVentaContado() {
        return idVentaContado;
    }

    public void setidVentaContado(int idVentaContado) {
        this.idVentaContado = idVentaContado;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }



}
