package tst;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.AliquotaEfetiva;

@RunWith(Parameterized.class)
public class AliquotaEfetivaTeste {
    
    AliquotaEfetiva aliquota;
    //Object[][] parametros;
    float totalRendimentos;
    float imposto;
    float valorEsperado;
    public Class<? extends Exception> expectedException;
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Before
    public void setup() {
        aliquota = new AliquotaEfetiva();
    }
    
    
    public AliquotaEfetivaTeste(float totalRendimentos, float imposto, float valorEsperado, Class<? extends Exception> exception) {
        this.totalRendimentos = totalRendimentos;
        this.imposto = imposto;
        this.expectedException = exception;
        this.valorEsperado = valorEsperado;
    }
    
    @Parameters
    public static Collection<Object[]> getParamters(){
        Object[][] resultado = new Object[][] {
                {20000f, 2000f, 10f, null},
                {40000f, 8000f, 20f, null},
                {80000f, 24000f, 30f, null},
                {0f, 40000f, 0f, ArithmeticException.class}
        };
        
        return Arrays.asList(resultado);
    }
    
    @Test
    public void testAliquotaEfetiva() throws ArithmeticException, InterruptedException{
    	if (expectedException != null) {
    		
            thrown.expect(expectedException);
        }
            aliquota.calculaAliquotaEfetiva(totalRendimentos, imposto);
            assertEquals(valorEsperado, aliquota.getAliquotaEfetiva(), 0f);
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