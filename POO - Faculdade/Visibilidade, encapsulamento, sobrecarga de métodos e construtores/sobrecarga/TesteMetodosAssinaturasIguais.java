package sobrecarga;

public class TesteMetodosAssinaturasIguais {
	
	public void imprime(int num, String nome) {
		System.out.println("Número: "+num);
		System.out.println("Nome: " +nome);
	}
	
	public void imprime(int num, String nome) {
		System.out.println("Número: "+num);
		System.out.println("Nome: " +nome);
	}

}
