package app;

public class Rendimento {
	
	private float totalRendimentos;
	
	public void cadastrarRendimento(String descricao, float valorRendimento) {
		this.totalRendimentos = valorRendimento;
	}

	public float getTotalRendimentos() {
		return totalRendimentos;
	}
}