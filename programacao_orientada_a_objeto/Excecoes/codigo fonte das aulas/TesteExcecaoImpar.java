package excecoes;

public class TesteExcecaoImpar {
	public static void main(String[] args) {
		try {
			imprimeNumeroPar(2); // ok
			imprimeNumeroPar(3); // lan�a ExcecaoImpar
		} catch (ExcecaoImpar e) {
			System.out.println(e);
		}
	}
	public static void imprimeNumeroPar(int numero) 
			throws ExcecaoImpar {
		if (numero%2==0)
			System.out.println("N�mero par: "+numero);
		else
			throw new ExcecaoImpar(numero);
	}
}
