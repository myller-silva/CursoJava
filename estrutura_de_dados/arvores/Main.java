package arvores;

import java.util.Scanner;

// cls && javac arvores/Main.java && java arvores/Main
public class Main {
  
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    TreeList tree = new TreeList();
    int [] values = {12, 32, 1, 2, 31, 41, 8, 121};
    int n = 0;

    for (int value : values) {
      tree.insert(value);
    }

    System.out.println(">>> Arvore Binaria <<<");
    do{
      n = menu();
      switch (n) {
        case 1:
          tree.insert( readIntegerValue() );
          break;
        case 2:
          if( tree.remove( readIntegerValue() ) == null){
            System.out.println("Valor nao encontrado na arvore");
          }
          break;
        case 3:
          System.out.println(listaElementos(tree));
          break;
        case 4:
          System.out.println(tree);
          break;
        default:
          break;
      }
    }while(n!=0);
  }

  public static String listaElementos(TreeList tree) {
    String str = "";
    str += "preOrder: "+tree.preOrder()+"\n";
    str += "inOrder: "+tree.inOrder()+"\n";
    str += "posOrder: "+tree.posOrder()+"\n";
    return str;
  }

  public static int menu() {
    String str = "";
    System.out.println("[0] Encerrar");
    System.out.println("[1] Inserir");
    System.out.println("[2] Remover");
    System.out.println("[3] Listar elementos");
    System.out.println("[4] Listar elementos e suas raizes");
    System.out.print(">>> ");
    str = scan.nextLine();
    System.out.println();
    try {
      return Integer.parseInt(str);
    } catch (Exception e) {
      return -1;
    }
  }

  public static int readIntegerValue() {
    String str="";
    do{
      System.out.print("Digite um numero: ");
      str = scan.nextLine();
      System.out.println();
      try{  
        return Integer.parseInt(str);
      }catch(Exception e){
        System.out.println("Entrada invalida");
      }
    }while(true);
  }
}
