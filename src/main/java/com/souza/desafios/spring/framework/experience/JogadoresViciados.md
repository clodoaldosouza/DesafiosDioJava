Desafios em Java - Spring Experience
------------------------------------
3 / 4 - Jogadores Viciados
--------------------------

* * *

Desafio
-------

Sabemos que você adora passar horas jogando jogos como Liga of Legendas (LOL) e Contra-Strike (CS). LOL pode ser o seu
queridinho, mas você também gosta de usar todas suas grandes habilidades no Contra-Strike!

Com tanto treinamento, você começpu a fazer vídeos das suas jogadas, e eles estão sempre sendo exibidos na_JC -
Jogadores Viciados_, uma página na internet que publica _gameplays_ dos alunos da universidade.

Como a página têm muitos acessos, está sempre publicando material novo, isso pode dificultar na hora de tentar encontrar
algum vídeo específico. Entretanto, como você é programador e domina a artes de conseguir o que quer por meio do código,
você decidiu escrever um programa para encontrar os seus vídeos na página. Dada a lista de _gameplays_ publicados na
página, determine quantos _gameplays_ seus de Contra-Strike foram publicados.

Entrada
-------

A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros **N** e **I** (1 ≤ **N** ≤
104, 1000 ≤ **I** ≤ 9999), o número de _gameplays_ publicados na página e o seu identificador na universidade,
respectivamente.

As próximas **N** linhas descrevem os _gameplays_ publicados. Cada _gameplay_ é descrito por dois inteiros **i** e **j
** (1000 ≤ **i** ≤ 9999, **j**\=0 ou 1), onde **i** é o identificador na universidade do autor do _gameplay_, e **j**\=0
se o _gameplay_ é de Contra-Strike, ou **j**\=1 se é de Liga of Legendas.

A entrada termina com fim-de-arquivo (EOF).

Saída
-----

Para cada caso de teste, imprima uma única linha com um número indicando quantos _gameplays_ seus de Contra-Strike foram
publicados na página.

| Exemplo de Entrada                                                           | Exemplo de Saída |
|:-----------------------------------------------------------------------------|:-----------------|
| 7 5558<br>5693 1<br>5558 0<br>6009 1<br>5558 1<br>1566 0<br>5558 0<br>8757 1 | 2                |
