UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
TPPE - Técnicas de Programação para Plataformas Emergentes  

| Nome | Matrícula |
| - | - |
| Bruno Alves Félix | 16/0114705 |
| Eliseu Kadesh     | 18/0015834 |
| Hugo Aragão de Oliveira| 16/0124581 |
| Edson Soares | 19/0105381 |
| Francisco Emanoel Ferreira da Penha | 170142329 |
| Enzo Gabriel Guedes Queiroz Saraiva | 16/0119006 |

---

# Trabalho Prático 1 - _Test-Driven Development_

## Entrega

### Commits Rendimentos

[Falsificação Rendimentos](https://github.com/Projetos-TPPE/simulador_irpf/commit/02a12d3d0b5e955a3ce7fa589cdf5c4672cbcf85);

[Duplicação Rendimentos](https://github.com/Projetos-TPPE/simulador_irpf/commit/0e41de46d8056a0d714eb7e78bbabf68d1c081fb);

[Triangulação Rendimentos](https://github.com/Projetos-TPPE/simulador_irpf/commit/5f1597512185fc6e82fdc67dc7a6c011eecfb348);

[Falsificação Rendimetnos](https://github.com/Projetos-TPPE/simulador_irpf/commit/1c3d8d426c6abd6e07b389b938ec712d7a8d04c9);

[Exceções](https://github.com/Projetos-TPPE/simulador_irpf/commit/e37bc73e9be62a73ff5dfcc005ae714907d9414c).


### Commits Deduções

[Falsificação Deduções](https://github.com/Projetos-TPPE/simulador_irpf/commit/e0876c44a105a7f94829c2f42ed907a284316c62);

[Duplicação Deduções](https://github.com/Projetos-TPPE/simulador_irpf/commit/f302be1b70c824423dca5aa2df33c3b38f01745b);

[Triangulação Deduções](https://github.com/Projetos-TPPE/simulador_irpf/blob/dev/src/tst/DeducoesTeste.java) (Por um erro de commit o código da triangulação aparece comentada no intervalo das linhas 177-187);

[Parametrização Deduções](https://github.com/Projetos-TPPE/simulador_irpf/commit/4939ea70082f1b3d8aaacc30de32569725d7331a#);

[Exceções](https://github.com/Projetos-TPPE/simulador_irpf/commit/27dc21a52107fc716a18878bbae761249134752a).

### Commits Calculo da Base

[Falsificação CalculaBase](https://github.com/Projetos-TPPE/simulador_irpf/commit/6a8fd35812b58133a0f1b9014c30cf78718a003c);

[Duplicação CalculaBase](https://github.com/Projetos-TPPE/simulador_irpf/commit/3be64c49c69c665c5a138c900cf297d918ca3c57);

[Triangulação CalculaBase](https://github.com/Projetos-TPPE/simulador_irpf/commit/f2e6dab1fc67975f5be28ef302a12cba5c7cfe04);

[Parametrização CalculaBase](https://github.com/Projetos-TPPE/simulador_irpf/commit/6552b910d443521ccb9354bab0c605bc1bc5a1e1).

### Imposto

[Falsificação Imposto](https://github.com/Projetos-TPPE/simulador_irpf/commit/23668b1af92fbd649497a39a377a603d765b16b3);

[Duplicação Imposto](https://github.com/Projetos-TPPE/simulador_irpf/commit/e65ced5fa9cd1f9d54e768386267cae0d8c93);

[Triangulação Imposto](https://github.com/Projetos-TPPE/simulador_irpf/commit/dd3f6e9c80b3fff1abe8eec81270e01fb8fdd3fa);

[Parametrização Imposto](https://github.com/Projetos-TPPE/simulador_irpf/commit/242b3a2ea0953ff814d07c7197f1d3de02194e64).

### Commits Alíquota

[Falsificação Aliquota Efetiva](https://github.com/Projetos-TPPE/simulador_irpf/commit/e0876c44a105a7f94829c2f42ed907a284316c62);

[Duplicação Aliquota Efetiva](https://github.com/Projetos-TPPE/simulador_irpf/commit/934877fd3242dd7c6b3b10515f5277ba318ad377);

[Triangulação Aliquota Efetiva](https://github.com/Projetos-TPPE/simulador_irpf/commit/fded861e5a53c94ceee44418d99ff8a573b55142);

[Parametrização Aliquota Efetiva](https://github.com/Projetos-TPPE/simulador_irpf/commit/f3f3e0c64dcbbfb4dbfc3d4b37d32778369d854e).

---

**Enunciado do trabalho** 

Seja o seguinte cenário descrito a seguir:

> De um modo bastante resumido, o Imposto de Renda de Pessoa Física (IRPF) de
> todo contribuinte é calculado mensalmente considerando os rendimentos
> tributáveis recebidos no mês corrente e as deduções legais. Da subtração
> desses valores (rendimentos - deduções) obtem-se a *base de cálculo*, sobre o
> qual será calculado o valor do imposto. Há 5 faixas de cálculo de imposto,
> cada qual com sua alíquota (definida em \%) a ser aplicada sobre o valor que a
> base de cálculo ocupou da faixa. O valor do imposto final é a soma dos valores
> de impostos a serem pagos para cada faixa e a alíquota efetiva total (em \%) é
> o resultado do valor do imposto dividido pela base de cálculo. Cada um desses
> passos está detalhado a seguir.
>
> Como rendimentos tributáveis entende-se todos aqueles valores recebidos pelo
> contribuinte tais como salários, aluguéis, participação em lucros e
> rendimentos de empresas, dividendos, lucros de aplicações financeiras, dentre
> outros. O valor total desses rendimentos deve ser utilizado para efeitos do
> cálculo do IRPF. 
>
> O contribuinte tem direito legal a vários deduções no mês corrente. Como
> deduções integrais entende-se aquelas cujos valores totais serão abatidos do
> valor total de dividendos. São exemplos de deduções integrais: 
> * Contribuição previdenciária oficial (podendo ser mais de uma contribuição,
>   por exemplo, no contracheque + contribuição via carnê INSS);
> * Pensão alimentícia;
> * Previdência privada ou Fundo de Previdência dos Servidores públicos
>   (Funpresp); 
> * Valores pagos via carnê-leão, dentre outros.  
>
> O contribuinte poderá ainda deduzir para cada dependente legal o valor de
> R$189,59 por mês.  
> Todas essas deduções deverão ser somadas para efeitos de cálculo do total de
> deduções a que o contribuinte tem direito.  
> 
> A base de cálculo do IRPF é dada pela subtração do total de rendimentos pelo
> total de deduções. 
> 
> Para o valor da base de cálculo, é calculado o valor de cada uma das 5 faixas
> de imposto. As faixas possuem as seguintes alíquotas:   
> 
> | Faixa | Alíquota    |
> |:-----:|:-----------:|
> | 1a.   | 0% (isenta) |
> | 2a.   | 7,5%        |
> | 3a.   | 15%         |
> | 4a.   | 22,5%       |
> | 5a.   | 25%         |
> 
> Portanto, baseado na tabela acima, os valores da base de cálculo que atingiram
> as faixas serão multiplicados pelas respectivas alíquotas para cálculo do
> valor do imposto de cada uma das faixas. O valor total do imposto a ser pago
> naquele mês é a soma dos valores dos impostos de todas as faixas. 
> 
> Por fim, a alíquota efetiva é calculada como sendo a taxa (%) do valor total
> do imposto pelo valor da base de cálculo. 
>
> Todo esses cálculos podem ser realizados através do [Simulador de IRPF da
> Receita Federal Brasileira (RFB)](https://www27.receita.fazenda.gov.br/simulador-irpf/). 


Com base na descrição do cálculo do IRPF acima, o trabalho a ser realizado pelo
grupo consiste na criação de um simulador similar ao simulador disponibilizado
pela RFB. Esse simulador deverá ser construído através do método de TDD
utilizando, **obrigatoriamente**, as técnicas de falsificação, duplicação e
triangulação de testes. 

O projeto resultante do desenvolvimento através de TDD deverá ser capaz de:  

* Cadastro de rendimentos: 
  * Cadastrar rendimentos com a descrição (salario, aluguel, etc...) e valor
  * Não permitir descrição em branco (nesse caso lançar uma exceção do tipo
    ```DescricaoEmBrancoException```
  * Não permitir informar valores de rendimentos em branco ou inválidos
    (negativos por exemplo). Nesses casos lançar exceção do tipo
```ValorRendimentoInvalidoException``` 

* Cadastro de deduções: 
  * Cadastrar deduções através de sua descrição (Previdencia privada, Funpresp,
    etc...) e valor: 
    * Não permitir cadastro de deduções com descrição em branco. Nesse caso
      lançar ```DescricaoEmBrancoException```.
    * Não permitir cadastro de valores em branco ou inválidos para as deduções.
      Nesses casos lançar uma exceção do tipo ```ValorDeducaoInvalidoException``` 
  * Cadastrar uma ou mais contribuição previdenciária oficial, informando
    descrição e valores. 
    * As restrições apresentadas no caso acima se aplicam integralmente para
      contribuições previdenciárias.
  * Cadastrar uma ou mais pensão alimentícia, informando valores. 
    * As restrições apresentadas no caso acima se aplicam integralmente para
      contribuições previdenciárias.
  * Cadastrar dependentes (zero ou mais), informando o nome e a data de
    nascimento de cada dependente. 
    * Não permitir o cadastro de um dependente com o nome em branco. Nesse caso
      deverá lançar uma exceção do tipo ```NomeEmBrancoException```.

* Calculo dos impostos das faixas de impostos: 
  * Calcular o valor de faixa de base de cálculo de cada uma das faixas e o
    valor do imposto para cada uma das faixas. 
  * Calcular o valor total das faixas de base de cálculo e o valor total do
    imposto de todas as faixas. 

* Calcular a alíquota efetiva. 


O trabalho deverá apresentar o emprego das três técnicas de TDD (falsificação,
duplicação e triangulação) em, pelo menos, nas três seguintes situações: 

* Calculo do total de deduções; 
* Cálculos da base de calculo e do valor de imposto da faixa 1; 
* Cálculo da aliquota efetiva. 

Nesses três casos deverá, para efeito de evidência, ter a seguinte sequencia de
_commits_:
* falsificação; 
* duplicação; 
* triangulação.

:exclamation::exclamation::exclamation:**ATENÇÃO:** todos os testes finais
deverão estar triangulados por parametrização, com exceção dos testes de
exceções.

---

**Grupos de alunos**

Os trabalhos deverão ser executados por grupos de até 6 alunos. O grupo deverá
criar um repositório público no GitHub, cujo arquivo README.md deverá conter os
nomes e matrículas dos componentes.

**Entrega do trabalho:**

Os trabalhos deverão ser entregues através de repositório no GitHub, até as
23:59:59hs do dia 25 de fevereiro de 2022, impreterivelmente.

**Valor do trabalho**

30 pontos.

**Forma de avaliação**

Os trabalhos serão avaliados através:

- da corretude dos cálculos realizados pelo simulador;
- da utilização de testes parametrizados em todos os testes funcionais; 
- da utilização de testes de exceção e, por fim, 
- das seqüências de _commits_ para os casos em que o emprego das técnicas de
  falsificação, duplicação e triangulação é obrigatório.

  remove
