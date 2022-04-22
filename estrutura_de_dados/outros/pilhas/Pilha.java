package outros.pilhas;

public class Pilha {
  private static int max_itens=100;
  int tamanho;
  TipoItem[] estrutura;

  Pilha(){
    tamanho = 0;
    estrutura = new TipoItem[max_itens];
  }
  
  public boolean isFull() { //isFull
    return (tamanho==max_itens);
  }
  public boolean isEmpty() { //isEmpty
    return (tamanho==0);
  }

  public void push(TipoItem item) { //push  
    if(isFull()){
      System.out.println("tamanho maximo já foi atingido");
    }else{
      estrutura[tamanho++] = item;
    }
  }
  
  public TipoItem pop() { //pop
    if(isEmpty()){
      System.out.println("a pilha está vazia");
      return new TipoItem("");
    }else{
      return estrutura[--tamanho];
    }
  }
  public void imprimir() { //print
    System.out.print("Pilha: [ ");
    for (int i = 0; i < tamanho; i++) {
      System.out.print(estrutura[i]);
      System.out.print(" ");
    }
    System.out.println("]");
  }

  public int qualTamanho() { //lenght
    return tamanho;
  }

}
