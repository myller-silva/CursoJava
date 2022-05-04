package atividade;

public class Main {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    
    String n1="123";
    String n2="1234";

    String resultado = MM_Math.multiplicar(n1,n2);
    int length = resultado.length();
    String format = "%"+length+"s\n";
    System.out.printf(format, n1);
    System.out.printf(format, n2);
    System.out.printf(format, "x____");
    System.out.printf(format, resultado);
    System.out.println();
  }

}
