package arvores;


// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList list = new TreeList();
    
    list.insert( 3 );
    list.insert( 2 );
    list.insert( 1 );
    list.insert( 4 );
    list.insert( 5 );
    list.insert( 5 ); 
    
    System.out.println("\nroot: "+list.root);
    System.out.println("root.left: "+list.root.left);
    System.out.println("root.right: "+list.root.right);
    
    list.inOrder();
    list.preOrder();
    list.posOrder();
    
  }
}
