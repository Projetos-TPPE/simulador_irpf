package tst;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import app.DescricaoEmBrancoException;
import app.Rendimento;
import app.ValorRendimentoInvalidoException;

public class RendimentoExcecaoTeste {

	@Test
	public void testeDescricaoEmBranco() {
		Rendimento rendimento = new Rendimento();

		assertThrows(DescricaoEmBrancoException.class, 
				() -> rendimento.cadastrarRendimento("", 1200f));
	}
	@Test
	public void testeValorRendimentoInvalido() {
		Rendimento rendimento = new Rendimento();

		assertThrows(ValorRendimentoInvalidoException.class, 
				() -> rendimento.cadastrarRendimento("Rendimento", -1f));
	}
}
