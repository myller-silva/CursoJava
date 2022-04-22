package outros.fila_dinamica;

public class FilaDinamica {
  Node primeiro; //front
  Node ultimo; //rear

  FilaDinamica(){
    this.primeiro=null;
    this.ultimo=null;
  }

  public boolean isEmpty() {
    return (this.primeiro==null);
  }

  public boolean isFull() {
    try{
      new Node();
      return false;
    }catch(Exception e){
      System.out.println(e);
      return true;
    }
  }

  public boolean push(TipoItem item) {
    if(isFull()){
      return false;
    }
    Node newNode = new Node();
    newNode.valor=item;
    newNode.proximo=null;
    if(this.primeiro==null){
      this.primeiro=newNode;
    }else{
      this.ultimo.proximo = newNode;
    }
    this.ultimo=newNode;

    return true;
  }

  public boolean pop() {
    
    return false;
  }




  @Override
  public String toString() {
    Node temp = primeiro;
    String str = "Fila dinamica: [ ";

    while(true){
      if(temp==null){
        break;
      }else{
        str += temp.valor;
        str += (temp.proximo==null)?" ]":", ";
      }
      temp = temp.proximo;
    }
    return str;
  }
  
}
