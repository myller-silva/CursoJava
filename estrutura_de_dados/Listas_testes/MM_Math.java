package Listas_testes;

public class MM_Math{
  public static String multiplicar(String num1, String num2) {
    ListaDuplamenteEncadeada l1 = particionar(num1);
    ListaDuplamenteEncadeada l2 = particionar(num2);
    System.out.println(l1+"\n"+l2);
    ListaDuplamenteEncadeada parcelas = new ListaDuplamenteEncadeada();
    Node no1 = l1.fim;
    Node no2 = l2.fim;
    int cont1=0;
    int cont2=0;
    
    while (no2!=null) {
      while (no1!=null) {
        parcelas.addEnd(operar(no1.value, cont1, no2.value, cont2)); 
        // parcelas.addEnd("+");
        no1=no1.anterior;
        cont1+=2;
      }
      cont1=0;
      no1 = l1.fim;
      no2=no2.anterior;
      cont2+=2;
    }
    return somatorio(parcelas);
  }

  private static String somatorio(ListaDuplamenteEncadeada lista) {
    if (lista==null) return null;
    if (lista.isEmpty()) return null;
    // int soma=0;
    double soma=0;
    Node no = lista.inicio;
    while (no!=null) {
      try{
        // soma += Integer.parseInt(no.value);
        soma += Double.parseDouble(no.value);
      } catch(Exception e){}
      no=no.proximo;      
    }
    // return String.format("%d", soma);
    return String.format("%.0f", soma);
  }

  private static String operar(String str1, double pow1, String str2, double pow2) {
    Double e1 = Math.pow(10, pow1);
    Double e2 = Math.pow(10, pow2);
    double d1 = Double.parseDouble(str1);
    double d2 = Double.parseDouble(str2);
    return String.format("%.0f", d1*e1*d2*e2);
  }

  public static ListaDuplamenteEncadeada particionar(String str) {
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
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
