package construtores;

public class Pessoa {
	
	private static int totalDePessoas = 0;
	
	Pessoa() {
		Pessoa.totalDePessoas = Pessoa.totalDePessoas + 1; 
	}
	
	public static int getTotalDePessoas() {
		return Pessoa.totalDePessoas;
	}
}

/*public class Pessoa {
	
	private static int totalDePessoas = 0;
	
	Pessoa() {
		this.totalDePessoas = this.totalDePessoas + 1; 
	}
	
	public int getTotalDePessoas() {
		return this.totalDePessoas;
	}
}*/

/*public class Pessoa {
	
	String nome; String cpf; int idade; 
	
	Pessoa(String nome, String cpf) {
		this.nome = nome; // não há repetição de código
		this.cpf = cpf; // não há repetição de código
	}
	Pessoa(String nome, String cpf, int idade) {
		this(nome, cpf); // sempre 1a. instrução do construtor
		this.idade = idade;
	}
}*/

/*public class Pessoa {
	
	String nome; String cpf; int idade; 
	
	Pessoa(String nome, String cpf) {
		this.nome = nome;  // note que há repetição de código
		this.cpf = cpf;  // note que há repetição de código
	}
	Pessoa(String nome, String cpf, int idade) {
		this.nome = nome; // note que há repetição de código
		this.cpf = cpf;  // note que há repetição de código
		this.idade = idade;
	}
}*/

/*public class Pessoa {
	
	String nome;
	String cpf;
	
	Pessoa() { // construtor 1
		System.out.println("Construindo uma conta...");
	}
	
	Pessoa(String nome, String cpf) { // construtor 2
		this.nome = nome;
		this.cpf = cpf;
	}
}*/

/*public class Pessoa {
	
	// Atributos
	String nome;
	String cpf;
	
	// Construtor
	Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
}*/

/*public class Pessoa {
	
	// Atributos	
	String nome;
	String cpf;
	
	// Construtor
	Pessoa() {
		System.out.println("Construindo uma pessoa...");
	}
	
}*/