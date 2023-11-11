package tech.gbfl.pessoas;

import tech.gbfl.Composicao.Endereco;
import tech.gbfl.Composicao.Telefone;

public class Funcionario extends Pessoa{
		
	private int matricula;
	private String cargo;
	private double salario;
	private String dataAdmissao;
	
	public void cadastrar(int matricula, String cargo, double salario, String dataAdmissao, String nome, String dataNascimento, Endereco string, Telefone telefone) {
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(string);
		setTelefone(telefone);
	}
	
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * percentual;
	}
	
	public void promover(String novoCargo) {
		this.cargo = novoCargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}


		
}