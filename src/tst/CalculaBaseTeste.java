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
				{1000f, 2000f},
				{9555f, 1555f}
			}, 8000f},
			{new Object[][] {
				{10000f, 5000f},
				{20000f, 15000f},
				{6000f, 1000f}
			}, 5000f},
			{new Object[][] {
				{100f, 200f}
			}, 0f},
		};
		
		return Arrays.asList(resultado);
	}
	
	@Test
	public void testCalculoBase() {
		for (Object[] o : base) {
			calcula.subtracao((float)o[0], (float)o[1]);
		}
		assertEquals(valorEsperado, calcula.getTotalBase(), 0f);
	}

	
	
//	@Test
//	public void testSubtracao() {
//		calcula.subtracao(10000f, 2000f);
//		assertEquals(8000f, calcula.getTotalBase(), 0f);
//	}
//	
//	
//	@Test
//	public void testDuasSubtracao() {
//		calcula.subtracao(10000f, 2000f);
//		calcula.subtracao(9555f, 1555f);
//		assertEquals(8000f, calcula.getTotalBase(), 0f);
//	}
//	
//	@Test
//	public void testSubtracaoNegativa() {
//		calcula.subtracao(100f, 200f);
//		assertEquals(0f, calcula.getTotalBase(), 0f);
//	}	
}
