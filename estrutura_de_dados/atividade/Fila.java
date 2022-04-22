package atividade;

public class Fila {
  Node primeiro; //front
  Node ultimo; //rear
  int length;

  Fila(){
    this.primeiro=null;
    this.ultimo=null;
    this.length=0;
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

  public boolean push(String item) {
    if(isFull()){
      return false;
    }
    Node newNode = new Node();
    newNode.value=item;
    newNode.next=null;
    if(this.primeiro==null){
      this.primeiro=newNode;
    }else{
      this.ultimo.next = newNode;
    }
    this.ultimo=newNode;
    length++;
    return true;
  }

  public boolean pop() {
    this.primeiro=this.primeiro.next;
    length--;
    return false;
  }

  @Override
  public String toString() {
    Node temp = primeiro;
    String str = "[ ";
    
    while(temp!=null){
      str += temp.value+" ";
      temp = temp.next;
    }

    str+="]";
    return str;
  }
  
}
