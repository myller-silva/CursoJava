package atvs.lista_de_exercicios.ex12_6_concatenacao_de_listas;

import atvs.lista_encadeada.Lista;
import atvs.lista_encadeada.Node;
import utils_my.Console;

public class Main {
  public static void main(String[] args) {
    Console.limparTela();

    Lista l1 = new Lista();
    l1.add( new Node(1) ); l1.add( new Node(2) );
    l1.add( new Node(3) ); l1.add( new Node(4) );

    Lista l2 = new Lista();
    l2.add( new Node(5) ); l2.add( new Node(6) ); 
    l2.add( new Node(7) ); l2.add( new Node(8) );    

    l1.print();
    l2.print();
    
    if(!concatena(l1, l2)){
      System.out.println("nao foi possivel concatenar");
    }
    // l1.concatenar(l2);
    
    System.out.println("\nconcatenado: ");
    l1.print(true);
    l1.print(false);
    System.out.println(l1.primeiro+" "+l1.ultimo);
    System.out.println(l2.primeiro+" "+l2.ultimo);

  }

  public static boolean concatena(Lista l1, Lista l2) {
    if(l1.isEmpty() || l2.isEmpty()){
      return false;
    }
    
    l1.primeiro = l1.primeiro;
    l1.ultimo = l1.ultimo;
    l2.primeiro.anterior = l1.ultimo;
    l1.ultimo.proximo = l2.primeiro;
    l1.ultimo = l2.ultimo;
    l1.length += l2.length;
    
    return true;
  }
}
