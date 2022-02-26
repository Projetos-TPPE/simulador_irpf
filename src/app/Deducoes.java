package app;

import java.util.LinkedList;
import java.util.List;

public class Deducoes {
	private float totalValorDeducoes;
	private String nome;
	private String dataDeNascimento;
	private int numDependentes;
	private String[] dependentes;
	private float[] pensaoAlimento;
	private float[] previdenciaOficial;
	private String[] descricaoPrevidenciaOficial;
	private String[] descricaoOutrasDeducoes;
	private float[] outrasDeducoesValor;
	
	
	public Deducoes() {
		totalValorDeducoes = 0;
		dependentes = new String[0];
		previdenciaOficial = new float[0];
		descricaoPrevidenciaOficial = new String[0];
		descricaoOutrasDeducoes = new String[0];
		numDependentes = 0;
		outrasDeducoesValor = new float[0];
		pensaoAlimento = new float[0];
	}
	
	public void cadastrarPrevidenciaOficial(String descricaoPrevidenciaOficial, float valor) {
		
		if(descricaoPrevidenciaOficial == "" || descricaoPrevidenciaOficial == null) {
			throw new DescricaoEmBrancoException("A descrição não pode ser vazia");
		}
		
		if(valor < 0) {
			throw new ValorDeducaoInvalidoException("O valor tem que ser maior ou igual a zero");
		}
		
		float tempValor[] = new float[previdenciaOficial.length + 1]; 
		String tempDescricao[] = new String[descricaoPrevidenciaOficial.length() + 1];
		
		for (int i=0; i<previdenciaOficial.length; i++) {
			tempValor[i] = this.previdenciaOficial[i];
			tempDescricao[i] = this.descricaoPrevidenciaOficial[i];
		}
		
		tempValor[previdenciaOficial.length] = valor; 
		tempDescricao[previdenciaOficial.length] = descricaoPrevidenciaOficial;
		
		this.previdenciaOficial = tempValor;
		this.descricaoPrevidenciaOficial = tempDescricao;
	}
	
	public void cadastrarDependente(String nome, String dataDeNascimento) {
		
		if(nome == "" || nome == null) {
			throw new DescricaoEmBrancoException("O nome do dependente não pode ser vazio");
		}
		this.numDependentes++;
	}
	
	public void cadastrarPensaoAlimenticia(float valor) {
		
		if(valor < 0) {
			throw new ValorPensaoInvalidoException("O valor tem que ser maior ou igual a zero");
		}
		
		
		float auxPensao[] = new float[pensaoAlimento.length + 1];
		
		for (int i=0; i<pensaoAlimento.length; i++) {
			auxPensao[i] = this.pensaoAlimento[i];
		}
		
		auxPensao[pensaoAlimento.length] = valor; 		
		
		this.pensaoAlimento = auxPensao;
	}
	
	public float getPensaoAlimento() {
		float soma = 0; 
		
		for (float f : pensaoAlimento) {
			soma += f;
		}
		return soma;  
 	}
	
	
	public void cadastrarOutrasDeducoes(String descricaoOutrasDeducoes, float valor) {
		if(descricaoOutrasDeducoes == "" || descricaoOutrasDeducoes == null) {
			throw new DescricaoEmBrancoException("A descrição não pode ser vazia");
		}
		
		if(valor < 0) {
			throw new ValorDeducaoInvalidoException("O valor tem que ser maior ou igual a zero");
		}
		
		float tempValor[] = new float[outrasDeducoesValor.length + 1];
		String tempDescricao[] = new String[descricaoOutrasDeducoes.length() + 1];
		
		for (int i=0; i<outrasDeducoesValor.length; i++) {
			tempValor[i] = this.outrasDeducoesValor[i];
			tempDescricao[i] = this.descricaoOutrasDeducoes[i];
		}
		
		tempValor[outrasDeducoesValor.length] = valor; 
		tempDescricao[outrasDeducoesValor.length] = descricaoOutrasDeducoes;
		
		
		this.descricaoOutrasDeducoes = tempDescricao;
		this.outrasDeducoesValor = tempValor;
	}
	
	public float getTotalDeducaoPrevidenciaOficial() {
		float soma = 0; 
		
		for (float f : previdenciaOficial) {
			soma += f;
		}
		return soma;  
 	}
	
	public float getOutrasDeducoes() {
		float soma = 0; 
		
		for (float f : outrasDeducoesValor) {
			soma += f;
		}
		return soma;  
 	}
	
	public void gerarValorTotalDeducoes() {
		this.totalValorDeducoes = (numDependentes * 189.59f) + getTotalDeducaoPrevidenciaOficial() + getPensaoAlimento() + getOutrasDeducoes();
	}
	
	public float getTotalValorDeducoes() {

		return totalValorDeducoes;
	}
}
