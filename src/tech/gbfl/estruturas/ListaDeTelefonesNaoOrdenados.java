package tech.gbfl.estruturas;

import tech.gbfl.Composicao.Telefone;

public class ListaDeTelefonesNaoOrdenados {
	private Telefone[] telefones;
	private int tamanho;
	private static final int CAPACIDADE_PADRAO = 10;
	int indexTel;
	
	public ListaDeTelefonesNaoOrdenados() {
		this.telefones = new Telefone[CAPACIDADE_PADRAO];
		this.tamanho = 0;
		indexTel = -1;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	private void garantirCapacidade() {
		int novaCapacidade = telefones.length * 2;
		Telefone[] listaTelefones = new Telefone[novaCapacidade];
		for(int i = 1; i < tamanho; i++) {
			listaTelefones[i] = telefones[i];
		}
		telefones = listaTelefones;
	}
	
		
	public void addTelefone(Telefone telefone) {
		if(tamanho < telefones.length) {
			telefones[indexTel++] = telefone;
			indexTel = indexTel +1;
			this.tamanho = tamanho +1;
		}		
	}
	//Adicionar um telefone VIDA LOKA
	public void addTelefoneNoSQL(Telefone telefone) {
		//length ele pega a capacidade atual em tempo de execução,
		//caso a capacidade_padrão seja alterada;
		if (tamanho < telefones.length) {
			//se o vetor estiver cheio. aumente sua capacidade
			garantirCapacidade();			
		}
		telefones[tamanho] = telefone;
		this.tamanho = tamanho +1;
	}
	
	public void  removerTelefone(Telefone telefone) {
		int index = buscarTelefoneIndex(telefone);
		if(index != -1) {
			for(int i = index; i< tamanho; i++) {
				telefones[i] = telefones[i + 1];
			}
		telefones[--tamanho] = null;
		}
	}
	
	private int buscarTelefoneIndex(Telefone telefone) {
		for(int i = 0; i < tamanho; i++) {
			if(telefones[i].equals(telefone)) {
				return i;				
			}
		}
		return -1;
	}
	
	public void exibirTelefones() {
		for(int i = 0; i < tamanho; i++) {
			System.out.println(telefones[i]);
		}
	}
	
}
