package excecoes;

public class TesteException {
	
	public static void main(String[] args) {
		try {
			// lan�amento de exce��o:
			throw new Exception("Exce��o teste");
		} catch(Exception e) {
			// c�digo de tratamento da exce��o:
			System.out.println("Capturada: "+e);
			e.printStackTrace();
		}
	}
}
