
public class Testes {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    String str="1234";
    for(int i = 0; i < str.length(); i+=2) {
      System.out.println(str.substring(i, i+2));
      
    }
  }
}



