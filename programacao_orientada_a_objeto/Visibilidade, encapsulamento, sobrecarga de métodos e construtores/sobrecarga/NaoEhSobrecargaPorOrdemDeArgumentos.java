package sobrecarga;

public class NaoEhSobrecargaPorOrdemDeArgumentos {
	
	// O tipo da vari�vel precisa ser alterado
	// Apenas a altera��o do nome da vari�vel, 
	// sem a altera��o do tipo, n�o � sobrecarga!
	
	public int soma(int a, int b) { // erro: assinaturas iguais
		return a+b;
	}
	
	public int soma(int b, int a) { // erro: assinaturas iguais
		return a+b;
	}
}
