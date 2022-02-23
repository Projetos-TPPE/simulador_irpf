package app;

public class Deducoes {
	private float totalValorDeducoes;
	
	public Deducoes() {
		totalValorDeducoes = 0;
	}
	
	public void cadastrarPrevidenciaOficial(String descricao, float valor) {
	}
	
	public void cadastrarDependente(String nome, String dataDeNascimento) {
	}
	
	public void cadastrarPensaoAlimenticia(float valor) {
	}
	
	public void cadastrarOutrasDeducoes(String descricao, float valor) {
	}
	
	public void gerarValorTotalDeducoes() {
		this.totalValorDeducoes = 2000f;
	}
	
	public float getTotalValorDeducoes() {

		return totalValorDeducoes;
	}
}
