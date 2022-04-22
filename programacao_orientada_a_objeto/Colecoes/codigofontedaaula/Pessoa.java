package codigofontedaaula;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Pessoa implements Comparable<Pessoa>{
	private String nome, cpf;
	private Date nascimento;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Pessoa(String nome, String cpf, Date nascimento) {
		this.nome = nome; this.cpf = cpf;
		this.nascimento = nascimento;
	}
	public boolean equals(Object o) {
		if (o instanceof Pessoa) {
			Pessoa p = (Pessoa)o; return this.cpf.equals(p.cpf);
		} return false;
	}
	public int hashCode() {
		return this.cpf.hashCode();
	}
	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public int compareTo(Pessoa p) {
		if (nascimento.before(p.nascimento))
			return -1;
		else if (nascimento.after(p.nascimento))
			return 1;
		else return 0;
	}
	// restante do c�digo

	public String toString() {
		return nome+", "+sdf.format(nascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

/*public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private Date nascimento;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public boolean equals(Object o) {
		if (o instanceof Pessoa) {
			Pessoa p = (Pessoa)o;
			return this.nome.equals(p.nome);
		} return false;
	}
	public int hashCode() {
		return this.nome.hashCode();
	}
	public int compareTo(Pessoa p) {
		if (nascimento.before(p.nascimento))
			return -1;
		else if (nascimento.after(p.nascimento))
			return 1;
		else return 0;
	}
	// restante do c�digo

	public String toString() {
		return nome+", "+sdf.format(nascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
}*/

/*public class Pessoa {
	private String nome;
	private Date nascimento;
	private SimpleDateFormat sdf =
			new SimpleDateFormat("dd/MM/yyyy");
	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public String toString() {
		return nome+", "+sdf.format(nascimento);
	}
	// getters and setters
}*/

/*public class Pessoa {
	private String nome;
	private Date nascimento;
	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public String toString() {
		return nome+", "+nascimento;
	}
	// getters and setters
}*/


/*public class Pessoa {
	
	private String nome;
	private Date nascimento;
	
	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
}
*/