package tech.gbfl.pessoas;

import tech.gbfl.Composicao.Endereco;
import tech.gbfl.Composicao.Telefone;

public class Cliente extends Pessoa{
	private String codigo;
	private String profissão;
	
	public void cadastrar(String codigo, String profissao, String nome,String dataNascimento, Endereco endereco, Telefone telefone) {
		this.codigo = codigo;
		this.profissão = profissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelefone(telefone);	
	}
	
	public String getCodigo() {
		return codigo;
	}	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}		
	public String getProfissão() {
		return profissão;
	}
	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}	
	
}
