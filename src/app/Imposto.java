package app;


public class Imposto {

    private float impostoFinal;

    public void calculaImposto(float baseCalculo) {
        new CalculadoraImposto(this, baseCalculo).calcular();
    }

    public float getImposto() {
        return impostoFinal;
    }

    public void setImposto(float impostoFinal) {
        this.impostoFinal = impostoFinal;
    }
}