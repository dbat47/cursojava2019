package model;

import com.j256.ormlite.field.DatabaseField;

public class Permissao {
	public static final String NUMERO_FIELD_NAME = "numero";
	public static final String NOME_FIELD_NAME = "nome";
	
	@DatabaseField(columnName = NUMERO_FIELD_NAME, canBeNull = false)
		
	private int numero;
	
	@DatabaseField(columnName = NOME_FIELD_NAME, canBeNull = false)
	private String nome;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Permissao [numero=" + numero + ", nome=" + nome + ", getNumero()=" + getNumero() + ", getNome()="
				+ getNome() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Permissao(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}
	public Permissao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
