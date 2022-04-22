package excecoes;

public class TesteLampada {
	
	public static void main(String[] args) {

		try {
			Lampada l1 = new Lampada('l');
			System.out.println("L�mpada l1: "+l1.getTipo());
			
			Lampada l2 = new Lampada('x');
			System.out.println("L�mpada l2: "+l2.getTipo());
		} catch (TipoLampadaException e) {
			System.out.println("Use apenas 'i', 'f' ou 'l'.");
		}

	}

}
