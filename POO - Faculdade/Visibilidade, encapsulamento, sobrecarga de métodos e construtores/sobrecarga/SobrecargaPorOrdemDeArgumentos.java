package sobrecarga;

public class SobrecargaPorOrdemDeArgumentos {
	
	public void imprime(String nome, int num) {
		System.out.println("Número: "+num);
		System.out.println("Nome: " +nome);
	}
	
	public void imprime(int num, String nome) {
		System.out.println("Número: "+num);
		System.out.println("Nome: " +nome);
	}

}
