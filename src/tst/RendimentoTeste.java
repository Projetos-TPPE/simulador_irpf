package tst;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Rendimento;

@RunWith(Parameterized.class)
public class RendimentoTeste {
	
	Rendimento rendimento;
	
	Object[][] rendimentos; 
	float valorEsperado; 
	
	@Before
	public void setup() {
		rendimento = new Rendimento();
	}
	
	public RendimentoTeste(Object[][] rendimentos, float valorEsperado) {
		this.rendimentos = rendimentos;
		this.valorEsperado = valorEsperado;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() {
		Object[][] respostas = new Object[][] {
			{new Object[][] {
				{"Salario", 10000f},
			}, 10000f},
			{new Object[][] {
				{"Salario", 8000f}, 
				{"Aluguel", 2000f}
			}, 10000f}, 
			{new Object[][] {
				{"Salario", 7000f}, 
				{"Aluguel", 2000f},
				{"Dividen", 1000f}
			}, 10000f}
		};
		
		return Arrays.asList(respostas);
	}
	
	@Test
	public void testCadastroRendimentos() {
		for (Object[] o : rendimentos) {
			rendimento.cadastrarRendimento((String)o[0], (float)o[1]);
		}
		assertEquals(10000f, rendimento.getTotalRendimentos(), 0f);
	}
	
	/*@Test
    public void testeRendimento() {
    	rendimento.cadastrarRendimento("Salario", 1000f);
        assertEquals(1000f, rendimento.getTotalRendimentos(), 0f);
    }*/

    /*@Test
    public void testeRendimento2() {
    	System.out.print(rendimento.getTotalRendimentos());
    	rendimento.cadastrarRendimento("Salario", 1000f);
    	rendimento.cadastrarRendimento("Salario", 2000f);
        assertEquals(3000f, rendimento.getTotalRendimentos(), 0f);
    }*/

    /*@Test
    public void testeRendimento3() {
    	System.out.print(rendimento.getTotalRendimentos());
    	rendimento.cadastrarRendimento("Salario", 1000f);
    	rendimento.cadastrarRendimento("Salario", 2000f);
    	rendimento.cadastrarRendimento("Salario", 3000f);
        assertEquals(6000f, rendimento.getTotalRendimentos(), 0f);
    }*/
}