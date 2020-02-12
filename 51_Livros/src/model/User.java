package model;

import com.j256.ormlite.field.DatabaseField;

public class User {
	public static final String LOGIN_FIELD_NAME = "login";
	public static final String SENHA_FIELD_NAME = "senha";	
	public static final String NOME_FIELD_NAME = "nome";
	public static final String EMAIL_FIELD_NAME = "email";
	public static final String CPF_FIELD_NAME = "cpf";
	
	@DatabaseField(columnName = LOGIN_FIELD_NAME, canBeNull = false)
	private String login;
	
	@DatabaseField(columnName = SENHA_FIELD_NAME, canBeNull = false)
	private int senha;
	
	@DatabaseField(columnName = NOME_FIELD_NAME, canBeNull = false)
	private String nome;
	
	@DatabaseField(columnName = EMAIL_FIELD_NAME, canBeNull = false)
	private String email;
	
	@DatabaseField(columnName = CPF_FIELD_NAME, canBeNull = false)
	private int cpf;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public User(String login, int senha, String nome, String email, int cpf) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", senha=" + senha + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf
				+ ", getLogin()=" + getLogin() + ", getSenha()=" + getSenha() + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + ", getCpf()=" + getCpf() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
