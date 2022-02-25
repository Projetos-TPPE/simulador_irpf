package app;

public class Imposto {
    
	private float impostoFinal;
	

    public float calculaImposto(float baseCalculo) {
    	
    	float impostoTotal = 0f;
    	float faixa1 = 1903.98f;
    	float faixa2 = 922.67f;
    	float faixa3 = 924.40f;
    	float faixa4 = 913.63f;
    	
    	if (baseCalculo <= faixa1) {            
         	impostoTotal += baseCalculo * 0;
         	baseCalculo -= faixa1;
         }
         
         if (baseCalculo > faixa1) {
             baseCalculo -= faixa1;	
         }
         
         if (baseCalculo > 0 && baseCalculo <= faixa2) {
         	impostoTotal += baseCalculo * 0.075;
         	baseCalculo -= faixa2;
         }
         
         if(baseCalculo > faixa2) {
         	impostoTotal += faixa2 * 0.075;
         	baseCalculo -= faixa2;
         }
         
         if (baseCalculo > 0 && baseCalculo < faixa3) {
         	impostoTotal += baseCalculo*0.15;
         	baseCalculo -= faixa3;
         }
         
         if (baseCalculo > faixa3) {
         	impostoTotal += faixa3*0.15;
         	baseCalculo -= faixa3;
         }
         
         if (baseCalculo > 0 && baseCalculo < faixa4) {
         	impostoTotal += baseCalculo*0.225;
         	baseCalculo -= faixa4;
         }
         
         if (baseCalculo > faixa4) {
         	impostoTotal += faixa4*0.225;
         	baseCalculo -= faixa4;
         }
         
         if (baseCalculo > 0) {
         	impostoTotal += baseCalculo*0.275;
         }
         
		return this.impostoFinal = impostoTotal;
    }
    
    public float getImposto() {
        return impostoFinal;
    }
}