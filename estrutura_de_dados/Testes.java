import atividade.Calcular;
import atividade.Check;
import atividade.Converter;

public class Testes {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    String[] strs={
      // "(12 -21)+31",
      "(12 +-21)+31",
      "(-21)+31",
      "(54+32.1)*(765-43)+2.1 ",
      "(54+32.1)*(765+43)+2.1 + 1.0.0",
      "25+432.0)*(1337+42+9.0",
      " 2 + 8 + ",
      "( 2 + .3)" ,
      "2(12 + -12) ",
      "2(-12+11) ",
    };

    for (String str : strs) {
      String strPos = Converter.toPosfix(str);
      System.out.println(str);
      System.out.println(strPos);
      System.out.println(Calcular.expressaoPosfixa(strPos)+"\n");
    }

    System.out.println(Check.isPosfix("1.3 1 +"));
    
    
  }  
}
