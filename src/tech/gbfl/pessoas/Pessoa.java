package tech.gbfl.pessoas;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String telefone;
	
	public void cadastrar(String nome, String dataNascimento, String endereco, String telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public int obterIdade() {
		int idade = 0;
		//subtrair ano atual do ano de nascimento
		return idade;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}