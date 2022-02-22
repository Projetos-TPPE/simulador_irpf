package tst;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import app.CalculaBase;

public class CalculaBaseTeste {
	
	CalculaBase calcula;
	
	@Before
	public void setup() {
		calcula = new CalculaBase();
	}
	
	@Test
	public void testSubtracao() {
		calcula.subtracao(10000f, 2000f);
		assertEquals(8000f, calcula.getTotalBase(), 0f);
	}
	
	@Test
	public void testDuasSubtracao() {
		calcula.subtracao(10000f, 2000f);
		calcula.subtracao(9555f, 1555f);
		assertEquals(8000f, calcula.getTotalBase(), 0f);
	}
	
	@Test
	public void testSubtracaoNegativa() {
		calcula.subtracao(100, 200);
		assertEquals(0f, calcula.getTotalBase(), 0f);
	}	
}
