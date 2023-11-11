package tech.gbfl.appMain;

import java.time.LocalDate;

import tech.gbfl.Composicao.Endereco;
import tech.gbfl.Composicao.Telefone;
import tech.gbfl.pessoas.Cliente;
import tech.gbfl.pessoas.Funcionario;
import tech.gbfl.pessoas.Pessoa;

public class AplicacaoMain {

	public static void main(String[] args) {
		
		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		Endereco objEndClie01 = new Endereco();
		LocalDate dataNasc01 = LocalDate.of(2000, 12, 1);
		Telefone tel01 = new Telefone();
		
		objNovoFunc01.cadastrar(1, "cargo", 1000.0, "01\01\01", "nome",
				dataNasc01, objEndClie01, tel01);
		
		objNovoCli01.getNome();
		objNovoCli01.getCodigo();
		objNovoCli01.getEndereco().getCep();
		objNovoCli01.obterIdade();
		
		

	}

}
