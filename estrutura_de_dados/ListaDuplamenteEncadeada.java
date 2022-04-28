interface Lista {
  public boolean add(String value);
  public boolean remove(Node node);
  public boolean isEmpty();
}


class Node{
  String value;
  Node anterior;
  Node proximo;
  Node(){
    anterior = proximo = null;
    value = null;
  }
  Node(String value){
    this();
    this.value=value;
  }
}

public class ListaDuplamenteEncadeada implements Lista{
  Node inicio;
  Node fim;
  ListaDuplamenteEncadeada(){
    this.inicio=null;
    this.fim=null;
  }
  @Override
  public boolean add(String value) {
    if (value==null) return false;
    Node no = new Node(value);
    if (isEmpty()) {
      this.inicio = no;
      no.anterior=null;
      no.proximo=null;
    }

    return true;
  }

  @Override
  public boolean remove(Node node) {
    return false;
  }
  @Override
  public boolean isEmpty() {
    return (this.inicio==null && this.fim==null);
  }
}


