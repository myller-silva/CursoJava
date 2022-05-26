package arvores;

// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    int[] values = { 10, 5, 15, 13, 20, 30, 1, 3, 25, 35, 7, 18, 16, 2, 4 };

    for (int v : values) {
      tree.insert(v);
    }
    
    // System.out.println("getNodes: ");
    // for (int v : values) {
    //   TreeNode aux = tree.getNode(v);
    //   if(aux!=null){
    //     System.out.println(aux);
    //   }
    // }

    System.out.println();
    tree.inOrder();
    System.out.println("removido: "+tree.remove(3));
    tree.inOrder();

    System.out.println("getNodes: ");
    for (int v : values) {
      TreeNode aux = tree.getNode(v);
      if(aux!=null){
        System.out.println(aux);
      }
    }
    
  }
}
