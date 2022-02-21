package app;

public class Imposto {
    
	private float impostoFinal;

    public void calculaImposto(float baseCalculo) {
    	float imposto = 0;

        if (baseCalculo >= 1903.98) {
            imposto += 1903.98*0;
        }

        this.impostoFinal = imposto;
    }
    
    public float getImposto() {
        return impostoFinal;
    }
}