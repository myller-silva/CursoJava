package excecoes;

public class TestePaiEFilho {
	
	public static void main(String[] args) {
		try {
			Pai p = new Filho();
			// metodo2 é declarado como lançando uma exceção
			// do tipo ClassNotFoundException, mas na verdade
			// lança uma Exception!
			p.metodo2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
