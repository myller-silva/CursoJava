package excecoes;

public class TestePaiEFilho {
	
	public static void main(String[] args) {
		try {
			Pai p = new Filho();
			// metodo2 � declarado como lan�ando uma exce��o
			// do tipo ClassNotFoundException, mas na verdade
			// lan�a uma Exception!
			p.metodo2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
