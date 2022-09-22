import java.time.LocalTime;

public class Ciclista {
  protected int id;
  protected String nombre;
  protected String paisOrigen;
  protected LocalTime tiempoAcumulado;
 
  public Ciclista(int id, String nombre, String paisOrigen, LocalTime tiempoAcumulado) {
    this.id = id;
    this.nombre = nombre;
    this.paisOrigen = paisOrigen;
    this.tiempoAcumulado = tiempoAcumulado;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPaisOrigen() {
    return paisOrigen;
  }

  public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
  }

  public LocalTime getTiempoAcumulado() {
    return tiempoAcumulado;
  }

  public void setTiempoAcumulado(LocalTime tiempoAcumulado) {
    this.tiempoAcumulado = tiempoAcumulado;
  }

  @Override
  public String toString() {
    return "Ciclista [id=" + id + ", nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", tiempoAcumulado="
        + tiempoAcumulado + "]";
  }

  

  
}
