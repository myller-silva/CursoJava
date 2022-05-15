import atvs.entregaveis.calculo_big_int.ListaDupla;

public class Operar{
  
  public static String soma(String n1, String n2) {
    ListaDupla lista = new ListaDupla();;
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
    if(buffer!=0) {lista.addStart(""+buffer);}
    str = lista.str();
    return str;
  }
  
  private static void estouro(String maior, int buffer, ListaDupla lista, int i) {
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
      // System.out.println(buffer);
      lista.addStart(""+soma);
    }
    if(buffer!=0) {lista.addStart(""+buffer);}
  }

  public static String multplicacaoUsual(String n1, String n2) {
    String str="";
    try {
      double d1 = Double.parseDouble(n1);
      double d2 = Double.parseDouble(n2);
      str = String.format("%.0f", d1*d2);
    } catch (Exception e){
      return null;
    }
    return str;
  }

  public static String somaUsual(String n1, String n2) {
    String str="";
    try {
      double d1 = Double.parseDouble(n1);
      double d2 = Double.parseDouble(n2);
      str = String.format("%.0f", d1+d2);
    } catch (Exception e){
      return null;
    }
    return str;
  }
  
  public static String subtracaoUsual(String n1, String n2) {
    String str="";
    try {
      double d1 = Double.parseDouble(n1);
      double d2 = Double.parseDouble(n2);
      str = String.format("%.0f", d1-d2);
    } catch (Exception e){
      return null;
    }
    return str;
  }

  public static int multplicacaoKaratsuba(int n1, int n2) {
    String str1 = String.format("%d", n1);
    String str2 = String.format("%d", n2);
    return multplicacaoKaratsuba(str1, str2);
  }

  public static int multplicacaoKaratsuba(String n1, String n2){
    // System.out.println(n1+" x "+n2);    
    // if(n1.equals("0")) return 0;
    // if(n2.equals("0")) return 0;
    String maior = n1, menor = n2;
    int tam1 = n1.length();
    int tam2 = n2.length();
    
    if (tam1<tam2) {
      maior = n2;
      menor = n1;
      int temp = tam1;
      tam1 = tam2;
      tam2 = temp;
    }
    
    int qtd_zeros = tam1 - tam2;
    
    int maiorInt = Integer.parseInt(maior) ;
    int menorInt = Integer.parseInt(menor) ;

    int n = (int)Math.pow(10, qtd_zeros);
    int aux = (int)Math.pow(10, maior.length()/2);
    int a = maiorInt / ( aux ) ;
    int b = maiorInt - (a * aux) ;
    int num2 = menorInt * n  ;
    int c = num2 / aux ; 
    int d = num2 - c*aux ;
    
    int tamB = (""+b).length();
    
    int m = (int)Math.pow(10, tamB ); 
    int pow = 2;
    int F = (a * c);
    int G = (b * d);
    int H = ((a + b) * (c + d));
    int K = ((H-F)-G);
    
    int Q = (int)(Math.pow(10, qtd_zeros ));
    int computacao = (int) ( (F*Math.pow(m, pow ) + K*m + G) / Q );

    return computacao;
  }
  
  public static String multplicacaoKaratsuba(String n1, String n2, boolean string){
    String maior = n1, menor = n2;
    int a, b, c, d;
    int tam1 = n1.length(), tam2 = n2.length();
    int qtd_zeros=0;

    if (tam1<tam2) {
      maior = n2;
      menor = n1;
      int temp = tam1;
      tam1 = tam2;
      tam2 = temp;
    }

    qtd_zeros = tam1-tam2;
    for (int i = 0; i < qtd_zeros; i++) {
      menor+="0";
    }
    String strA = maior.substring(0, tam1/2 );
    String strB = maior.substring( tam1/2 , tam1);    
    String strC = menor.substring( 0, tam1/2 );
    String strD = menor.substring( tam1/2 , tam1);

    a = Integer.parseInt(strA);
    b = Integer.parseInt(strB);
    c = Integer.parseInt(strC);
    d = Integer.parseInt(strD);
    // int tamB = String.format("%d", b).length();
    int tamB = (""+b).length();
    
    double m = Math.pow(10, tamB ); 
    int pow = 2;
    int F = (a * c);
    int G = (b * d);
    int H = ((a + b) * (c + d));
    int K = ((H-F)-G);
    
    double Q = Math.pow(10, qtd_zeros );
    double resultado = (F*Math.pow(m, pow ) + K*m + G) / Q;
    
    return String.format("%.0f", resultado  );
  }

}