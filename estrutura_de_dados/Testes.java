public class Testes {

  /*
  */
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    String num1 = "987";
    String num2 = "5432";
 
    int d1 = Operar.multplicacaoKaratsuba(num1, num2);
    String d2 =  Operar.multplicacaoKaratsuba(num1, num2, true);
    
    System.out.printf("resultado: %d\n", d1);
    System.out.println("resultado: "+ d2);
  } 
    
}
