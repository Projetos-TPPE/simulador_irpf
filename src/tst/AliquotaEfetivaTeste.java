package tst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.AliquotaEfetiva;

public class AliquotaEfetivaTeste {

    @Test
    public void testeAliquotaEfetiva() {
        AliquotaEfetiva aliquota = new AliquotaEfetiva(20000f, 2000f);
        assertEquals(10f, aliquota.getAliquotaEfetiva(), 0f);
    }
}