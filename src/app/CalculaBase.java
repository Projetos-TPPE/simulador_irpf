package app;

public class CalculaBase {
	
	private int rendimentos;
	private int deducoes;
	private int total;
	
	public int subtracao(int rendimentos, int deducoes) {
		this.rendimentos = rendimentos; 
		this.deducoes = deducoes;		
		this.total = rendimentos - deducoes; 
		
		if(total < 0) {
			total = 0;
		}
		
		return this.total;
	}
	
}
