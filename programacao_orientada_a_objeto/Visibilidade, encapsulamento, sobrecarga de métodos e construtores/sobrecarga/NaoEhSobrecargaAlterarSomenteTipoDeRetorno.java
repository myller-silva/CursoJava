package sobrecarga;

public class NaoEhSobrecargaAlterarSomenteTipoDeRetorno {
	
	// A altera��o do tipo de retorno do m�todo
	// n�o constitui sobrecarga sozinha
	
	public int soma(int a, int b) { // erro: assinaturas iguais
		return a+b;
	}
	
	public void soma(int a, int b) { // erro: assinaturas iguais
		System.out.println(a+b);
	}
}
