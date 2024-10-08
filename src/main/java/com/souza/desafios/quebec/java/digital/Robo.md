Desafios de Código Intermediário Java - Québec
----------------------------------------------
2 / 3 - Robô
------------

* * *

Desafio
-------

Em um jogo 2D existe um robô de limpeza que começa na posição **(0,0)**. Ele recebe alguns comandos através de uma
sequência de movimentos. Os movimentos válidos são: **'W' (movimento para cima)**, **"S"(movimento para baixo)**, **"D"(
movimento para direita)** e **"A"(movimento para esquerda)**. Você deverá verificar se após completar seus movimentos o
robô se encontra na posição (0,0). Retorne **true** se o robô retornar à origem ou **false** caso contrário. Assuma que
a magnitude do movimento do robô é a mesma para cada movimento.

Entrada
-------

A entrada consiste em duas Strings que representam a sequência de movimentos do Robô.Saída
-----

Cada caso de teste retorna um tipo booleano, **true** ou **false**, de acordo com a entrada e condições do desafio
proposto.

**Exemplo 1:**

| Exemplo de Entrada  | Exemplo de Saída |
|:--------------------|:-----------------|
| Movimento = **"WS"* | true             |

**Explicação:** O robô sobe uma vez e depois desce uma vez. Todos os movimentos têm a mesma magnitude, então acabou na
origem onde começou. Portanto, retornamos **true.**

**Exemplo 2:**

| Exemplo de Entrada   | Exemplo de Saída |
|:---------------------|:-----------------|
| Movimento = **"AA"** | false            |

**Explicação:** O robô se move para a esquerda duas vezes. Termina dois "movimentos" à esquerda da origem. Retornamos *
*false** porque não está na origem no final de seus movimentos.
