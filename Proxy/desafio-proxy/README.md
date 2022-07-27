Este desafio pode ficar interessante tanto quanto voc� queria deix�-lo mais real. Pois a ideia � enviar e-mails para clientes, e voc� pode realmente faz�-lo, de uma forma extremamente simples, uando um servi�o na internet, como o Mandrill.

Se quiser apenas simular o envio de e-mails, fique a vontade. Adicione uma mensagem de log apenas para ver o comportamento esperado, ok?

Como adiantei, o exerc�cio � baseado na ideia de enviar e-mails a clientes. O que queremos fazer �, colocar um proxy que ir� controlar o acesso ao objeto que faz o envio do e-mail de fato.

Portanto voc� precisa pensar que ter� uma classe chamada EnviadorEmailMandrill que implementa uma interface EnviadorEmail com o m�todo abaixo:

	public void enviar(String mensagem);
	
No construtor da classe EnviadorEmailMandrill voc� ir� receber uma lista de strings (e-mails).

Queremos controlar o acesso a esse objeto, adicionando os pontos abaixo:

 - Existe um arquivo xml com uma lista negra de e-mails, ou seja, que N�O devem ser usados
 - Devemos antes de chamar o enviador de e-mails, remover esses e-mails da lista passada
 
 Resumindo, gostar�amos de um proxy que remove todos os e-mails da lista nigra da lista original antes de passar para o enviador de e-mails de fato.

Sua tarefa � criar todo esse sistema e tamb�m o diagrama de classes.

Bom trabalho.