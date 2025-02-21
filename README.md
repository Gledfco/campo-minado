CAMPO MINADO EM JAVA 

Este é um jogo de Campo Minado desenvolvido em Java como parte do meu aprendizado na linguagem. O jogo permite ao usuário interagir com um tabuleiro, através do console, utilizando a lógica para evitar explosões, marcar campos possivelmente minados e vencer a partida.

2. Funcionalidades :

Este projeto implementa o jogo Campo Minado no console, utilizando caracteres para representar o tabuleiro:


? → Campo fechado (não revelado).
X → Campo marcado como possível mina.
* → Campo contendo uma mina (exibido ao perder o jogo).
Números representam a quantidade de minas ao redor de uma célula aberta.


3. Regras e Mecânica do Jogo:

O jogador pode revelar um campo digitando as coordenadas (linha e coluna).
O jogo termina quando o jogador seleciona uma célula contendo uma mina.
O jogador pode marcar/desmarcar possíveis minas.
O objetivo é revelar todas as células sem minas para vencer.


4. Como Rodar o Projeto

4.1 Pré-requisitos
Java instalado (versão 8 ou superior).
Um terminal para executar o programa.


4.2 Passos para execução

1. Clone o repositório:
git clone https://github.com/seu-usuario/campo-minado-java.git
cd campo-minado-java
Compile o código:

2. Compile o código: 
javac CampoMinado.java

3. Execute o jogo:
java CampoMinado

Após isso, siga as instruções no console para jogar.

5. Tecnologias e Conceitos Utilizados 

Orientação a Objetos
Streams
Lambdas
Tratamento de Exceções

