package app;

public class AliquotaEfetiva {
    private float porcantagemAliquotaEfetiva;

    public AliquotaEfetiva(float totalRendimentos, float imposto) {
        this.porcantagemAliquotaEfetiva = 10;
    }

    public float getAliquotaEfetiva() {
        return porcantagemAliquotaEfetiva;
    }
}