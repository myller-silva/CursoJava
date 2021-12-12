package sobrecarga;

public class NaoEhSobrecargaAlterarSomenteTipoDeRetorno {
	
	// A alteração do tipo de retorno do método
	// não constitui sobrecarga sozinha
	
	public int soma(int a, int b) { // erro: assinaturas iguais
		return a+b;
	}
	
	public void soma(int a, int b) { // erro: assinaturas iguais
		System.out.println(a+b);
	}
}
