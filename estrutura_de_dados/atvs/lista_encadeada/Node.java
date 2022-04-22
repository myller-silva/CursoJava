package atvs.lista_encadeada;

public class Node {
  public int valor;
  public Node proximo;
  public Node anterior;
  public Node(int valor){
    this.valor=valor;
  }
  public Node(){}

  @Override
  public String toString() {
    return String.format("%d",this.valor);
  }
}
