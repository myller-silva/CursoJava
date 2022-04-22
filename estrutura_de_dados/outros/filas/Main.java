package outros.filas;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Fila fila = new Fila(5);
    int op=0;

    do{
      menu();
      op = operacoes(fila);
      if(op==0)break;
    }while(true);
  }


  public static void menu() {
    System.out.println(">>>Programa gerador de Fila");
    System.out.println("[0] parar");
    System.out.println("[1] inserir");
    System.out.println("[2] remover");
    System.out.println("[3] listar");
    
  }

  public static int operacoes(Fila fila) {
    Scanner scan = new Scanner(System.in);
    int opcao;
    TipoItem item;

    opcao = scan.nextInt();
    scan.nextLine();

    switch (opcao) {
      case 0:
        break;
      case 1:
        System.out.print("Digite o valor: ");
        item = new TipoItem(scan.nextLine());
        fila.push(item);
        break;
      case 2:
        fila.pop();
        break;
      case 3:
        System.out.println(fila);
        break;
      default:
        System.out.println(">>>Nao implementado");
        break;
    }
    
    scan.close();

    return opcao;
  }

}
