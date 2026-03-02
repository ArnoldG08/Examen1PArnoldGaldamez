/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1_arnoldgaldamez;

/**
 *
 * @author USER
 */
public class Serie extends ProduccionesMultimedia {
    private int NumeroTemp;
    private int CantiEp;

    public Serie(int NumeroTemp, int CantiEp, int codigoID, String titulo, int duracion, double Presupuesto) {
        super(codigoID, titulo, duracion, Presupuesto);
        this.NumeroTemp = NumeroTemp;
        this.CantiEp = CantiEp;
    }
    @Override
      public void CostoFinal(){
      
      }
      
    public int getNumeroTemp() {
        return NumeroTemp;
    }

    public void setNumeroTemp(int NumeroTemp) {
        this.NumeroTemp = NumeroTemp;
    }

    public int getCantiEp() {
        return CantiEp;
    }

    public void setCantiEp(int CantiEp) {
        this.CantiEp = CantiEp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serie{");
        sb.append("NumeroTemp=").append(NumeroTemp);
        sb.append(", CantiEp=").append(CantiEp);
        sb.append('}');
        return sb.toString();
    }

    
    
}
