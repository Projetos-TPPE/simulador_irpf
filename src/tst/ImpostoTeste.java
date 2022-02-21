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
        imposto.calculaImposto(2000f);
        assertEquals(0f, imposto.getImposto(), 0f);
    }
}