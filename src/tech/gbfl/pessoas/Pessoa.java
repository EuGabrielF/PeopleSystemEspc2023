package tech.gbfl.pessoas;

import tech.gbfl.Composicao.Endereco;
import tech.gbfl.Composicao.Telefone;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private Telefone telefone;
	
	public void cadastrar(String nome, String dataNascimento, Endereco endereco, Telefone telefone) {
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco string) {
		this.endereco = string;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
	
}
