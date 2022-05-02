package Listas_testes;

public class Main{
  public static void main(String[] args) {
    utils_my.Console.limparTela();

    String n1="98765";
    String n2="65432";
    // 98765 * 65432 = 6462391480
    String resultado = MM_Math.multiplicar(n1, n2);
    System.out.println(n1+" x "+n2 +" = "+ resultado);
    System.out.println();
  }
  
}