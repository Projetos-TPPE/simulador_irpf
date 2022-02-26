package app;

public class AliquotaEfetiva {
    private float porcantagemAliquotaEfetiva;

    public void calculaAliquotaEfetiva(float totalRendimentos, float imposto) {
    	if (totalRendimentos == 0) { 
			throw new ArithmeticException();
		}
    		float porcentagem = (imposto*100)/totalRendimentos;
    		this.porcantagemAliquotaEfetiva = porcentagem;
    }

    public float getAliquotaEfetiva() {
        return porcantagemAliquotaEfetiva;
    }
}