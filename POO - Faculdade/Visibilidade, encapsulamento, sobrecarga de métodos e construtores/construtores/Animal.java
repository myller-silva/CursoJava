package construtores;

import java.util.Date;

public class Animal {
	
	private String especie;
	private char sexo; //'m' para macho e 'f' para fêmea
	private String nome;
	private Date dataDeNascimento;
	
	public Animal() { // construtor 1
		
	}
	
	public Animal(String especie, char sexo) { // construtor 2
		this.especie = especie;
		this.sexo = sexo;
	}
	
	public Animal(String especie, char sexo, String nome,
			Date dataDeNascimento) { // construtor 3
		this(especie,sexo);
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
