package tst;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Deducoes;

public class DeducoesTeste {

	@Test
	public void testCalcularDeducoes() {
		Deducoes deducoes = new Deducoes();
		
		deducoes.cadastrarPrevidenciaOficial("Contribuicao Compulsoria", 600);
		deducoes.cadastrarDependente("Samanta", "15/08/2000");
		deducoes.cadastrarPensaoAlimenticia(600);
		deducoes.cadastrarOutrasDeducoes("Previdência Privada", 610.43f);
		deducoes.gerarValorTotalDeducoes();
		assertEquals(2000f, deducoes.getTotalValorDeducoes(), 0f);
	}
}
