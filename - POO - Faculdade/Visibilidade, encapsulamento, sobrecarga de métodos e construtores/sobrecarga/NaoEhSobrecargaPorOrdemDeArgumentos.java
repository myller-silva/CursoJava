package sobrecarga;

public class NaoEhSobrecargaPorOrdemDeArgumentos {
	
	// O tipo da variável precisa ser alterado
	// Apenas a alteração do nome da variável, 
	// sem a alteração do tipo, não é sobrecarga!
	
	public int soma(int a, int b) { // erro: assinaturas iguais
		return a+b;
	}
	
	public int soma(int b, int a) { // erro: assinaturas iguais
		return a+b;
	}
}
