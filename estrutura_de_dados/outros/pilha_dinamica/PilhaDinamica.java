package outros.pilha_dinamica;

public class PilhaDinamica {
  private Node topo; 
  
  
  public PilhaDinamica(){
    this.topo = null;
  }

  public boolean isEmpty(){
    return (this.topo==null);
  }

  // public boolean isFull(){
  //   try{}catch(Exception e){}
  // }

  public boolean push(TipoItem item) {
    try{
      Node newNode = new Node();
      newNode.valor = item;
      newNode.proximo = this.topo;

      this.topo = newNode;

      return true;
    } catch(Exception e ){
      return false;
    }
  }

  public boolean pop() {
    if(isEmpty()){
      return false;
    }
    // Node temp;
    // temp = this.topo;
    this.topo = topo.proximo;
    return true;
  }

  @Override
  public String toString() {
    String str="Pilha: [ ";
    Node temp = topo;

    while(temp!=null){
      str += temp.valor;
      temp = temp.proximo;
    }

    str+="]";
    return str;
  }
}
