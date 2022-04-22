package outros.pilhas;

import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Pilha pilha = new Pilha();
    TipoItem item = new TipoItem("");
    int op;

    do{
      menu();
      op=opcoes(pilha, item);
    }while(op!=0);
  }

  public static void menu() {
    System.out.println();
    System.out.println(">>>Programa gerador de pilha");
    System.out.println("[0] parar");
    System.out.println("[1] inserir");
    System.out.println("[2] remover");
    System.out.println("[3] listar");
  }
  
  public static int opcoes( Pilha pilha, TipoItem item ) {
    Scanner scan = new Scanner(System.in);
    int opcao;

    opcao = scan.nextInt();
    scan.nextLine();
    
    switch (opcao) {
      case 0:
        break;
      case 1:
        System.out.println("Digite o valor:");
        item = new TipoItem(scan.nextLine());
        pilha.push(item);
        break;
      case 2:
        item = pilha.pop();
        if(!pilha.isEmpty()){
          System.out.println("elemento removido: "+ item);
        }
        break;
      case 3:
        pilha.imprimir();
        break;
      default:
        System.out.println(">>>Nao implementado");
        break;
    }
    scan.close();
    return opcao;
  }
}