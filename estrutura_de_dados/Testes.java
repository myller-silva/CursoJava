import atividade.Calcular;
import atividade.Converter;

public class Testes {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    String[] strs={
      "(12 -21)+31",
      "(12-21)+31",
      "(-21)+31",
      "-21+31",
      "(54+32.1)*(765-43)+2.1 ",
      "(54+32.1)*(765+43)+2.1 + 1.0.0",
      "25+432.0)*(1337+42+9.0",
      " 2 + 8 + ",
      "( 2 + .3)" ,
      "2(12 + -12) ",
      "2(-12+11) ",
    };
    int i = 9;
    
    String strPos = Converter.toPosfix(strs[i]);
    System.out.println(strs[i]);
    System.out.println(strPos);    
    System.out.println(Calcular.expressaoPosfixa(strPos));
    
  }  
}
