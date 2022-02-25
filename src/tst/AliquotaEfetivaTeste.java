package tst;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.AliquotaEfetiva;

@RunWith(Parameterized.class)
public class AliquotaEfetivaTeste {
    
    AliquotaEfetiva aliquota;
    Object[][] parametros;
    float valorEsperado;
    
    
    @Before
    public void setup() {
        aliquota = new AliquotaEfetiva();
    }
    
    public AliquotaEfetivaTeste(Object[][] parametros, float valorEsperado) {
        this.parametros = parametros;
        this.valorEsperado = valorEsperado;
    }
    
    @Parameters
    public static Collection<Object[]> getParamters(){
        Object[][] resultado = new Object[][] {
            {new Object[][] {
                {20000f, 2000f}
            }, 10f},
            {new Object[][] {
                {40000f, 8000f}
            }, 20f},
            {new Object[][] {
                {80000f, 24000f},
            }, 30f},
        };
        
        return Arrays.asList(resultado);
    }
    
    @Test
    public void testAliquotaEfetiva() {
        for (Object[] o : parametros) {
            aliquota.calculaAliquotaEfetiva((float)o[0], (float)o[1]);
            assertEquals(valorEsperado, aliquota.getAliquotaEfetiva(), 0f);
        }
    }

    /*@Test
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
    }*/
}