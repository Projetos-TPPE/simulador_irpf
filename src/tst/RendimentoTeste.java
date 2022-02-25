package tst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.Rendimento;

public class RendimentoTeste {
	
	Rendimento rendimento;
	
	@Before
	public void setup() {
		rendimento = new Rendimento();
	}

    @Test
    public void testeRendimento() {
    	rendimento.cadastrarRendimento("Salario", 1000f);
        assertEquals(1000f, rendimento.getTotalRendimentos(), 0f);
    }
}