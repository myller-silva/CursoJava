package arvores;

import java.util.Scanner;


// cls && javac arvores/Main.java && java arvores/Main
public class Main {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    int[] values = { 10, 5, 15, 13, 20, 30, 1, 3, 25, 35, 7, 18, 16, 2, 4, 0 };

    for (int v : values) {
      tree.insert(v);
    }
    
    System.out.println("inOrder: "+tree.inOrder()+"\n");
    // printNodes(tree);
    System.out.println(tree);
    
  }
  
  public static void printNodes(TreeList tree) {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    String str="";
    do{
      System.out.print("Digite um numero: ");
      n = scan.nextInt();
      scan.nextLine();
      System.out.println(tree.getNode(n));
      tree.inOrder();
      do {
        System.out.print("Continuar? [S/N] ");
        str = scan.nextLine();
      } while (
        !str.equals("S") && !str.equals("s") &&
        !str.equals("N") && !str.equals("n") 
      );
    }while(
      !str.equals("N") &&
      !str.equals("n") 
    );
    scan.close();
  }
}
