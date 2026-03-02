/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1_arnoldgaldamez;

/**
 *
 * @author USER
 */
public class Documental extends ProduccionesMultimedia {
    
    private String Tema;
    private int Investigacion;

    public Documental(String Tema, int Investigacion, int codigoID, String titulo, int duracion, double Presupuesto) {
        super(codigoID, titulo, duracion, Presupuesto);
        this.Tema = Tema;
        this.Investigacion = Investigacion;
    }
    @Override
  public void CostoFinal(){
  
  }
  
    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public int getInvestigacion() {
        return Investigacion;
    }

    public void setInvestigacion(int Investigacion) {
        this.Investigacion = Investigacion;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Documental{");
        sb.append("Tema=").append(Tema);
        sb.append(", Investigacion=").append(Investigacion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
