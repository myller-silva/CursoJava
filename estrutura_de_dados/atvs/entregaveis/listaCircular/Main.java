package atvs.entregaveis.listaCircular;

public class Main {
  public static void main(String[] args) {
    utils_my.Console.limparTela();

    ListaCircular listaProgramas = new ListaCircular();

    listaProgramas.add(2, 500, true);
    listaProgramas.add(1, 550, false);
    listaProgramas.add(3, 398, false);

    
    System.out.println(listaProgramas);
    System.out.println();
    listaProgramas.print();
    System.out.println();
  }
}

class Node{
  int id;
  int tempo;
  int tamanho;
  boolean maisMemoria;

  Node next;

  Node(){
    this.next=null;
  }
  public Node(int id, int tempo, int tamanho, boolean maisMemoria){
    this();
    this.id = id;
    this.tempo = ( (tempo<0) ? (tempo*(-1)) : tempo );
    this.tamanho = ( (tamanho<0) ? (tamanho*(-1)) : tamanho );
    this.maisMemoria = maisMemoria;
  }
  
  @Override
  public String toString() {
    return String.format("[id: %d, tempo: %d, tamanho: %d, mais: %b]", id, tempo, tamanho, maisMemoria);
  }
}



class ListaCircular {
  Node ultimo;
  private int contadorProgramas=0;
  private int length=0;

  public ListaCircular() {
    this.ultimo = null;
  }
  public boolean isEmpty() {
    return ( this.ultimo==null && length==0 );
    // return ( this.ultimo==null );
    // return ( length==0 );
  }

  public int length() {
    return length;
  }
  
  public Node remove(Node nodeAnterior){
    if(nodeAnterior==null) return null;
    if(isEmpty()) return null;
    if(length==1){
      Node temp = nodeAnterior;
      nodeAnterior=null;
      ultimo=null;
      length--;
      return temp;
    }
    if(length==2){
      Node temp = nodeAnterior;
      ultimo=nodeAnterior.next;
      ultimo.next=ultimo;
      length--;
      return temp;
    }
    
    
    Node no = nodeAnterior.next;
    if(no.id==ultimo.id){
      ultimo = nodeAnterior;
    }
    nodeAnterior.next = no.next;
    length--;
    return no;
   }

   

  public Node add(int tempo, int tamanho, boolean maisMemoria) {
    if(tempo<=0 || tamanho<=0) return null;

    Node no = new Node(contadorProgramas++, tempo, tamanho, maisMemoria);
    if(isEmpty()){
      this.ultimo = no;
      this.ultimo.next = no;
      length++;
      return no;
    }
    Node primeiro = this.ultimo.next;
    no.next = primeiro;
    ultimo.next=no;
    ultimo=no;
    length++;
    return no;
  }

  public void print() {  
    if(isEmpty()) return;
    if(ultimo==null) return;
    Node anterior = this.ultimo;
    Node no = this.ultimo.next;
    do{
      System.out.println(no);
      if (--no.tempo<=0) {
        Node removido = remove(anterior); 
        System.out.println(">>> removido: "+removido);
      }
      anterior=anterior.next;
      no=no.next;
      // try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }while(!isEmpty());
  }
  
  @Override
  public String toString() {
    if(isEmpty()) return "[]";
    String str="";
    Node primeiro = this.ultimo.next;
    Node no = primeiro;
    do{
      str+=no+"\n";
      no=no.next;
    }while (no.id != primeiro.id);
    return str;
  }
}