Para esse exerc�cio vamos treinar sua habilidade de abstra��o para criar um framework para gerar logs em v�rias sa�das poss�veis, por exemplo console ou um arquivo.

Claro que voc� como um excelente programador que conhece orienta��o a objetos, na verdade mais do que isso, conhece como criar um bom projeto orientado a objetos usando os design patterns, n�o ir� criar um c�digo acoplado e dif�cil de estender, mas sim um c�digo desacoplado e extens�vel.

Vamos descrever um pouco do que gostar�amos que nosso framework tenha para facilitar a vida de quem for utiliz�-lo.

Em uma classe que precise gerar logs, receber um objeto do tipo Logger com o m�todo abaixo:

	public void log(String message)

Por exemplo, uma classe chamada CalculadoraDeImpostos, que no m�todo calcular, ir� imprimir o valor calculado:

	public class CalculadoraDeImpostos {
	  
	  private Logger logger;
	
	  public CalculadoraDeImpostos(Logger logger) {
	    this.logger = logger;
	  }
	  
	  public void calcular(double valor) {
	    // Aqui teria uma l�gica para calcular impostos sobre o valor passado
	
	    // no fim, o programador gostaria de deixar registrado o valor calculado
	    logger.log("Imposto calculado para o valor R$" + valor);
	  }
	
	}

Veja bem, essa � uma classe de exemplo, um cliente do nosso framework. O seu trabalho � criar todas as classes/interfaces que ser�o usadas para criar esse objeto logger e passar a uma classe de exemplo, como a acima.

Alguns requisitos importantes:

 - Antes de cada mensagem de log, deve ser impresso o dia e hora atuais
 - O framework deve ser extens�vel para v�rios tipos de sa�da (console, arquivo txt, xml, etc)

Crie tamb�m um diagrama de classe para mostrar como seu framework funciona.

Gostaria muito que voc� trabalhasse e tentasse muito antes de olhar o diagrama de classe que criei como um exemplo para esse projeto. Fa�a v�rios testes e assista novamente a aula, v�rias vezes at� o Factory Method estiver grudado na sua cabe�a.

O diagrama que criei est� logo abaixo. Mas te aconselho muito tentar bem antes de olhar qualquer imagem.

<img alt="Diagrama de classes" title="Diagrama de classes" src="imagem/diagrama-de-classes.png" width="800px" />

