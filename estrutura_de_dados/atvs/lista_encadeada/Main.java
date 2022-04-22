package atvs.lista_encadeada;

import utils_my.Console;

public class Main {
  public static void main(String[] args) {
    Console.limparTela();
    
    Lista lista = new Lista();

    lista.add( new Node(0) );
    lista.add( new Node(3) );
    lista.add( new Node(4) );
    lista.add( new Node(2) );
    lista.add( new Node(7) );
    lista.add( new Node(5) );
    lista.add( new Node(6) );
    lista.add( new Node(1) ); 

    // lista.sort();

    Node element = lista.buscar(2);

    System.out.println("ant\telement\tprox");
    System.out.printf("%s\t%s\t%s\n", element.anterior, element, element.proximo);
  }
}