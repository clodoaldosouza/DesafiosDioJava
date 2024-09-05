Dominando Desafios de Códigos Intermediários em Java
----------------------------------------------------
5 / 5 - Cofres Seguros: Dominando o Encapsulamento e Abstração
--------------------------------------------------------------

* * *

Desafio
-------

Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: um Cofre
Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

Entrada
-------

O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico". Se for escolhido o
tipo "digital", o programa irá solicitar a senha e a confirmação de senha do cofre digital (ambas com apenas números).
Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

Saída
-----

O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o tipo e o método de abertura (
senha). Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave).

Exemplos
--------

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de
testar seu programa com esses exemplos e com outros casos possíveis.

| Exemplo de Entrada       | Exemplo de Saída                                                     |
|:-------------------------|:---------------------------------------------------------------------|
| digital<br>12345<br>1234 | Tipo: Cofre Digital<br>Metodo de abertura: Senha<br>Senha incorreta! |
| fisico                   | Tipo: Cofre Fisico<br>Metodo de abertura: Chave                      |
| digital<br>2525<br>2525  | Tipo: Cofre Digital<br>Metodo de abertura: Senha<br>Cofre aberto!    |
