package app;

public class CalculaBase {
	
	private float rendimentos = 0;
	private float deducoes = 0;
	private float resultadobase;
	
	
	public float subtracao(float rendimentos, float deducoes) {
		this.rendimentos = rendimentos; 
		this.deducoes = deducoes;		
		this.resultadobase = rendimentos - deducoes; 		

		return resultadobase;
	}
	
	public float getTotalBase() {
		return resultadobase;
	}
	
}
