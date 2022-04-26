package testes;

public class Main {
  public static void main(String[] args) {
    utils_my.Console.limparTela();

    ListaCircular listaProgramas = new ListaCircular();

    listaProgramas.add(4, 500, true);
    // programas.add(3, 550, false);
    // programas.add(5, 400, false);
    // programas.add(1, 600, true);
    // programas.add(2, 250, true);
    // programas.add(6, 398, false);
    // programas.add(8, 120, false);
    // programas.add(7, 600, true);
    // programas.add(9, 100, true);

    System.out.println(listaProgramas);
    System.out.println("\n"+listaProgramas.length()+"\n");
    // programas.print();
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
    this.tempo = tempo;
    this.tamanho = tamanho;
    this.maisMemoria = maisMemoria;
  }
  
  @Override
  public String toString() {
    return String.format("[id: %d, tempo: %d, tamanho: %d, mais: %b]", id, tempo, tamanho, maisMemoria);
  }
}



class ListaCircular {
  Node p;
  Node u;
  private int contadorProgramas=0;
  private int length=0;

  public ListaCircular() {
    this.p = this.u = null;
  }
  public boolean isEmpty() {
    return (this.p==null && this.u==null);
  }
  // public void executarProgramas() {}

  public int length() {
    return length;
  }

  public Node add(int tempo, int tamanho, boolean maisMemoria) {
    Node no = new Node(contadorProgramas++, tempo, tamanho, maisMemoria);
    
    if(isEmpty()){
      this.p = this.u = no;
      this.p.next = this.p;
      length++;
      return no;
    }
    no.next = this.p;
    this.u.next = no;
    this.u = no;
    length++;
    return no;
  }

  public void print() {  
    int ciclo=0;
    if(isEmpty()) return;
    Node no = this.p;
    do{
      if(no.id == this.p.id) System.out.println("\n"+ciclo++);

      System.out.println(no);  
      if (no.tempo==0){
        // pop(no)

        break;
      }
      no.tempo--;
      no=no.next;
      try { 
        Thread.sleep (1000); 
      } catch (InterruptedException ex) {}
    }while (true);
  }
  
  @Override
  public String toString() {
    if(isEmpty()) return "[]";
    String str="";
    Node no = this.p;
    do{
      str+=no+"\n";   
      no=no.next; 
    }while (no.id != this.p.id);

    return str;
  }
}