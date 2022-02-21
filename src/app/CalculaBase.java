package app;

public class CalculaBase {
	
	private int rendimentos;
	private int deducoes;
	private int total;
	
	public int subtracao(int rendimentos, int deducoes) {
		this.rendimentos = rendimentos; 
		this.deducoes = deducoes;
		this.total = rendimentos - deducoes; 
		
		return this.total;
	}
	
}
