import java.time.LocalTime;

public class App {
  public static void main(String[] args) {
    int i = 4;
    Ciclista equipo[] = new Ciclista[i];
    

    equipo[0] = new Velocista(45698, "pedro", "Colombia", LocalTime.of(5, 30,20), 78, 45);
    equipo[1] = new Escalador(1236, "juan", "peru", LocalTime.of(4, 50, 10), 52, 78);
    equipo[2] = new ContraRelojista(78963,"luis", "brasil", LocalTime.of(3, 40, 30), 58);

    for (int j=0; j<equipo.length; j++) {
      if(equipo[i]==null){
        equipo[i] = new Ciclista(7896, "mauricio", "Venezuela", LocalTime.of(3,50,25));
      }
    }

    for (int j=0; j<equipo.length; j++) {
      int horasEquipo = equipo[i].tiempoAcumulado.getHour() + equipo[i].tiempoAcumulado.getHour();
      System.out.println(horasEquipo);
    }

    for (int j=0; j<equipo.length; j++ ) {
      System.out.println(equipo[i].nombre);
    }
    
  }
}
