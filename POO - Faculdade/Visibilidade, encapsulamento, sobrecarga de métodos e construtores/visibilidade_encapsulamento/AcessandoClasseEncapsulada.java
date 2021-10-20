package visibilidade_encapsulamento;

public class AcessandoClasseEncapsulada {
	
	public static void main(String[] args) {
		ClasseEncapsulada ce = new ClasseEncapsulada();
		// Lendo valor do atributo "a"
		int a = ce.getA();
		// Modificando valor do atributo "b"
		ce.setB(5);
		// Ações não permitidas pelo encapsulamento:
		ce.a = 10; // erro, variável é privada
		ce.setA(10); // erro, método não existe
		ce.b = 20; // erro, variável é privada
		int b = ce.getB(); // erro, método não existe
	}
}
