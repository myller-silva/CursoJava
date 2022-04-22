package visibilidade_encapsulamento;

public class AcessandoClasseEncapsulada {
	
	public static void main(String[] args) {
		ClasseEncapsulada ce = new ClasseEncapsulada();
		// Lendo valor do atributo "a"
		int a = ce.getA();
		// Modificando valor do atributo "b"
		ce.setB(5);
		// A��es n�o permitidas pelo encapsulamento:
		ce.a = 10; // erro, vari�vel � privada
		ce.setA(10); // erro, m�todo n�o existe
		ce.b = 20; // erro, vari�vel � privada
		int b = ce.getB(); // erro, m�todo n�o existe
	}
}
