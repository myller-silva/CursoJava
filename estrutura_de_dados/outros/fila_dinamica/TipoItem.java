package outros.fila_dinamica;

public class TipoItem {
  private String value;

  TipoItem(String value){
    this.value=value;
  }

  @Override
  public String toString() {
    return value;
  }  
}
