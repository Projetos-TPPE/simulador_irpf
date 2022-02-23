package app;

public class Imposto {
    
	private double impostoFinal;

    public double calculaImposto(double baseCalculo) {
    	double impostoTotal = 0;

        if (baseCalculo >= 1903.98) {            
        	impostoTotal += 1903.98 * 0;          
        }

        return this.impostoFinal = impostoTotal;
    }
    
    public double getImposto() {
        return impostoFinal;
    }
}