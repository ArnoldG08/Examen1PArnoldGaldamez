/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1_arnoldgaldamez;

/**
 *
 * @author USER
 */
public class Podcast extends ProduccionesMultimedia {

private int NumEp;
private int invitados;

    public Podcast(int NumEp, int invitados, int codigoID, String titulo, int duracion, double Presupuesto) {
        super(codigoID, titulo, duracion, Presupuesto);
        this.NumEp = NumEp;
        this.invitados = invitados;
    }
    @Override
  public void CostoFinal(){
        System.out.println("Costo del Podcast");
        double a = Presupuesto +(NumEp * 500);
  }
  
    public int getNumEp() {
        return NumEp;
    }

    public void setNumEp(int NumEp) {
        this.NumEp = NumEp;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Podcast{");
        sb.append("NumEp=").append(NumEp);
        sb.append(", invitados=").append(invitados);
        sb.append('}');
        return sb.toString();
    }



}
