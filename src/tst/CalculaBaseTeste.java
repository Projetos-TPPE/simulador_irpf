package tst;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.CalculaBase;

@RunWith(Parameterized.class)
public class CalculaBaseTeste {
	
	CalculaBase calcula;
	Object[][] base;
	float valorEsperado;
		
	@Before
	public void setup() {
		calcula = new CalculaBase();
	}
	
	public CalculaBaseTeste(Object[][] base, float valorEsperado) {
		this.base = base;
		this.valorEsperado = valorEsperado;
	}
	
	@Parameters
	public static Collection<Object[]> getParamters(){
		// {{{ valorRendimentos, valorDeducoes}} , valorEsperado}
		// {{
		//   {10000f, 2000f}, 8000f}
		Object[][] resultado = new Object[][] {
			{new Object[][] {
				{10000f, 2000f}
			}, 8000f},
			{new Object[][] {
				{10000f, 5000f}
			}, 5000f},
			{new Object[][] {
				{12345f, 12000f},
			}, 345f},
		};
		
		return Arrays.asList(resultado);
	}
	
	@Test
	public void testCalculoBase() {
		for (Object[] o : base) {
			calcula.subtracao((float)o[0], (float)o[1]);
			assertEquals(valorEsperado, calcula.getTotalBase(), 0f);
		}
	}
	
//	@Test
//	public void testSubtracao() {
//		calcula.subtracao(10000f, 2000f);
//		assertEquals(8000f, calcula.getTotalBase(), 0f);
//	}
//	
//	@Test
//	public void testSubtracaoDupla() {
//		calcula.subtracao(10000f, 5000f);
//		assertEquals(5000f, calcula.getTotalBase(), 0f);
//	}
//	
//	@Test
//	public void testSubtracaoTrian() {
//		calcula.subtracao(12345f, 12000f);
//		assertEquals(345f, calcula.getTotalBase(), 0f);
//	}
		
}
