public class Operar{
  
  public static String soma(String n1, String n2) {
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();;
    String str="";
    int buffer=0;
    int tam1 = n1.length();
    int tam2 = n2.length();
    String maior, menor;

    if(tam1>=tam2) {
      maior = n1;
      menor = n2;
    }else{
      maior = n2;
      menor = n1;
      int temp = tam1;
      tam1 = tam2;
      tam2 = temp;
    }    

    int c1=0, c2=0;
    int i2 = tam2-1;
    
    for (int i = tam1-1; i >= 0 ; i--) {
      c1 = maior.charAt(i) - 48;
      try {
        c2 = menor.charAt(i2--) - 48;
      } catch (Exception e) {
        estouro(maior, buffer, lista, i);
        break;
      }
      int soma = c1+c2+buffer;
      if(soma>9){
        soma -= 10;
        buffer = 1;
      }else{
        buffer=0;
      }
      lista.addStart(""+soma);
    }
    
    str = lista.str();
    return str;
  }
  private static void estouro(String maior, int buffer, ListaDuplamenteEncadeada lista, int i) {
      String restante = maior.substring(0, i+1);
      int tamr = restante.length();
      for (int j = tamr-1; j >=0; j--) { //
        int c3 = restante.charAt(j) - 48;
        int soma = c3+buffer;
        if(soma>9){
          soma -= 10;
          buffer = 1;
        }else{
          buffer=0;
        }
        lista.addStart(""+soma);
      }
  }

  // karatsuba(){}
    
}