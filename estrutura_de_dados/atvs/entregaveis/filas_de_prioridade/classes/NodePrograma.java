package filas_de_prioridade.classes;

public class NodePrograma{
	int id; 
	int tempo; // [1, 10]
	int tamanho; //[20, 200]	
	boolean maisMemoria;
	NodePrograma next;
	
	NodePrograma(){}

	public NodePrograma(int id, int tempo, int tamanho, boolean maisMemoria){
		this.id = id;
		this.tempo = tempo;
		this.tamanho = tamanho;
		this.maisMemoria = maisMemoria;
	}
  public NodePrograma(int id, int tempo, int tamanho){
    this(id, tempo, tamanho, false);
	}
  @Override
  public String toString() {
    return String.format("%d, %d, %d, %b",id, tempo, tamanho, maisMemoria);
  }
}
