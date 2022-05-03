package atividade;

public class Main {
  public static void main(String[] args) {
    String num1 = "9876";
    String num2 = "5432";
    System.out.println(particionarDoisADois(num1));
    System.out.println(particionarDoisADois(num2));
  }
  




  public static ListaDupla particionarDoisADois(String str) {
    ListaDupla lista = new ListaDupla();
    int tam = str.length();
    String num="";

    if (tam%2==0) {
      for (int i = 0; i < tam; i++) {
        char c = str.charAt(i);
        num += c;
        if (i%2==1) {
          lista.addEnd(num);
          num="";
        }
      }
    }else{
      num += str.charAt(0);
      lista.addEnd(num);
      num="";
      for (int i = 1; i < tam; i++) {
        char c = str.charAt(i);
        num += c;
        if (i%2==0) {
          lista.addEnd(num);
          num="";
        }
      }
    }
    // if (!num.equals("")) lista.addStart(num) ;
    return lista;
  }
}