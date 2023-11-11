package tech.gbfl.Composicao;

public class Telefone {
	private String ddd;
	private String telefone;
	
	
	
	public Telefone(String ddd, String telefone) {
		this.ddd = ddd;
		this.telefone = telefone;
	}
	public String getDDD() {
		return ddd;
	}
	public void setDDD(String ddd) {
		ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String numero) {
		this.telefone = numero;
	}
	@Override
	public String toString() {
		return "("+ ddd +") " + telefone;
	}
	
	
	
}
