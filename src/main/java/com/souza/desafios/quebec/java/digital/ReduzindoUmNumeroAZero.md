Desafios de Código Intermediário Java - Québec
----------------------------------------------
1 / 3 - Reduzindo um número a zero
------------------------------------------------------------------------------

* * *

Desafio
-------

Dado um inteiro **x**, retorne o **número de etapas para reduzi-lo a zero**. Em uma etapa, **se** o número atual for *
*par**, você **deve dividi-lo por 2**, caso contrário, você deve **subtrair 1** dele.

Entrada
-------

A entrada consiste em um número inteiro **x.** Você deverá implementar a solução de acordo com a descrição do desafio.

Saída
-----

O resultado impresso, será o valor exato das etapas possíveis para reduzir o valor de **x** a **zero**, como nos
exemplos a baixo:

**Exemplo 1:**

| Exemplo de Entrada | Exemplo de Saída |
|:-------------------|:-----------------|
| 14                 | 6                |

**Explicação:**

**Etapa 1)** 14 é par; divida por 2 e obtenha 7.

**Etapa 2)** 7 é ímpar; subtraia 1 e obtenha 6.

**Etapa 3)** 6 é par; divida por 2 e obtenha 3.

**Etapa 4)** 3 é ímpar; subtraia 1 e obtenha 2.

**Etapa 5)** 2 é par; divida por 2 e obtenha 1.

**Etapa 6)** 1 é ímpar; subtraia 1 e obtenha 0.

**Exemplo 2:**

| Exemplo de Entrada | Exemplo de Saída |
|:-------------------|:-----------------|
| 8                  | 4                |

**Explicação:**

**Etapa 1)** 8 é par; divida por 2 e obtenha 4.

**Etapa 2)** 4 é par; divida por 2 e obtenha 2.

**Etapa 3)** 2 é par; divida por 2 e obtenha 1.

**Etapa 4)** 1 é ímpar; subtraia 1 e obtenha 0.
