package app;

public class Rendimento {
	
	private float totalRendimentos;
	
	public void cadastrarRendimento(String descricao, float valorRendimento) {
		if(descricao == "" || descricao == null) {
			throw new DescricaoEmBrancoException("Não é permitido exceção em branco!");
		}
		if(valorRendimento < 0) {
			throw new ValorRendimentoInvalidoException("Não é permitido exceção em branco!");
		}
		this.totalRendimentos += valorRendimento;
	}

	public float getTotalRendimentos() {
		return totalRendimentos;
	}
}