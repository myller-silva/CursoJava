package visibilidade_encapsulamento;

public class TesteAcessoNaClasse {
	
	int x;
	int y;
	int result;
	
	public void soma() {
		// Acessando atributos de inst�ncia dentro da pr�pria classe
		result = x + y;
	}
	
	public void somaMaisUm() {
		// Acessando um m�todo dentro da pr�pria classe
		soma();
	}

}
