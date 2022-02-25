package app;

public class Imposto {
    
	private double impostoFinal;
	

    public double calculaImposto(double baseCalculo) {
    	
    	double impostoTotal = 0;
    	double faixa1 = 1903.98;
    	double faixa2 = 922.67;
    	double faixa3 = 924.40;
    	double faixa4 = 913.63;
    	
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
    
    public double getImposto() {
        return impostoFinal;
    }
}