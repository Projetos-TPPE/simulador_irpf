package app;

public class CalculadoraImposto {
	
	//Referencia Objeto Imposto
    Imposto fonte;

	//Constantes Extraídas
    private static final double AliquotaFaixa5 = 0.275;
	private static final double AliquotaFaixa4 = 0.225;
	private static final double AliquotaFaixa3 = 0.15;
	private static final double AliquotaFaixa2 = 0.075;
	private static final int AliquotaFaixa1 = 0;
	
	//Atributos Método Objeto
    private static final float faixa1 = 1903.98f;
    private static final float faixa2 = 922.67f;
    private static final float faixa3 = 924.40f;
    private static final float faixa4 = 913.63f;
    
    private float baseCalculo;
    private float impostoTotal;
    
    public CalculadoraImposto(Imposto fonte, float baseCalculo) {
        this.fonte = fonte;
        this.baseCalculo = baseCalculo;
    }

    public void calcular() {
    	if (baseCalculo <= faixa1) {
    		impostoTotal += baseCalculo * AliquotaFaixa1;
    		baseCalculo -= faixa1;
    	}

    	if (baseCalculo > faixa1) {
    		baseCalculo -= faixa1;
    	}

		if (baseCalculo > 0 && baseCalculo <= faixa2) {
		    impostoTotal += baseCalculo * AliquotaFaixa2;
		    baseCalculo -= faixa2;
		}

        if(baseCalculo > faixa2) {
            impostoTotal += faixa2 * AliquotaFaixa2;
            baseCalculo -= faixa2;
        }

        if (baseCalculo > 0 && baseCalculo < faixa3) {
            impostoTotal += baseCalculo * AliquotaFaixa3;
            baseCalculo -= faixa3;
        }

        if (baseCalculo > faixa3) {
            impostoTotal += faixa3 * AliquotaFaixa3;
            baseCalculo -= faixa3;
        }

        if (baseCalculo > 0 && baseCalculo < faixa4) {
            impostoTotal += baseCalculo * AliquotaFaixa4;
            baseCalculo -= faixa4;
        }

        if (baseCalculo > faixa4) {
            impostoTotal += faixa4 * AliquotaFaixa4;
            baseCalculo -= faixa4;
        }

        if (baseCalculo > 0) {
            impostoTotal += baseCalculo * AliquotaFaixa5;
        }

        fonte.setImposto(impostoTotal);
    }
}