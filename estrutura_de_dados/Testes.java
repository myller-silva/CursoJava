import atividade.Calcular;
import atividade.Check;
import atividade.Converter;
import atividade.Fila;

public class Testes {
  public static void main(String[] args) {
    Fila fila = new Fila();

    // fila.push("mac");
    // fila.push("myller");
    // fila.push("silva");
    fila.push("mac",0);
    fila.push("myller", 2);
    fila.push("silva", 0);
    fila.push("joao", 2);
    fila.push("matheus", 0);
    fila.push("carlos", 2);
    fila.push("jose", 12);
    // matheus silva carlos mac joao 

    System.out.println(fila);
    System.out.println(fila.primeiro.value);
    System.out.println(fila.ultimo.value);

  }
}
