Voc� foi contratado para criar um sistema que c�lcula o pr�mio de um seguro.

Na linguagem do seguro, pr�mio � o valor que voc� pagar para ter direito ao seguro.

Voc� ir� criar um sistema iterativo, usando a classe Scanner para receber os dados do usu�rio.

Veja o diagrama abaixo como devem ser as classes desse sistema:

<img alt="Diagrama de classes" title="Diagrama de classes" src="imagem/desafio-strategy-v2.png" width="400px" />

A sequ�ncia deve ser assim:

Pe�a os dados do cliente
Entre em um loop
Pergunte o tipo do ve�culo
Crie a inst�ncia da calculadora para carro ou moto
Injete essa inst�ncia, atrav�s do m�todo setCalculadora() em PropostaSeguro
Fa�a a proposta, chamando o m�todo gerar()
Volte ao in�cio do loop
Veja que com esse exemplo, voc� ir� trocar o algoritmo em tempo de execu��o.