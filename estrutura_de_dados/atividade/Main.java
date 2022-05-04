package atividade;

public class Main {
  public static void main(String[] args) {
    utils_my.Console.limparTela();
    
    String n1="1234567898765432123456789876543212345678987654321";
    String n2="1234567898765432123456789876543212345678987654321";

    String resultado = multiplicar(n1,n2);
    int length = resultado.length();
    String format = "%"+length+"s\n";
    System.out.printf(format, n1);
    System.out.printf(format, n2);
    System.out.printf(format, "x__________");
    System.out.printf(format, resultado);
    // System.out.println("\tlength: "+length);
    System.out.println();
  }

  public static String multiplicar(String str1, String str2) {
    String strMaior=str1, strMenor=str2;
    int tamMaior = str1.length(), tamMenor = str2.length();

    if(tamMaior < tamMenor) {
      strMaior = str2; strMenor = str1;
      int temp = tamMaior;
      tamMaior = tamMenor; tamMenor = temp;
    }
    ListaDupla listaMaior = particionar(strMaior);
    ListaDupla listaMenor = particionar(strMenor);
    Node calda1 = listaMenor.fim;
    Node calda2 = listaMaior.fim;
    // preencher:
    ListaDupla resultado = gerarListaDupla(calda1, calda2);
    // calcular:
    calda1 = listaMenor.fim; calda2 = listaMaior.fim;
    Node aux = resultado.fim;
    Node aux2 = aux;
    int buffer=0;
    while (calda1!=null) {
      calda2 = listaMaior.fim;
      int n1 = Integer.parseInt(calda1.value);
      aux2 = aux;
      while (calda2!=null) {
        int n2 = Integer.parseInt(calda2.value);
        buffer = Integer.parseInt(aux2.value);
        int res = n1*n2+buffer;
        buffer = res/100;
        res -= buffer*100;
        aux2.value = (res<9)? "0"+res : ""+res ;
        buffer += Integer.parseInt(aux2.anterior.value);
        aux2.anterior.value = (buffer<9) ? "0"+buffer: ""+buffer;
        aux2=aux2.anterior;
        calda2 = calda2.anterior;
      }
      aux=aux.anterior;
      calda1=calda1.anterior;
    }
    while(nulo(resultado.inicio.value)) resultado.deleteStart();
    resultado.inicio.value = ""+Integer.parseInt(resultado.inicio.value);
    return resultado.str();
    // return resultado.toString();
  }
  public static ListaDupla gerarListaDupla(Node calda1, Node calda2) {
    ListaDupla lista = new ListaDupla();
    while (calda1!=null) {
      lista.addStart("0");
      while (calda2!=null) {
        lista.addStart("0");
        calda2 = calda2.anterior;
      }
      calda1 = calda1.anterior;
    }
    return lista;
  }

  public static boolean nulo(String num) {
    Integer n = Integer.parseInt(num);
    return n==0?true:false;
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
