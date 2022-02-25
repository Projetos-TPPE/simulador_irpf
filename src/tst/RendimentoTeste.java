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
    
    @Test
    public void testeRendimento2() {
    	System.out.print(rendimento.getTotalRendimentos());
    	rendimento.cadastrarRendimento("Salario", 1000f);
    	rendimento.cadastrarRendimento("Salario", 2000f);
        assertEquals(3000f, rendimento.getTotalRendimentos(), 0f);
    }
    
    @Test
    public void testeRendimento3() {
    	System.out.print(rendimento.getTotalRendimentos());
    	rendimento.cadastrarRendimento("Salario", 1000f);
    	rendimento.cadastrarRendimento("Salario", 2000f);
    	rendimento.cadastrarRendimento("Salario", 3000f);
        assertEquals(6000f, rendimento.getTotalRendimentos(), 0f);
    }
}