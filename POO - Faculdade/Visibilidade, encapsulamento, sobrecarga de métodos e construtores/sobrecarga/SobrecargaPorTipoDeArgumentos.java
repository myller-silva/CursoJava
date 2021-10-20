package sobrecarga;

public class SobrecargaPorTipoDeArgumentos {
	
	// Métodos com o mesmo identificador, mas parâmetros
	// com tipos distintos
	
	public void imprime(String nome) {
		System.out.println("Nome: " +nome);
	}
	
	public void imprime(int num) {
		System.out.println("Número: "+num);
	}

}
