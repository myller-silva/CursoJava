package excecoes;

public class Filho extends Pai {
	
	public void metodo1() {} // ok
	public void metodo2() throws Exception{} // erro
	
}

class Pai {
	
	public void metodo1() throws Exception{}
	public void metodo2() throws ClassNotFoundException{}
	
}

/*public class Filho extends Pai {
	
	public Filho() {}
	// chamada impl�cita super()
	// super() prev� lan�amento de exception
}

class Pai {
	
	public Pai() throws Exception {}
	
}*/


