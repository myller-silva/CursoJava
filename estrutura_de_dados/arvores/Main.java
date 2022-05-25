package arvores;

// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    int[] values = { 10, 5, 15, 13, 20, 30, 2, 3, 25, 35, 7, 18, 16 };

    tree.insert(values);

    System.out.println(tree.children(values));

    tree.inOrder();
    
  }
}
