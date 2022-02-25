package tst;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Imposto;

@RunWith(Parameterized.class)
public class ImpostoTeste {
    
	Imposto imposto;
	
	Object[][] faixa;
	float valorEsperado;

    @Before
    public void setup() {
        imposto = new Imposto();
    }
    
    public ImpostoTeste(Object[][] faixa, float valorEsperado) {
		this.faixa = faixa;
		this.valorEsperado = valorEsperado;
	}
    
    @Parameters
	public static Collection<Object[]> getParamters(){
		
		Object[][] resultado = new Object[][] {
			{new Object[][] {
				{1900f}
			}, 0f},
			{new Object[][] {
				{2826f}
			}, 69.1515f},
			{new Object[][] {
				{10000f}
			}, 1880.64f},
		};		
		return Arrays.asList(resultado);
	}
    
	@Test
	public void testImposto() {
		for (Object[] o : faixa) {
			imposto.calculaImposto((float)o[0]);
			assertEquals(valorEsperado, imposto.getImposto(), 0.01);
		}
	}    
    
}  
//    @Test
//    public void testeImposto() {
//        imposto.calculaImposto(1900);
//        assertEquals(0, imposto.getImposto(), 0.01);
//    }
//    
//    @Test
//    public void testeImpostoFaixa2() {
//        imposto.calculaImposto(2826);
//        assertEquals(69.1515, imposto.getImposto(), 0.01);
//    }
//    
//    @Test
//    public void testeImpostoFaixa5() {
//        imposto.calculaImposto(10000);
//        assertEquals(1880.64, imposto.getImposto(), 0.01);
//    }
