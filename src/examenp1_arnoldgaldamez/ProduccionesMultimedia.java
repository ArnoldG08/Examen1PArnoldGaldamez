/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1_arnoldgaldamez;

/**
 *
 * @author USER
 */
public abstract class ProduccionesMultimedia {

    private int codigoID;
    private String titulo;
    private int duracion;
    protected double Presupuesto;

    public ProduccionesMultimedia(int codigoID, String titulo, int duracion, double Presupuesto) {
        this.codigoID = codigoID;
        this.titulo = titulo;
        this.duracion = duracion;
        this.Presupuesto = Presupuesto;
    }

    public abstract void CostoFinal();

    public int getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProduccionesMultimedia{");
        sb.append("codigoID=").append(codigoID);
        sb.append(", titulo=").append(titulo);
        sb.append(", duracion=").append(duracion);
        sb.append(", Presupuesto=").append(Presupuesto);
        sb.append('}');
        return sb.toString();
    }

}
