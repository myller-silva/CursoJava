package sobrecarga;

public class SobrecargaPorTipoDeArgumentos {
	
	// M�todos com o mesmo identificador, mas par�metros
	// com tipos distintos
	
	public void imprime(String nome) {
		System.out.println("Nome: " +nome);
	}
	
	public void imprime(int num) {
		System.out.println("N�mero: "+num);
	}

}
