import java.time.LocalTime;

public class Velocista extends Ciclista{
  private int potenciaProm;
  private int velocidadProm;
 
  public Velocista(int id, String nombre, String paisOrigen, LocalTime tiempoAcumulado, int potenciaProm,
      int velocidadProm) {
    super(id, nombre, paisOrigen, tiempoAcumulado);
    this.potenciaProm = potenciaProm;
    this.velocidadProm = velocidadProm;
  }

  public int getPotenciaProm() {
    return potenciaProm;
  }

  public void setPotenciaProm(int potenciaProm) {
    this.potenciaProm = potenciaProm;
  }

  public int getVelocidadProm() {
    return velocidadProm;
  }

  public void setVelocidadProm(int velocidadProm) {
    this.velocidadProm = velocidadProm;
  }

  @Override
  public String toString() {
    return super.toString()+ "Velocista [potenciaProm=" + potenciaProm + ", velocidadProm=" + velocidadProm + "]";
  }
  
}
