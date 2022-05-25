package arvores;

// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    tree.insert(10, 5, 15, 13, 20, 30, 2, 3, 25, 35);

    tree.inOrder();
    // list.preOrder();
    // list.posOrder();

    System.out.println();
    // System.out.println(tree.children(10, 5, 15, 13, 20, 30, 2, 3, 25, 35));
    System.out.println("removido: "+tree.remove(2));
    tree.inOrder();
    // System.out.println("removido: "+tree.remove(10));
    // tree.inOrder();
    System.out.println("removido: "+tree.remove(5));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(3));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(25));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(35));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(30));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(20));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(15));
    tree.inOrder();
    System.out.println("removido: "+tree.remove(13));
    tree.inOrder();
    
  }
}
