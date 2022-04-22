import atividade.Calcular;
import atividade.Check;
import atividade.Converter;

public class Testes {
  public static void main(String[] args) {
    // String str="712 2 *";
		
    // System.out.println(Converter.paraFila(str));
    // System.out.println(Calcular.expressaoPosfixa(str));

    String n1 = "+12.6";
    String n2 = "-12";
    System.out.println(Check.isDouble(n1));
    System.out.println(Check.isDouble(n2));
  }
}
