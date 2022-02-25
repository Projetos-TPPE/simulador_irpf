package tst;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Deducoes;

public class DeducoesTeste {

	@Test
	public void testCalcularDeducoes() {
		Deducoes deducoes = new Deducoes();
		
		deducoes.cadastrarPrevidenciaOficial("Contribuicao Compulsoria", 600f);
		deducoes.cadastrarDependente("Samanta", "15/08/2000");
		deducoes.cadastrarPensaoAlimenticia(600f);
		deducoes.cadastrarOutrasDeducoes("Previdencia Privada", 610.41f);
		deducoes.gerarValorTotalDeducoes();
		assertEquals(2000f, deducoes.getTotalValorDeducoes(), 0.02f);
	}
	
	@Test
	public void testCalcularDeducoes2() {
		Deducoes deducoes = new Deducoes();
	
		deducoes.cadastrarDependente("Marta", "13/12/1999");
		deducoes.gerarValorTotalDeducoes();
		assertEquals(189.59f, deducoes.getTotalValorDeducoes(), 0.02f);
	}
}
