package tech.gbfl.pessoas;

import java.time.LocalDate;
import java.time.Period;

import tech.gbfl.Composicao.Endereco;
import tech.gbfl.Composicao.Telefone;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telefone;
	
	public void cadastrar(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public int obterIdade() {
		int idade = 0;
		//subtrair ano atual do ano de nascimento
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return idade = periodo.getYears();		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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
