package outros.fila_dinamica;

import utils_my.Console;

public class Main {
  public static void main(String[] args) {
    Console.limparTela();

    FilaDinamica fila = new FilaDinamica();
    
    fila.push( new TipoItem("item 1"));
    fila.push( new TipoItem("Myller"));
    fila.push( new TipoItem("Matheus"));
    fila.push( new TipoItem("Maria")); 

    System.out.println(fila);
    
  }
}
