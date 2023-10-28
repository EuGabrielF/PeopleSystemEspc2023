package tech.gbfl.appMain;

import tech.gbfl.pessoas.Cliente;
import tech.gbfl.pessoas.Funcionario;
import tech.gbfl.pessoas.Pessoa;

public class AplicacaoMain {

	public static void main(String[] args) {
		
		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		
		objNovoFunc01.cadastrar(01, "Prof", 15, "02/02/2022", "Chorão", "18/09/1986", "Aqui", "09090909");
		objNovoCli01.cadastrar("C23", "Professor", "João", "13/12/1992", "Casa", "89898989898");
		

	}

}
