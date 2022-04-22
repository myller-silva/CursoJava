package outros.pilha_dinamica;

import java.util.Scanner;

import utils_my.Console;

class Main{
  public static void main(String[] args) {
    limpar();
    PilhaDinamica pilha = new PilhaDinamica();
    TipoItem item = new TipoItem("");
    int op;

    do{
      menu();
      op=opcoes(pilha, item);
    }while(op!=0);
    
  }




  public static void menu() {
    System.out.println(">>> Programa gerador de pilha");
    System.out.println("[0] parar");
    System.out.println("[1] inserir");
    System.out.println("[2] remover");
    System.out.println("[3] listar");
    System.out.print(">>> ");
  }
  
  public static int opcoes( PilhaDinamica pilha, TipoItem item ) {
    Scanner scan = new Scanner(System.in);
    int opcao;

    opcao = scan.nextInt();
    scan.nextLine();
    
    switch (opcao) {
      case 0:
        break;
      case 1:
        System.out.print("Digite o valor: ");
        item = new TipoItem(scan.nextLine());
        limpar();
        System.out.println(pilha.push(item) ? "inserido com sucesso":"erro ao inserir");
        break;
      case 2:
        limpar();
        System.out.println(pilha.pop()?"removido com sucesso":"erro ao remover");
        break;
      case 3:
        limpar();
        System.out.println(pilha);
        break;
      default:
        System.out.println(">>>Nao implementado");
        break;
    }
    scan.close();
    return opcao;
  }

  public static void limpar(){
    try{
      Console.clear();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}