package atividade;

public class Main2 {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    
    String n1="4321";
    String n2="321";
    String resultado = multiplicar(n1,n2);
    
    System.out.printf("%20s\n", n1);
    System.out.printf("%20s\n", n2);
    System.out.printf("%20s", "x__________\n");
    System.out.printf("%20s\n", resultado);
  }

  public static String multiplicar(String str1, String str2) {
    String strMaior=str1, strMenor=str2;
    int tamMaior = str1.length(), tamMenor = str2.length(), buffer = 0, res = 0;

    if (tamMaior < tamMenor) {
      strMaior = str2; strMenor = str1;
      int temp = tamMaior;
      tamMaior = tamMenor; tamMenor = temp;
    }

    ListaDupla listaMaior = particionar(strMaior);
    ListaDupla listaMenor = particionar(strMenor);

    Node node1 = listaMenor.fim;
    Node node2 = listaMaior.fim;
    
    // calcular:
    ListaDupla resultado = new ListaDupla();
    Node nodeAux = null;
    node1=listaMenor.fim;

    while (node1!=null) {
      node2=listaMaior.fim;
      int op1 = Integer.parseInt(node1.value);
      ListaDupla listaAux = new ListaDupla();
      while (node2!=null) {
        int op2 = Integer.parseInt(node2.value);
        buffer = operar(op1, op2, buffer, listaAux);
        node2 = node2.anterior;
        if (node2==null){
          listaAux.addStart(buffer);
          buffer=0;
        }
      }
      if(nodeAux==null) {
        resultado = copy(listaAux);
      }else{
        int bufferSomatorio = somatorio(listaAux, nodeAux);
        if (bufferSomatorio!=0) resultado.addStart(bufferSomatorio);
      }
      nodeAux = (nodeAux==null)?resultado.fim.anterior : nodeAux.anterior;
      node1=node1.anterior;
    }
    
    return resultado.str();
  }

  public static int somatorio(ListaDupla listaAux, Node nodeAux){
    int buffer=0, res=0;
    Node no = listaAux.fim;
    while (nodeAux!=null) {
      int n1 = Integer.parseInt(no.value);
      int n2 = Integer.parseInt(nodeAux.value);
      res = n1 + n2 + buffer;
      buffer = res/100;
      res -= buffer*100; 
      nodeAux.value = ""+res;
      no = no.anterior;
      nodeAux = nodeAux.anterior;      
    }
    return buffer;
  }

  public static ListaDupla copy(ListaDupla lista) {
    ListaDupla temp = new ListaDupla();
    while (!lista.isEmpty()) {
      temp.addEnd(lista.inicio.value);
      lista.deleteStart();
    }
    return temp;
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
