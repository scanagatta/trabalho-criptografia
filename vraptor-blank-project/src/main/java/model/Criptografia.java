package model;

public class Criptografia {

	private String texto1;
	private String texto2;
	private String chave;
	private int tipo;

	public Criptografia() {
		super();

	}

	public Criptografia(String texto1, String texto2, String chave, int tipo) {
		super();
		this.texto1 = texto1;
		this.texto2 = texto2;
		this.chave = chave;
		this.tipo = tipo;
	}

	public String getTexto1() {
		return texto1;
	}

	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	public String getTexto2() {
		return texto2;
	}

	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
