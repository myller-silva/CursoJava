package excecoes;

public class TesteException {
	
	public static void main(String[] args) {
		try {
			// lançamento de exceção:
			throw new Exception("Exceção teste");
		} catch(Exception e) {
			// código de tratamento da exceção:
			System.out.println("Capturada: "+e);
			e.printStackTrace();
		}
	}
}
