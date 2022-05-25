package arvores;


// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList list = new TreeList();
    
    list.insert( 10 );
    list.insert( 5 );
    list.insert( 3 );
    list.insert( 7 );
    list.insert( 15 );
    list.insert( 13 ); 

    list.inOrder();
    list.preOrder();
    list.posOrder();
    
  }
}
