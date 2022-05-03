# Titulo

## Características escolhidas

Com base nas características apresentadas no livro _Code Craft : The Practice of Writing Excellent Code_ escolhemos as seguintes características de um projeto ideal:

- Simplicidade;
- Ausência de duplicidades;
- Idiomático;
- Elegância;
- Boa documentação.

## Simplicidade

### Definição
A simplicidade consiste na implementação mais coerente e coesa o possível, evitando inchaços de código e operações desnecessárias que tornam o código difícil de ser implementado. A visão de uma contribuição simples ajuda na manutenabilidade do projeto, assim como facilita sua evolução. No _Code Craft_ o autor lembra que você sempre pode aumentar o código, mas difícilmente pode alterar algo préviamente implementado.

Podemos citar algumas reflexões válidas:

- Extensibilidade **vs** simplicidade:
- Eficiência **vs** segurança;
- Funcionalidades **vs** Esforço de desenvolvimento.

### Maus Cheiros
**Codigo Duplicado**: Se o mesmo trecho de código aparecer em vários pontos do projeto, saiba que sua solução será melhor se você conseguir unificá-los;

**Método Longo**: Quanto maior for o  método, mais difícil é de entendê-lo. Vários métodos curtos (e a delegação entre eles) é preferível;

**Classe Grande**: Quando uma classe apresenta muitas variáveis de instâncias é indício de que ela está com coesão baixa (fazendo mais do que deveria);

**Longa lista de parâmetros**: Listas longas de parâmetros são muito suscetíveis a mudanças;

**Cirurgia com Rifle**: ao realizar uma mudança várias classes devem sofrer modificações;

**Inveja de Recursos**: Quando métodos de uma classe estão mais interessados nos recursos de outras classes (geralmente atributos);

**Cadeias de mensagens**: Ocorre quando um objeto chama outro, que chama outro, que chama outro e assim sucessivamente.

### Refatoração

Caso haja casos de **Método Longo** uma poderosa forma de refatoração é a repartir esse métodos em *Métodos Curtos*:

**Antes**
~~~java
void metodo () {
    //... A
    //... B 
    //... C
}
~~~

**Depois**
~~~java
void metodo_a() {
    //... A
}

void metodo_b() {
    //... B
}

void metodo_c() {
    //... C
}

void metodo () {
  metodo_a(); // chamada método ... A
  metodo_b(); // chamada método ... B
  metodo_c(); // chamada método ... C
}
~~~

--- 
Caso haja casos de **código duplicado** uma das soluções possíveis é usar a operação de *Extrair Método*, seguindo os seguintes passos:

- Mover o código para um método separado
- Agrupar fragmentos de códigos que estavam separados

**Antes**
~~~java
void printOwing() {
  printBanner();

  // Print details.
  System.out.println("name: " + name);
  System.out.println("amount: " + getOutstanding());
}
~~~

**Depois**
~~~java
void printOwing() {
  printBanner();
  printDetails(getOutstanding());
}

void printDetails(double outstanding) {
  System.out.println("name: " + name);
  System.out.println("amount: " + outstanding);
}
~~~

## Ausência de duplicidades

### Definição

Quando um código é bem projetado ele não tem duplicação, caso seja diagnosticado repetição de código, isso pode afetar diretamente outros princípios, como o design elegante e de simplicidade, além disso pode acarretar problemas de segurança e manutenibilidade, normalmente é ocasionado por “ recortar e colar “.

### Maus Cheiros

**Codigo Duplicado**: Se o mesmo trecho de código aparecer em vários pontos do projeto, saiba que sua solução será melhor se você conseguir unificá-los;

### Refatoração

Caso haja códigos repetidos ou semelhantes você pode generalizar o código, assim centralizando e gerando uma alta coesão. 

**Antes**

~~~java
  if (isSpecialDeal()) {
    total = price * 0.95;
    send();
  }
  else {
    total = price * 0.98;
    send();
  }
~~~

**Depois**
~~~java
  if (isSpecialDeal()) {
    total = price * 0.95;
  }
  else {
    total = price * 0.98;
  }
  send();
~~~

## Idiomático

### Definição
Essa característica compreende tudo que está relacionado ao acordo de contribuição idiomática, onde o código é entendido mais fácil se estiver na mesma língua daquele que está lendo, e até mesmo que seja em língua extrangeira ele se mantenha no padrão.

Os estilos de programação são propriedades levadas em consideração em várias linguagens, onde atributos como:

- Imperativo (ou procesdural) onde a linguagem te permite especificar os passos que vão gerar a saída.
- Uma boa declaração também descreve as relações entre termos e variáveis.

### Refatoração
A refatoração nesse caso é simples, o que precisaria fazer é definir uma lingua padrão para todos os dados que não são palavras reservadas da linguagem:

