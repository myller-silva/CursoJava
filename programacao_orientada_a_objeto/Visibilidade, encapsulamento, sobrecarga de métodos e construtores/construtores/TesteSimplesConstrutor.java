package construtores;

public class TesteSimplesConstrutor {

	public static void main(String[] args) {
		
		// Sem o uso do construtor com parâmetros
		Pessoa p = new Pessoa(); // Erro: construtor padrão
		p.nome = "João";         // não existe mais
		p.cpf = "000.000.000-00";
		
		// Com o uso do construtor com parâmetros
		Pessoa p2 = new Pessoa("João", "000.000.000-00");
		// ...
		System.out.println(p.nome); // Imprime: João
		System.out.println(p.cpf); // Imprime: 000.000.000-00
		
	}
}

/*public class TesteSimplesConstrutor {

	public static void main(String[] args) {
		
		// Sem o uso do construtor com parâmetros
		//Pessoa p = new Pessoa(); 
		//p.nome = "João";         
		//p.cpf = "000.000.000-00";
		
		// Com o uso do construtor com parâmetros
		Pessoa p = new Pessoa("João", "000.000.000-00");
		System.out.println(p.nome); // Imprime: João
		System.out.println(p.cpf); // Imprime: 000.000.000-00
		
	}
}*/

/*public class TesteSimplesConstrutor {

	public static void main(String[] args) {
		
		// Imprime: "Construindo uma pessoa..."
		Pessoa p = new Pessoa();  

	}

}*/
