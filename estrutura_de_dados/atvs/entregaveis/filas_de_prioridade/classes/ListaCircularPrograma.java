package atvs.entregaveis.filas_de_prioridade.classes;

import atvs.entregaveis.filas_de_prioridade.Lista;

public class ListaCircularPrograma implements Lista<NodePrograma> {
	NodePrograma no1, no2;
	public int length;
	public ListaCircularPrograma(){
    this.no1=null;
    this.no2=null;
    this.length=0;
  }

	@Override
	public boolean isEmpty() {
		return (length==0);
	}

	public NodePrograma add(int tempo, int tamanho, boolean maisMemoria) {
		return add (new NodePrograma(this.length, tempo, tamanho, maisMemoria) );
	}



	@Override
	public NodePrograma add(NodePrograma no) {
		if(no==null) return null;
		NodePrograma newNode = new NodePrograma(this.length, no.tempo, no.tamanho, no.maisMemoria);
		if(isEmpty()){

		}

    length++;
    return newNode;
	}



	@Override
	public String toString() {
		String str="";
		NodePrograma no =this.no1;
		while(no!=null){
			str+=no+"\n";
			no=no.next;
		}
		return str;
	}

	@Override
	public NodePrograma add(NodePrograma no, int posicao) {
		return null;
	}
	@Override
	public NodePrograma pop() {
		return null;
	}
	@Override
	public NodePrograma pop(int posicao) {
		return null;
	}
	@Override
	public void sort(boolean crescente) {}

}





