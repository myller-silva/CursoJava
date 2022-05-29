package arvores;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    TreeList tree = new TreeList();

    int[] values = {10, 30, 20, 15, 21, 13 };

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
      System.out.println("father de "+n+" : "+tree.getFather(n));
    }while(true);
  }
}
