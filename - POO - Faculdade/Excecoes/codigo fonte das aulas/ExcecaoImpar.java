package excecoes;

public class ExcecaoImpar extends Exception {
	private int valor;
	public ExcecaoImpar() {}
	public ExcecaoImpar(String msg) {
		super(msg);
	}
	public ExcecaoImpar(int valor) {
		this.valor = valor;
	}
	public String toString() {
		return "O número "+valor+" é ímpar!";
	}
}
