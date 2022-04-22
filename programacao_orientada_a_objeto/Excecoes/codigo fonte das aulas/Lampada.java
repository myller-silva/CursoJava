package excecoes;

public class Lampada {
	
	// 'i' -> incandescente
	// 'f' -> fluorescente
	// 'l' -> led
	private char tipo;
	public Lampada(char tipo) throws TipoLampadaException {
		if (tipo=='i' || tipo=='f' || tipo=='l')
			this.tipo = tipo;
		else
			throw new TipoLampadaException(
					"Tipo inv�lido. Use 'i', 'f' ou 'l'.");
	}
	public char getTipo() { return tipo; }
}

/*public class Lampada {
	
	// 'i' -> incandescente
	// 'f' -> fluorescente
	// 'l' -> led
	private char tipo;
	public Lampada(char tipo) throws Exception {
		if (tipo=='i' || tipo=='f' || tipo=='l')
			this.tipo = tipo;
		else
			throw new Exception(
					"Tipo inv�lido. Use 'i', 'f' ou 'l'.");
	}
	public char getTipo() { return tipo; }
}*/

/*public class Lampada {
	
	// 'i' -> incandescente
	// 'f' -> fluorescente
	// 'l' -> led
	private char tipo;
	public Lampada(char tipo) throws IllegalArgumentException {
		if (tipo=='i' || tipo=='f' || tipo=='l')
			this.tipo = tipo;
		else
			throw new IllegalArgumentException(
					"Tipo inv�lido. Use 'i', 'f' ou 'l'.");
	}
	public char getTipo() { return tipo; }
}*/
