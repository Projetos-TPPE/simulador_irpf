package app;

public class CalculaBase {
	
	private float rendimentos;
	private float deducoes;
	private float resultadobase;
	
	
	public float subtracao(float rendimentos, float deducoes) {
		this.rendimentos = rendimentos; 
		this.deducoes = deducoes;		
		this.resultadobase = rendimentos - deducoes; 
		
		if(resultadobase < 0) {
			resultadobase = 0;
		}
		
		return this.resultadobase;
	}
	
	public float getTotalBase() {
		return resultadobase;
	}
	
}
