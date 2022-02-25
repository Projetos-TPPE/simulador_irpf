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
    
    @Test
    public void testeAliquotaEfetiva2() {
        AliquotaEfetiva aliquota = new AliquotaEfetiva(40000f, 8000f);
        assertEquals(20f, aliquota.getAliquotaEfetiva(), 0f);
    }
    
    @Test
    public void testeAliquotaEfetiva3() {
        AliquotaEfetiva aliquota = new AliquotaEfetiva(80000f, 24000f);
        assertEquals(30f, aliquota.getAliquotaEfetiva(), 0f);
    }
}