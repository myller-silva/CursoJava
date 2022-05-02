package List;

interface Lista {
  public boolean addEnd(String value);
  public boolean addStart(String value);
  public boolean deleteEnd();
  public boolean deleteStart();
  public boolean delete(String value);
  public boolean isEmpty();
  public boolean addBefore(String v1, String v2);
  public boolean addAfter(String v1, String v2);
  public boolean deleteAllReferences(String value);
}

class Node{
  String value;
  Node anterior;
  Node proximo;
  Node(){
    anterior = null;
    proximo = null;
    value = null;
  }
  Node(String value){
    this();
    this.value=value;
  }
  @Override
  public String toString() {
    return this.value;
  }
}

public class ListaDuplamenteEncadeada implements Lista{
  Node inicio;
  Node fim;
  ListaDuplamenteEncadeada(){
    this.inicio=null;
    this.fim=null;
  }
  /* 
  private boolean delete(Node no){
    System.out.println(no);
    if(isEmpty()) return false;
    if(no.equals(inicio)) return deleteStart();
    if(no.equals(fim)) return deleteEnd();
    Node ant = no.anterior;
    Node prox = no.proximo;
    ant.proximo = prox;
    prox.anterior = ant;
    return false;
  }
  */

  @Override
  public boolean delete(String value) {
    if (isEmpty()) return false;
    if (this.inicio.value.equals(value)) return deleteStart();
    if (this.fim.value.equals(value)) return deleteEnd();

    Node no = this.inicio.proximo;
    while(no.proximo!=null){
      if(no.value.equals(value)){
        Node ant = no.anterior;
        Node prox = no.proximo;
        ant.proximo = prox;
        prox.anterior = ant;
        return true;
      }            
      no=no.proximo;
    }
    return false;
  }

  @Override
  public boolean deleteAllReferences(String value) {
    if (isEmpty()) return false;
    boolean excluido = false;

    while (this.inicio.value.equals(value)) {
      if(deleteStart()) excluido = true;
      if (isEmpty()) return excluido;
    }
    while (this.fim.value.equals(value)) {
      if(deleteEnd()) excluido = true;
      if (isEmpty()) return excluido;
    }

    Node no = this.inicio;
    int cont=0;

    while(no!=null){
      System.out.println(cont+++" no: "+no);
      if(no.value.equals(value)){
        Node ant = no.anterior;
        Node prox = no.proximo;
        ant.proximo = prox;
        prox.anterior = ant;
        excluido = true;
      }
      no=no.proximo;
    }
    return excluido;
  }

  @Override
  public boolean addBefore(String v1, String v2){
    if (v2.equals(this.inicio.value) )return  addStart(v1);
    Node no = this.inicio;
    while (no!=null) {
      if(no.value.equals(v2)){
        Node novo = new Node(v1);
        novo.proximo = no;
        novo.anterior = no.anterior;
        no.anterior=novo;
        novo.anterior.proximo=novo;
        return true;
      }      
      no=no.proximo;
    }
    return false;
  }

  @Override
  public boolean addAfter(String v1, String v2){
    Node no = this.inicio;
    while (no.proximo!=null) {
      if(no.value.equals(v2)){
        Node novo = new Node(v1);
        novo.proximo = no.proximo;
        novo.anterior = no;
        no.proximo.anterior = novo;
        no.proximo = novo;
        return true;
      }      
      no=no.proximo;
    }
    if (v2.equals(this.fim.value) )return  addEnd(v1);
    return false;
  }

  public boolean addStart(int value){
    // return addStart(""+value);
    return addStart(String.format("%d",value));
  }
  public boolean addStart(double value){
    return addStart(String.format("%.0f",value));
  }

  @Override
  public boolean addStart(String value) {
    if (value==null) return false;
    Node no = new Node(value);
    if (isEmpty()) {
      no.anterior=null;
      no.proximo=null;
      this.inicio=no;
      this.fim=no;
      return true;
    }
    no.proximo = this.inicio;
    this.inicio.anterior = no;
    this.inicio =  no;

    return true;
  }

  @Override
  public boolean addEnd(String value) {
    if (value==null) return false;
    Node no = new Node(value);
    if (isEmpty()) {
      no.anterior=null;
      no.proximo=null;
      this.inicio=no;
      this.fim=no;
      return true;
    }
    no.proximo = null;
    no.anterior = this.fim;
    this.fim.proximo = no;
    this.fim = no;  
    return true;
  }

  @Override
  public boolean deleteEnd() {
    if (isEmpty()) return false;
    if (this.fim.equals(this.inicio)) {
      this.inicio=null;
      this.fim=null;
      return true;
    }
    this.fim = this.fim.anterior;
    this.fim.proximo = null;
    return true;
  }

  @Override
  public boolean deleteStart() {
    if (isEmpty()) return false;
    if (this.fim.equals(this.inicio)) {
      this.inicio = null;
      this.fim = null;
      return true;
    }
    this.inicio = this.inicio.proximo;
    this.inicio.anterior = null;
    return false;
  }

  @Override
  public boolean isEmpty() {
    return (this.inicio==null && this.fim==null);
  }
  
  @Override
  public String toString() {
    Node no = this.inicio;
    String str="";
    while (no!=null) {
      str+=no.value+" ";
      no=no.proximo;
    }
    return str;
  }
  
  public String toString(boolean inverso) {
    if (!inverso) return this.toString();
    String str="";
    Node no = this.fim;
    while (no!=null) {
      str += no.value+" ";
      no = no.anterior ;
    }
    return str;
  }

  public String str() {
    String str="";
    Node no = this.inicio;
    while (no!=null) {
      str += no.value;
      no = no.proximo ;
    }
    return str;
  }

}

class Main{
  public static void main(String[] args) {
    utils_my.Console.limparTela();

    String n1="98765";
    String n2="65432";
    // 98765 * 65432 = 6462391480
    String resultado = multiplicar(n1, n2);
    System.out.println("resultado: "+ resultado);
  }

  public static String multiplicar(String num1, String num2) {
    ListaDuplamenteEncadeada l1 = separar(num1);
    ListaDuplamenteEncadeada l2 = separar(num2);
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
    // parcelas.deleteEnd();
    
    System.out.printf("%15s\n", l1);
    System.out.printf("%15s\n", l2);
    System.out.printf("%14s\n\n", "______________");
    
    System.out.println("parcelas: "+parcelas+"\n");
    
    return somatorio(parcelas);
  }

  private static String somatorio(ListaDuplamenteEncadeada lista) {
    if (lista==null) return null;
    if (lista.isEmpty()) return null;
    double soma=0;
    Node no = lista.inicio;
    while (no!=null) {
      try{
        soma += Double.parseDouble(no.value);
      } catch(Exception e){}
      no=no.proximo;      
    }
    return String.format("%.0f", soma);
  }

  private static String operar(String str1, double pow1, String str2, double pow2) {
    Double e1 = Math.pow(10, pow1);
    Double e2 = Math.pow(10, pow2);
    double d1 = Double.parseDouble(str1);
    double d2 = Double.parseDouble(str2);
    return String.format("%.0f", d1*e1*d2*e2);
  }

  public static ListaDuplamenteEncadeada separar(String str) {
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
