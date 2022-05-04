package atividade;

public class Main {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    String num1 = "54321";
    String num2 = "321";
    String resultado = multiplicar2(num1, num2);
    
  }

  public static String multiplicar2(String str1, String str2) {
    String strMaior=str1, strMenor=str2;
    int tamMaior = str1.length(), tamMenor = str2.length(), buffer = 0, res = 0;

    if (tamMaior < tamMenor) {
      strMaior = str2; strMenor = str1;
      int temp = tamMaior;
      tamMaior = tamMenor; tamMenor = temp;
    }

    ListaDupla resultado = new ListaDupla();
    ListaDupla listaMaior = particionar(strMaior);
    ListaDupla listaMenor = particionar(strMenor);
    
    Node caldaMenor = listaMenor.fim;
    Node aux = null;

    while (caldaMenor!=null) {
      System.out.println("___________________");
      System.out.println("aux: "+aux);
      Node caldaMaior = listaMaior.fim;
      int n1 = Integer.parseInt(caldaMenor.value);
      while (caldaMaior!=null) {
        int n2 = Integer.parseInt(caldaMaior.value);
        buffer = operar(n1, n2, buffer, resultado);
        caldaMaior = caldaMaior.anterior;
        if (caldaMaior==null) {
          resultado.addStart(buffer);
          buffer=0;
        }
      }
      aux = (aux==null)? resultado.fim.anterior : aux.anterior; //obs
      if (aux == null) break;

      System.out.println("resultado: "+resultado);
      caldaMenor = caldaMenor.anterior;
    }
    return resultado.str();
  }
  

  public static int operar(int n1, int n2, int buffer, ListaDupla lista) {
    int res = n1*n2+buffer;
    System.out.printf("%d x %d + %d = %d \n", n1, n2, buffer, res);
    buffer = res / 100;
    res -= buffer*100;
    lista.addStart(res);
    return buffer;
  }



  /*

  public static String multiplicar(String str1, String str2) {
    String strMaior=str1, strMenor=str2;
    int tamMaior = str1.length(), tamMenor = str2.length(), buffer = 0, res = 0;

    if (tamMaior < tamMenor) {
      strMaior = str2; strMenor = str1;
      int temp = tamMaior;
      tamMaior = tamMenor; tamMenor = temp;
    }

    ListaDupla resultado = new ListaDupla();
    ListaDupla listaMaior = particionar(strMaior);
    ListaDupla listaMenor = particionar(strMenor);
    
    Node caldaMenor = listaMenor.fim;
    while (caldaMenor!=null){
      System.out.println("___________________");
      Node caldaMaior = listaMaior.fim;
      int n1 = Integer.parseInt(caldaMenor.value);
      while(caldaMaior!=null){
        int n2 = Integer.parseInt(caldaMaior.value);
        res = n1*n2+buffer;
        System.out.printf("%d x %d + %d = %d \n", n1, n2, buffer, res);
        buffer = res / 100;
        res -= buffer*100;
        resultado.addStart(res);
        caldaMaior = caldaMaior.anterior;
        if (caldaMaior==null) {
          resultado.addStart(buffer);
          buffer=0;
        }
      }      
      System.out.println("resultado: "+resultado);
      caldaMenor = caldaMenor.anterior;
    }
    return resultado.str();
  }
   */

  



  
   



  public static ListaDupla particionar(String str) {
    ListaDupla lista = new ListaDupla();
    int tam = str.length();
    String num="";
    int inicio = 0;
    if( tam%2==1 ){
      num += str.charAt(inicio++);
      lista.addEnd(num);
      num="";
    }
    for (int i = inicio; i < tam; i++) {
      char c1 = 0, c2 = 0; 
      try{
        c1 = str.charAt(i);
      }catch(Exception e){
        break;
      }
      try{
        c2 = str.charAt(++i);
      }catch(Exception e){
        lista.addEnd(c1);
        break;
      }
      lista.addEnd(c1+""+c2);
    }
    return lista;
  }

  /*
  public static String multiplicar(String str1, String str2) {
    String strMaior=str1, strMenor=str2;
    int tam1 = str1.length();
    int tam2 = str2.length();
    int tamMaior = tam1;
    int tamMenor = tam2;
    
    if (tam1 < tam2) {
      strMaior = str2;
      strMenor = str1;
      tamMaior = tam2;
      tamMenor = tam1;
    }
    ListaDupla listaMaior = particionarDoisADois(strMaior);
    ListaDupla listaMenor = particionarDoisADois(strMenor);
    ListaDupla resultado = new ListaDupla();
    int buffer = 0;
    int res = 0; 
    
    Node caldaMenor = listaMenor.fim;

    while (caldaMenor!=null){
      Node caldaMaior = listaMaior.fim;
      int n1 = Integer.parseInt(caldaMenor.value);
      do{
        // System.out.println("buffer: "+buffer);
        int n2 = Integer.parseInt(caldaMaior.value);
        System.out.print(caldaMenor+" x "+caldaMaior+" + "+buffer+" = ");
        res = n1*n2+buffer;
        System.out.println(res);
        if(res>99) {
          buffer = res/100;
          res = res-(buffer*100);
          System.out.println("buffer: "+buffer);
          System.out.println("add: "+res);   
        }else{
          buffer=0;
        }
        resultado.addStart(String.format("%2d", res));
        caldaMaior = caldaMaior.anterior;
        System.out.println();
      }while(caldaMaior!=null);
      caldaMenor = caldaMenor.anterior;
    }
    System.out.println("resultado: "+resultado);
    return resultado.str();
  }
  */
  
}
// 9 87 65
//   54 32


// int topo=0;
// try{
//   topo = Integer.parseInt(resultado.inicio.value);
//   resultado.deleteStart();
// }catch(Exception e){}
// int add = topo + res;
// if(add>99){
//   buffer += add/100;
//   add -= (add/100)*100;
// }