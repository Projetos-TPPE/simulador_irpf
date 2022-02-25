package tst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.Imposto;

public class ImpostoTeste {
    
	Imposto imposto;

    @Before
    public void setup() {
        imposto = new Imposto();
    }

    @Test
    public void testeImposto() {
        imposto.calculaImposto(1900);
        assertEquals(0, imposto.getImposto(), 0.01);
    }
    
    @Test
    public void testeImpostoFaixa2() {
        imposto.calculaImposto(2826);
        assertEquals(69.1515, imposto.getImposto(), 0.01);
    }
    
    @Test
    public void testeImpostoFaixa5() {
        imposto.calculaImposto(10000);
        assertEquals(1880.64, imposto.getImposto(), 0.01);
    }
    
}