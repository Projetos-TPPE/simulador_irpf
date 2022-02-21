package tst;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import app.CalculaBase;

public class CalculaBaseTeste {
	
	private CalculaBase calcula;
	
	@Before
	public void setup() {
		calcula = new CalculaBase();
	}
	
	@Test
	public void testSubtracao() {
		assertEquals(8000, calcula.subtracao(10000, 2000));
	}
	
	@Test
	public void testSubtracaoNegativa() {
		assertEquals(0, calcula.subtracao(100, 200));
	}
}
