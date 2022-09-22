import java.time.LocalTime;

public class ContraRelojista extends Ciclista{
  private int velocidadMax;

  public ContraRelojista(int id, String nombre, String paisOrigen, LocalTime tiempoAcumulado, int velocidadMax) {
    super(id, nombre, paisOrigen, tiempoAcumulado);
    this.velocidadMax = velocidadMax;
  }

  public int getVelocidadMax() {
    return velocidadMax;
  }

  public void setVelocidadMax(int velocidadMax) {
    this.velocidadMax = velocidadMax;
  }

  @Override
  public String toString() {
    return super.toString()+"ContraRelojista [velocidadMax=" + velocidadMax + "]";
  }

  
  
}
