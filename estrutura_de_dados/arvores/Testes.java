package arvores;

import java.util.Scanner;

public class Testes {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    int[] values = {10,9, 30, 20, 15, 21, 13 };

    for (int value : values) {
      tree.insert(value);
    }

    System.out.println(tree);
    System.out.println();
    Scanner scan = new Scanner(System.in);
    int n = 0 ;
    do{
      System.out.print("value: ");
      n = scan.nextInt();
      scan.nextLine();
      TreeNode father = tree.getFather(n);
      TreeNode son = tree.getSon(father, n);
      System.out.println("father of "+n+" : "+ father.value);
      System.out.println("Son of "+father.value+" : "+son.value);
      System.out.println();
      
    }while(true);
  }
}
