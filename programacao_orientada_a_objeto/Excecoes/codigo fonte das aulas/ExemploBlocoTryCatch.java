package excecoes;

public class ExemploBlocoTryCatch {
	
	public static void main(String[] args) {

		try {
			// Código que pode lançar exceções
		} catch (ExcecaoA e) {
			// Tratamento de exceções do tipo ExcecaoA
			// ou qualquer subclasse desta
			// e = instância da classe de exceção
		} catch (ExcecaoB e) {
			// Tratamento de exceções do tipo ExcecaoB
		} finally {
			// Código executado ao final do bloco 
		}
		
/*		try {
			// Código que pode lançar exceções
		} catch (ExcecaoA e) {
			// Tratamento de exceções do tipo ExcecaoA
			// ou qualquer subclasse desta
			// e = instância da classe de exceção
		} catch (ExcecaoB e) {
			// Tratamento de exceções do tipo ExcecaoB
		} catch (Exception e) {
			// Tratamento de qualquer excecao
		}
		*/
	}

}
