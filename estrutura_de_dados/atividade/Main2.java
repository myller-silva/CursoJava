package atividade;

public class Main2 {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    
    String n1="4568";
    String n2="123";
    String resultado = multiplicar(n1,n2);
    
    System.out.printf("%20s\n", n1);
    System.out.printf("%20s\n", n2);
    System.out.printf("%21s", "x__________\n");
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

    Node calda1 = listaMenor.fim;
    Node calda2 = listaMaior.fim;
    
    // calcular:
    ListaDupla resultado = new ListaDupla();
    calda1=listaMenor.fim;
    Node nodeAux = null;

    while (calda1!=null) {
      calda2=listaMaior.fim;
      int op1 = Integer.parseInt(calda1.value);
      ListaDupla listaAux = new ListaDupla();
      
      listaAux.addStart("0");
      while (calda2!=null) {
        int op2 = Integer.parseInt(calda2.value);
        buffer = Integer.parseInt(listaAux.inicio.value);
        res = op1*op2+buffer; 
        System.out.println(op1+" x "+op2+" + "+buffer+" = "+ res);
        buffer = res/100;
        res -= buffer*100;
        listaAux.inicio.value = ""+res;
        listaAux.addStart(buffer);
        calda2 = calda2.anterior;
      }
      System.out.println("nodeAux: "+nodeAux+"\n");
      System.out.println("lista aux: "+listaAux+"\n");
      if (nodeAux==null) resultado = copy(listaAux);
      else somatorio(resultado, listaAux, nodeAux);

      nodeAux = (nodeAux==null) ? resultado.fim.anterior : nodeAux.anterior;
      calda1=calda1.anterior;
    }
    
    return resultado.toString();
    // return resultado.str();
  }

  public static void somatorio(ListaDupla lista, ListaDupla aux, Node no) {
    while (!aux.isEmpty()) {
      int n1 = Integer.parseInt(no.value);
      int n2 = Integer.parseInt(aux.fim.value);
      int res = n1+n2;
      int buffer = res / 100;
      res -= buffer*100;
      no.value = ""+res;
      lista.addStart(buffer);
      no=no.anterior;
      aux.deleteEnd();
    }
  }
  
  public static ListaDupla copy(ListaDupla lista) {
    ListaDupla temp = new ListaDupla();
    while (!lista.isEmpty()) {
      temp.addEnd(lista.inicio.value);
      lista.deleteStart();
    }
    return temp;
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
