package arvores;


// cls; javac arvores/Main.java ; java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList list = new TreeList();
    

    list.insert( 10, 5, 15, 13, 20, 30, 2, 3, 25, 35 ); 
    
    // list.inOrder();
    // list.preOrder();
    // list.posOrder();

    System.out.println();
    System.out.println(list.children(10, 5, 2, 3, 13, 20, 30, 25, 35));
    System.out.println(list.children(122));
     
  }
}
