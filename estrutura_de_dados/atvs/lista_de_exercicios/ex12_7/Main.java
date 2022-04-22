package atvs.lista_de_exercicios.ex12_7;

import atvs.lista_encadeada.Lista;
import atvs.lista_encadeada.Node;
import utils_my.Console;

public class Main {
  public static void main(String[] args) {
    Console.limparTela();
    Lista l1 = new Lista();
    Lista l2 = new Lista();
    
    l1.add(new Node(2)); l1.add(new Node(1));
    l1.add(new Node(3)); l1.add(new Node(0));

    l2.add(new Node(4)); l2.add(new Node(2));
    l2.add(new Node(1)); l2.add(new Node(5));

    l1.sort();
    l2.sort();

    mesclar(l1, l2);


    System.out.println(l1);
    System.out.println(l2);
  }


  public static boolean mesclar(Lista l1, Lista l2) {
    if( l1.isEmpty() || l2.isEmpty() ){
      return false;
    }
    l1.concatenar(l2);
    l1.sort();
    return true;
  }
}
