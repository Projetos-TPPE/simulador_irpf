UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
TPPE - T�cnicas de Programa��o para Plataformas Emergentes  

### Trabalho Pr�tico 1 - _Test-Driven Development_

---

**Enunciado do trabalho** 

Seja o seguinte cen�rio descrito a seguir:

> De um modo bastante resumido, o Imposto de Renda de Pessoa F�sica (IRPF) de
> todo contribuinte � calculado mensalmente considerando os rendimentos
> tribut�veis recebidos no m�s corrente e as dedu��es legais. Da subtra��o
> desses valores (rendimentos - dedu��es) obtem-se a *base de c�lculo*, sobre o
> qual ser� calculado o valor do imposto. H� 5 faixas de c�lculo de imposto,
> cada qual com sua al�quota (definida em \%) a ser aplicada sobre o valor que a
> base de c�lculo ocupou da faixa. O valor do imposto final � a soma dos valores
> de impostos a serem pagos para cada faixa e a al�quota efetiva total (em \%) �
> o resultado do valor do imposto dividido pela base de c�lculo. Cada um desses
> passos est� detalhado a seguir.
>
> Como rendimentos tribut�veis entende-se todos aqueles valores recebidos pelo
> contribuinte tais como sal�rios, alugu�is, participa��o em lucros e
> rendimentos de empresas, dividendos, lucros de aplica��es financeiras, dentre
> outros. O valor total desses rendimentos deve ser utilizado para efeitos do
> c�lculo do IRPF. 
>
> O contribuinte tem direito legal a v�rios dedu��es no m�s corrente. Como
> dedu��es integrais entende-se aquelas cujos valores totais ser�o abatidos do
> valor total de dividendos. S�o exemplos de dedu��es integrais: 
> * Contribui��o previdenci�ria oficial (podendo ser mais de uma contribui��o,
>   por exemplo, no contracheque + contribui��o via carn� INSS);
> * Pens�o aliment�cia;
> * Previd�ncia privada ou Fundo de Previd�ncia dos Servidores p�blicos
>   (Funpresp); 
> * Valores pagos via carn�-le�o, dentre outros.  
>
> O contribuinte poder� ainda deduzir para cada dependente legal o valor de
> R$189,59 por m�s.  
> Todas essas dedu��es dever�o ser somadas para efeitos de c�lculo do total de
> dedu��es a que o contribuinte tem direito.  
> 
> A base de c�lculo do IRPF � dada pela subtra��o do total de rendimentos pelo
> total de dedu��es. 
> 
> Para o valor da base de c�lculo, � calculado o valor de cada uma das 5 faixas
> de imposto. As faixas possuem as seguintes al�quotas:   
> 
> | Faixa | Al�quota    |
> |:-----:|:-----------:|
> | 1a.   | 0% (isenta) |
> | 2a.   | 7,5%        |
> | 3a.   | 15%         |
> | 4a.   | 22,5%       |
> | 5a.   | 25%         |
> 
> Portanto, baseado na tabela acima, os valores da base de c�lculo que atingiram
> as faixas ser�o multiplicados pelas respectivas al�quotas para c�lculo do
> valor do imposto de cada uma das faixas. O valor total do imposto a ser pago
> naquele m�s � a soma dos valores dos impostos de todas as faixas. 
> 
> Por fim, a al�quota efetiva � calculada como sendo a taxa (%) do valor total
> do imposto pelo valor da base de c�lculo. 
>
> Todo esses c�lculos podem ser realizados atrav�s do [Simulador de IRPF da
> Receita Federal Brasileira (RFB)](https://www27.receita.fazenda.gov.br/simulador-irpf/). 


Com base na descri��o do c�lculo do IRPF acima, o trabalho a ser realizado pelo
grupo consiste na cria��o de um simulador similar ao simulador disponibilizado
pela RFB. Esse simulador dever� ser constru�do atrav�s do m�todo de TDD
utilizando, **obrigatoriamente**, as t�cnicas de falsifica��o, duplica��o e
triangula��o de testes. 

O projeto resultante do desenvolvimento atrav�s de TDD dever� ser capaz de:  

* Cadastro de rendimentos: 
  * Cadastrar rendimentos com a descri��o (salario, aluguel, etc...) e valor
  * N�o permitir descri��o em branco (nesse caso lan�ar uma exce��o do tipo
    ```DescricaoEmBrancoException```
  * N�o permitir informar valores de rendimentos em branco ou inv�lidos
    (negativos por exemplo). Nesses casos lan�ar exce��o do tipo
```ValorRendimentoInvalidoException``` 

* Cadastro de dedu��es: 
  * Cadastrar dedu��es atrav�s de sua descri��o (Previdencia privada, Funpresp,
    etc...) e valor: 
    * N�o permitir cadastro de dedu��es com descri��o em branco. Nesse caso
      lan�ar ```DescricaoEmBrancoException```.
    * N�o permitir cadastro de valores em branco ou inv�lidos para as dedu��es.
      Nesses casos lan�ar uma exce��o do tipo ```ValorDeducaoInvalidoException``` 
  * Cadastrar uma ou mais contribui��o previdenci�ria oficial, informando
    descri��o e valores. 
    * As restri��es apresentadas no caso acima se aplicam integralmente para
      contribui��es previdenci�rias.
  * Cadastrar uma ou mais pens�o aliment�cia, informando valores. 
    * As restri��es apresentadas no caso acima se aplicam integralmente para
      contribui��es previdenci�rias.
  * Cadastrar dependentes (zero ou mais), informando o nome e a data de
    nascimento de cada dependente. 
    * N�o permitir o cadastro de um dependente com o nome em branco. Nesse caso
      dever� lan�ar uma exce��o do tipo ```NomeEmBrancoException```.

* Calculo dos impostos das faixas de impostos: 
  * Calcular o valor de faixa de base de c�lculo de cada uma das faixas e o
    valor do imposto para cada uma das faixas. 
  * Calcular o valor total das faixas de base de c�lculo e o valor total do
    imposto de todas as faixas. 

* Calcular a al�quota efetiva. 


O trabalho dever� apresentar o emprego das tr�s t�cnicas de TDD (falsifica��o,
duplica��o e triangula��o) em, pelo menos, nas tr�s seguintes situa��es: 

* Calculo do total de dedu��es; 
* C�lculos da base de calculo e do valor de imposto da faixa 1; 
* C�lculo da aliquota efetiva. 

Nesses tr�s casos dever�, para efeito de evid�ncia, ter a seguinte sequencia de
_commits_:
* falsifica��o; 
* duplica��o; 
* triangula��o.

:exclamation::exclamation::exclamation:**ATEN��O:** todos os testes finais
dever�o estar triangulados por parametriza��o, com exce��o dos testes de
exce��es.

---

**Grupos de alunos**

Os trabalhos dever�o ser executados por grupos de at� 6 alunos. O grupo dever�
criar um reposit�rio p�blico no GitHub, cujo arquivo README.md dever� conter os
nomes e matr�culas dos componentes.

| Nome | Matr�cula |
| - | - |
| Bruno Alves F�lix | 16/0114705 |
| Eliseu Kadesh     | 18/0015834 |
| Hugo Arag�o de Oliveira| 16/0124581 |
| Edson Soares | 19/0105381 |
| Francisco Emanoel Ferreira da Penha | 170142329 |
| Enzo Gabriel Guedes Queiroz Saraiva | 16/0119006 |

**Entrega do trabalho:**

Os trabalhos dever�o ser entregues atrav�s de reposit�rio no GitHub, at� as
23:59:59hs do dia 25 de fevereiro de 2022, impreterivelmente.

**Valor do trabalho**

30 pontos.

**Forma de avalia��o**

Os trabalhos ser�o avaliados atrav�s:

- da corretude dos c�lculos realizados pelo simulador;
- da utiliza��o de testes parametrizados em todos os testes funcionais; 
- da utiliza��o de testes de exce��o e, por fim, 
- das seq��ncias de _commits_ para os casos em que o emprego das t�cnicas de
  falsifica��o, duplica��o e triangula��o � obrigat�rio.

  remove