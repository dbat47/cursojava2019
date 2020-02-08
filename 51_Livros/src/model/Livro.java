package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "livro")

public class Livro {

	public static final String ISBN_FIELD_NAME = "isbn";
	public static final String TITULO_FIELD_NAME = "titulo";

	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = ISBN_FIELD_NAME, canBeNull = false)
	private long isbn;

	@DatabaseField(columnName = TITULO_FIELD_NAME)
	private String titulo;

	private String edicao;
	private int ano;
	private String formato;
	private int paginas;
	private String editora;
	private String autor;

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;

	}

	public String getEdicao() {
		return edicao;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setFormato(String formato) {
		this.formato = formato;

	}

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(long isbn, String titulo, String edicao, int ano, String formato, int paginas, String editora,
			String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.ano = ano;
		this.formato = formato;
		this.paginas = paginas;
		this.editora = editora;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", edicao=" + edicao + ", ano=" + ano + ", formato="
				+ formato + ", paginas=" + paginas + ", editora=" + editora + ", autor=" + autor + ", getIsbn()="
				+ getIsbn() + ", getTitulo()=" + getTitulo() + ", getEdicao()=" + getEdicao() + ", getAno()=" + getAno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
