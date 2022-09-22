import java.time.LocalTime;

public class Escalador extends Ciclista{
  private int aceleracionProm;
  private int gradoRampa;
  
  public Escalador(int id, String nombre, String paisOrigen, LocalTime tiempoAcumulado, int aceleracionProm,
      int gradoRampa) {
    super(id, nombre, paisOrigen, tiempoAcumulado);
    this.aceleracionProm = aceleracionProm;
    this.gradoRampa = gradoRampa;
  }

  public int getAceleracionProm() {
    return aceleracionProm;
  }

  public void setAceleracionProm(int aceleracionProm) {
    this.aceleracionProm = aceleracionProm;
  }

  public int getGradoRampa() {
    return gradoRampa;
  }

  public void setGradoRampa(int gradoRampa) {
    this.gradoRampa = gradoRampa;
  }

  @Override
  public String toString() {
    return super.toString()+ "Escalador [aceleracionProm=" + aceleracionProm + ", gradoRampa=" + gradoRampa + "]";
  }

  

  
}
