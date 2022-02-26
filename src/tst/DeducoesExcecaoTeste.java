package tst;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import app.Deducoes;
import app.DescricaoEmBrancoException;
import app.ValorDeducaoInvalidoException;
import app.ValorPensaoInvalidoException;

public class DeducoesExcecaoTeste {
	@Test
	public void testeDescricaoEmBrancoPrevidenciaOficial() {
		Deducoes deducoes = new Deducoes();

		assertThrows(DescricaoEmBrancoException.class, 
				() -> deducoes.cadastrarPrevidenciaOficial("", 2000f));
	}
	@Test
	public void testeValorDeducaoInvalidaPrevidenciaOficial() {
		Deducoes deducoes = new Deducoes();

		assertThrows(ValorDeducaoInvalidoException.class, 
				() -> deducoes.cadastrarPrevidenciaOficial("Contribuição Compulsória", -2000f));
	}
	@Test
	public void testeValorPensaoInvalidoAlimenticia() {
		Deducoes deducoes = new Deducoes();

		assertThrows(ValorPensaoInvalidoException.class, 
				() -> deducoes.cadastrarPensaoAlimenticia(-2000f));
	}
	@Test
	public void testeDescricaoEmBrancoDependentes() {
		Deducoes deducoes = new Deducoes();

		assertThrows(DescricaoEmBrancoException.class, 
				() -> deducoes.cadastrarDependente("", "14/11/1999"));
	}
	@Test
	public void testeDescricaoEmBrancoOutrasDeducoes() {
		Deducoes deducoes = new Deducoes();

		assertThrows(DescricaoEmBrancoException.class, 
				() -> deducoes.cadastrarOutrasDeducoes("", 2000f));
	}
	@Test
	public void testeValorDeducaoInvalidaOutrasDeducoes() {
		Deducoes deducoes = new Deducoes();

		assertThrows(ValorDeducaoInvalidoException.class, 
				() -> deducoes.cadastrarOutrasDeducoes("Contribuição Compulsória", -2000f));
	}
}
