package outros.generics;

public interface Lista<Type> {
  
  public Type add(Type no);
  public Type add(Type no, int posicao);
  public Type pop();
  public Type pop(int posicao);
  public void sort(boolean crescente);
  // @Override
  // String toString();
}

class ListaCircular<Type> implements Lista<Type> {
	Node<Type> primeiro;
	Node<Type> ultimo;
	int length=0;

	ListaCircular(){
		this.primeiro=null;
		this.ultimo=null;
	}
	public boolean isEmpty(){
		return ( this.primeiro==null );
	}

	@Override
	public Type add( Type no ) {
		Node<Type> novoNo = new Node<Type>(no);

		if(this.primeiro==null) {
			this.primeiro = novoNo ;
			this.ultimo = novoNo ;
			this.primeiro.next = null ;
			this.ultimo.next = null ;
			++length;
			return novoNo.value;
		}
		

		++length;
		return null;
	}
	@Override
	public Type add(Type no, int posicao) {
		return null;
	}
	@Override
	public Type pop() {
	return null;
	}
	@Override
	public Type pop(int posicao) {
	return null;
	}
	@Override
	public void sort(boolean crescente) {	
	}

	@Override
	public String toString() {
		String str="";
		Node<Type> no = this.primeiro;
		while (no!=null) {
			str+= no.value+" ";
			no=no.next;
		}
		return str;
	}
	
	
}
