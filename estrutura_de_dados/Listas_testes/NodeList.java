package Listas_testes;

public class NodeList {
  public String value;
  public NodeList proximo;
  public NodeList anterior;
  public NodeList(String value){
    this.value=value;
  }
  public NodeList(){}

  @Override
  public String toString() {
    return this.value;
  }
}
