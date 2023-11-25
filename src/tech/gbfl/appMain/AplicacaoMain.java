package tech.gbfl.appMain;

import java.time.LocalDate;

import tech.gbfl.Composicao.Endereco;
import tech.gbfl.Composicao.Telefone;
import tech.gbfl.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.gbfl.pessoas.Cliente;
import tech.gbfl.pessoas.Funcionario;
import tech.gbfl.pessoas.Pessoa;

public class AplicacaoMain {

	public static void main(String[] args) {
		
/*		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		Endereco objEndClie01 = new Endereco();
		LocalDate dataNasc01 = LocalDate.of(2000, 12, 1);
		Telefone tel01 = new Telefone("12", "122222");
		
		objNovoFunc01.cadastrar(1, "Cargo", 1000.0, dataNasc01, "nome", dataNasc01, objEndClie01, tel01);
		objNovoCli01.cadastrar("C01", "Líder", "Jr.", dataNasc01, objEndClie01, tel01);
		//objEndCli01.cadastrarEnd();
		
		objNovoCli01.getNome();
		objNovoCli01.getCodigo();
		objNovoCli01.getEndereco().getCep();
		objNovoCli01.obterIdade();*/
		
		ListaDeTelefonesNaoOrdenados minhaLista = new ListaDeTelefonesNaoOrdenados();
		Telefone telefone1 = new Telefone("11", "1234-5678");
		Telefone telefone2 = new Telefone("22", "9876-5432");
		
		minhaLista.addTelefone(telefone1);
		minhaLista.addTelefone(telefone2);
		
		

	}

}
