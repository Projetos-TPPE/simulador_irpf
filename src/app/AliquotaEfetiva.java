package app;

public class AliquotaEfetiva {
    private float porcantagemAliquotaEfetiva;

    public AliquotaEfetiva(float totalRendimentos, float imposto) {
        this.porcantagemAliquotaEfetiva = (imposto*100)/totalRendimentos;
    }

    public float getAliquotaEfetiva() {
        return porcantagemAliquotaEfetiva;
    }
}