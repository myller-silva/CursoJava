package atvs.entregaveis.filas_de_prioridade;

public interface Lista<Type> {
  
  public Type add(Type no);
  public Type add(Type no, int posicao);
  public Type pop();
  public Type pop(int posicao);
  public void sort(boolean crescente);
  public boolean isEmpty();
  // @Override
  // String toString();
}