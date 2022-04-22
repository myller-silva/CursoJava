package outros.filas;

public class Fila {
  private int primeiro, ultimo;
  private int max_itens;
  TipoItem[] estrutura;

  Fila(int max_itens){
    this.max_itens=max_itens;
    this.primeiro=0;
    this.ultimo=0;
    estrutura = new TipoItem[max_itens];
  }

  public boolean isEmpty() {
    return ( primeiro == ultimo );
  }
  
  public boolean isFull() {
    return ( ultimo-primeiro == max_itens );
  }

  public void push(TipoItem item) { //enqueue
    if(isFull()){
      System.out.println("Elemento " + item +" nao foi add" );
      System.out.println("Fila cheia");
    }else{
      estrutura[ ultimo % max_itens ] = item;
      ultimo++;
    }
  }

  public void pop(){ //dequeue
    if(isEmpty()){
      System.out.println("Fila vazia");
      System.out.println("Nenhum elemento removido");
    } else{
      System.out.println( "removido: " + estrutura[primeiro++] );
      // return estrutura[primeiro++ % max_itens];
    }
  }

  @Override
  public String toString() {
    String str="Fila: [";
    for (int i = primeiro; i < ultimo; i++) {
      str += estrutura[i%max_itens];
      str += (i==ultimo-1) ? "" : ", ";
    }
    str+="]";
    return str;
  }
  
}
