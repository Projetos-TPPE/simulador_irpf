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
	public void testSubtracaoDupla() {
		calcula.subtracao(10000f, 5000f);
		assertEquals(5000f, calcula.getTotalBase(), 0f);
	}
		
}
