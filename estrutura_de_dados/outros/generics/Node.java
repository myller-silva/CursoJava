package outros.generics;

/**
 * Node
 */
public class Node<Type> {
  public Type value;
  public Node<Type> next;

  Node(Type value){
    this.value=value;
  }
  @Override
  public String toString() {
    return value.toString();
  }

}
