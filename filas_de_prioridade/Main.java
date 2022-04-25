public class Main{
	public static void main(String args[]){
		System.out.println("hello world");	
	}	
}

class ListaCircular{ //duas filas de prioridade
	
}

class ListaMemoriaLivre{ //organizar do menor espaço para o maior
	NodeMemoria inicio;
	int length;
}

class Node{
	int id; 
	int tempo; // [1, 10]
	int tamanho; //[20, 200]	
	boolean maisMemoria;
	Node next;
}

class NodeMemoria{
	int inicio; //0
	int fim; //10k
}
