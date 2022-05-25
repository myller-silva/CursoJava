package arvores;

// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    tree.insert(10, 5, 15, 13, 20, 30, 2, 3, 25, 35, 7, 18, 16);
    System.out.println(tree.children(10, 5, 15, 13, 20, 30, 2, 3, 25, 35, 7, 18, 16));
    
    tree.inOrder();
    // list.preOrder();
    // list.posOrder();

    System.out.println();
    System.out.println("removido: "+tree.remove(2));
    tree.inOrder();
  }
}
