package atividade;

public class Main2 {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    
    String n1="10203";
    String n2="4005";
    String resultado = multiplicar(n1,n2);
  }

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

    Node node1 = listaMenor.fim;
    Node node2 = listaMaior.fim;
    
    // calcular:
    node1=listaMenor.fim;

    while (node1!=null) {
      node2=listaMaior.fim;
      int op1 = Integer.parseInt(node1.value);
      while (node2!=null) {
        int op2 = Integer.parseInt(node2.value);
        buffer = operar(op1, op2, buffer, resultado);
        node2 = node2.anterior;
        if (node2==null){
          resultado.addStart(buffer);
          buffer=0;
        }
      }
      System.out.println();
      System.out.println();
      node1=node1.anterior;
    }
    System.out.printf("%20s\n", listaMaior);
    System.out.printf("%20s\n", listaMenor);
    System.out.println();
    System.out.printf("%20s\n", resultado);
    System.out.println();
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
}