No caso abaixo dados como *value*, verifySaldo* estão em inglês, mas o projeto se encontra em portugês. 

**Antes**
~~~java
public class Conta {
	private Double saldo;

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double value) {
		saldo += value;
	}

	public void verifySaldo() {
		System.out.println("Valor do Saldo: "+getSaldo());
	}
}
~~~

**Depois**
~~~java
public class Conta {
	private Double saldo;

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void verificaSaldo() {
		System.out.println("Valor do Saldo: "+getSaldo());
	}
}
~~~

## Elegância

### Definição

A elegância diz respeito a parte estética do design e por muitas vezes anda de mãos dadas com a simplicidade. Um código elegante é aquele que não é excessivamente complexo e também não é confuso. Existem caraterísticas que tornamcódigo elegante: 
- O controle deve fluir por todo o sistema;
- As partes devem se complementar, acrescentando algo distinto e valioso;
- O design não deve ser repleto de casos especiais;
- Coisas semelhantes devem ser associadas
- Não devem haver surpresas desagráveis ao longo do código;
- As mudanças simples não devem gerar muitas outras mudanças no código.

### Maus Cheiros

**Classe preguiçosa**: Classes que não possuem comportamentos suficientes para serem mantidas no projeto. Geralmente, são pequenas demais e devem ser eliminadas do projeto.

**Biblioteca de classes incompleta**: É comum encontrar bibliotecas de classes que não oferecem todos os recursos dos quais precisamos. Além de não possuir acesso ao código fonte para modificá-lo.

**Cirurgia com Rifle**: O mau cheiro, Cirurgia com Rifle, ocorre ao realizar uma mudança onde várias classes devem sofrer modificações. Normalmente é difícil encontrar todos os pontos afetados e fácil de esquecer modificações.

### Refatoração

Caso haja classes pequenas demais, com um comportamento insuficiente para o projeto, **Classe preguiçosa**, elas devem ser retiradas.

**Antes**
~~~java
public class CalcularAreaTerreno {
    Scanner entrada = new Scanner(System.in);
    double lado, area;
    
    double calculaValorTerreno () {
        area = calculaArea();
        valorTerreno = area * 30000;
        System.out.println("O valor do terreno é: R$" + valorTerreno);
    }

    double calculoArea() {
        area = lado*lado;
    }
}
~~~

**Depois**
~~~java
public class Calculo_area_quadrado {
    Scanner entrada = new Scanner(System.in);
    double lado, area;
    
    area = lado*lado;
    valorTerreno = area * 30000;
    System.out.println("O quadrado da área é: " + area;
}
~~~

## Boa documentação

### Definição

A documentação também é parte fundamental de um bom design. É importante que quem leia o código não precise inferir tudo sozinho. Essa característica se torna mais nos níveis mais altos do design. A documentação se faz importante em todos os espectros do código, tanto na parte arquitetural e nas funções aplicadas no código, quanto também em uma documentação de uma API. Portanto a documentação em um projeto faz toda a diferença.

### Maus Cheiros

**Codigo Duplicado**: Se o mesmo trecho de código aparecer em vários pontos do projeto, saiba que sua solução será melhor se você conseguir unificá-los;

**Método Longo**: Quanto maior for o  método, mais difícil é de entendê-lo. Vários métodos curtos (e a delegação entre eles) é preferível;

**Classe Grande**: Quando uma classe apresenta muitas variáveis de instâncias é indício de que ela está com coesão baixa (fazendo mais do que deveria);

### Refatoração

**Antes**
~~~java
public class Sum   
{
    public static void main(String args[])
    { 
        int count, sum = 0;
        
        for(int number = 1; number <= 200; number++)
        {
            count = 0;
            for (int i = 2; i <= number/2; i++)
            {
                if(number % i == 0)  
                {
                    count++;  
                    break;  
                }
            }

            if(count == 0 && number != 1 )  
            {
                sum = sum + number;  
            }
        }
        System.out.println("The Sum of Prime Numbers from 1 to 200 is: " + sum);  
    }
}
~~~

**Depois**
~~~java
public class SumOfPrimeNumbers1   
{  
    public static void main(String args[])   
    {
        int count, sum = 0;  
        //the loop executes 100 time and increments the variable number by 1 after each iteration  
        for(int number = 1; number <= 200; number++)  
        {
            count = 0;  
            for (int i = 2; i <= number/2; i++)  
            {
                //find the remainder and check if it is equal to 0 or not      
                if(number % i == 0)  
                {
                    //increments the count variable by 1 if the above condition returns true  
                    count++;  
                    break;  
                }
            }  
            //returns true if both conditions are true  
            if(count == 0 && number != 1)  
            {  
                //calculates the sum of prime numbers      
                sum = sum + number;  
            }
        }
        System.out.println("The Sum of Prime Numbers from 1 to 200 is: " + sum);  
    }
}
~~~