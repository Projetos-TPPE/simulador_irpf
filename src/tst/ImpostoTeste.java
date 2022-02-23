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
        imposto.calculaImposto(1903.98);
        assertEquals(0, imposto.getImposto(), 0.01);
    }
    
}