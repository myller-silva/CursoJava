package Javadoc;

/**
 * 
 * @author Mac Myller,
 * Estudante de Ci�ncia da Computa��o no IFCE campus Maracana�
 *
 */

public class Pessoa {
	/**
	 * nome da pessoa
	 */
	private String nome;
	/**
	 * 
	 * @param nome
	 */
	public Pessoa( String nome){
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return nome
	 */
	public String getNome(){
		return this.nome;
	}
}
