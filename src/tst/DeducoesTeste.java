package tst;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Deducoes;

@RunWith(Parameterized.class)
public class DeducoesTeste {

	Deducoes deducoes;

	Object[] registroPrevidenciaOficial;
	Object[] registroDependente;
	Object[] registroPensao;
	Object[] registroOutrasDeducoes;
	Object[][][] parametros;
	float valorEsperado;
	
	@Before
	public void setup() {
		deducoes = new Deducoes();
	}
	//Construtor
	public DeducoesTeste(
			Object[][][] parametros
	)
	{
		this.parametros = parametros;
		this.valorEsperado = (float)parametros[4][0][0];
	}
	
	@Parameters
	public static Collection<Object[][]> getParameters() {
		Object[][][] respostas = new Object[][][] {
			{
				new Object[][][] {
					{
						{
							"Contribuicao Compulsoria", 600f,
						}
					}, 
					{
						{
							"Samanta", "15/08/2000"
						},
					}, 
					{
						{
							600f
						}
					},
					{
						{
							"Contribuicao Compulsoria", 610.41f
						}
					},
					{
						{2000f}
					},
					{
					}
				},
			},
			{
				new Object[][][] {
					{
					}, 
					{
						{
							"Marta", "13/12/1999"
						}
					}, 
					{
					},
					{
					},
					{
						{189.59f}
					},
					{
					}
				}
			},
			{
				new Object[][][] {
					{
						{
							"Contribuicao Compulsoria", 900f
						}
					}, 
					{
						{
							"Samanta", "15/08/2000"
						},
					}, 
					{
						{
							300f
						}
					},
					{
						{
							"Previdencia Privada", 100f
						}
					},
					{
						{1489.59f},
					},
					{
					},
				}
			}
		};
		
		return Arrays.asList(respostas);
	}
	
	//Caso de teste
	@Test
	public void testCalcularDeducoes() {
		for(int j = 0; j < parametros[0].length; j++) {
			for(int k = 0; k < parametros[0][j].length; k=k+2) {
				deducoes.cadastrarPrevidenciaOficial((String)parametros[0][j][k], (float)parametros[0][j][k+1]);
			}
		}
		for(int j = 0; j < parametros[1].length; j++) {
			for(int k = 0; k < parametros[1][j].length; k=+2) {
				deducoes.cadastrarDependente((String)parametros[1][j][0], (String)parametros[1][j][1]);
			}
		}
		for(int j = 0; j < parametros[2].length; j++) {
			for(int k = 0; k < parametros[2][j].length; k++) {
				deducoes.cadastrarPensaoAlimenticia((float)parametros[2][j][k]);;
			}
		}
		for(int j = 0; j < parametros[3].length; j++) {
			for(int k = 0; k < parametros[3][j].length; k=k+2) {
				deducoes.cadastrarOutrasDeducoes((String)parametros[3][j][k], (float)parametros[3][j][k+1]);
			}
		}
		deducoes.gerarValorTotalDeducoes();
		assertEquals(valorEsperado, deducoes.getTotalValorDeducoes(), 0.02f);
	}
	
	
	/*
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
	public void testValorDeducaoDeUmDependente() {
		Deducoes deducoes = new Deducoes();
	
		deducoes.cadastrarDependente("Marta", "13/12/1999");
		deducoes.gerarValorTotalDeducoes();
		assertEquals(189.59f, deducoes.getTotalValorDeducoes(), 0.02f);
	}
	
	@Test
	public void testCalcularDeducoesOutroValor() {
		Deducoes deducoes = new Deducoes();
		
		deducoes.cadastrarPrevidenciaOficial("Contribuicao Compulsoria", 900f);
		deducoes.cadastrarDependente("Samanta", "15/08/2000");
		deducoes.cadastrarPensaoAlimenticia(300f);
		deducoes.cadastrarOutrasDeducoes("Previdencia Privada", 100f);
		deducoes.gerarValorTotalDeducoes();
		assertEquals(1489.59f, deducoes.getTotalValorDeducoes(), 0.02f);
	}
	
	@Test
	public void testaNomeEmBrancoDoDependente() {
		Deducoes deducoes = new Deducoes();

		assertThrows(IllegalArgumentException.class,
				() -> deducoes.cadastrarDependente("", "31/05/2001"));		
	}*/
}