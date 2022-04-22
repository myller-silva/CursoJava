package excecoes;

public class ExemploBlocoTryCatch {
	
	public static void main(String[] args) {

		try {
			// C�digo que pode lan�ar exce��es
		} catch (ExcecaoA e) {
			// Tratamento de exce��es do tipo ExcecaoA
			// ou qualquer subclasse desta
			// e = inst�ncia da classe de exce��o
		} catch (ExcecaoB e) {
			// Tratamento de exce��es do tipo ExcecaoB
		} finally {
			// C�digo executado ao final do bloco 
		}
		
/*		try {
			// C�digo que pode lan�ar exce��es
		} catch (ExcecaoA e) {
			// Tratamento de exce��es do tipo ExcecaoA
			// ou qualquer subclasse desta
			// e = inst�ncia da classe de exce��o
		} catch (ExcecaoB e) {
			// Tratamento de exce��es do tipo ExcecaoB
		} catch (Exception e) {
			// Tratamento de qualquer excecao
		}
		*/
	}

}
