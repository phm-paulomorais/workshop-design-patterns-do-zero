Voc� foi contratado para criar um framework que auxiliar� comerciantes a fazerem vendas dos seus produtos.

Todo o processo de venda � o mesmo:

Gerar uma nota fiscal eletr�nica que ir� calcular o valor do imposto dos produtos.
Emitir um boleto banc�rio com a descri��o dos produtos e o valor do imposto discriminado.
Para facilitar um pouco sua vida, n�o precisa de realmente gerar uma nota fiscal eletr�nica de verdade e nem gerar um boleto, apenas a simula��o � importante, pois nosso objetivo � o padr�o Abstract Factory.

O c�lculo do imposto ficar� na Nota Fiscal Eletr�nica (NF-e), mas existe um detalhe importante. Cada estado brasileiro t�m suas regras para c�lculo do imposto, ent�o seu sistema deve ser capaz de realizar uma venda independ�nte do estado que ele estiver.

A boleta tamb�m tem suas particularidade, um comerciante pode escolher utilizar a Caixa Economica Federal ou outro banco, como o Banco do Brasil.

Ent�o sua tarefa � criar um framework estens�vel que possa realizar uma venda cujo procedimento foi descrito, por�m trocando a fam�lia de objetos que essa venda � composta.

Para as coisas ficarem mais interessante, e seu sistema ficar muito configur�vel, voc� ir� deixar a escolha das implementa��es em um arquivo .properties.

O que isso quer dizer? Que voc� ter� apenas uma implementa��o de f�brica abstrata. E as implementa��es de cada objeto (NFe ou Boleta) ser� feita utilizando a API de Reflection.

Veja abaixo o arquivo .properties sugerido:

nfe=com.algaworks.nfe.sp.SaoPauloNFe
boleta=com.algaworks.boleta.bb.BBBoleta
Repare que a chave "nfe" tem o nome da classe que sabe como gerar NF-e para S�o Paulo. J� a chave "boleta" tem o nome da classe que gera a boleta para o Banco do Brasil.

Se voc� chamar esse arquivo de config.properties e coloc�-lo na pasta: src/main/resources no seu projeto Maven, para carreg�-lo as propriedades, utilize o c�digo abaixo:

Properties prop = new Properties();
prop.load(this.getClass().getResourceAsStream("/config.properties"));
Agora sempre que voc� precisar recuperar o valor de uma chave, basta executar o c�digo:

String classeNFe = this.prop.getProperty("nfe");
Para criar uma inst�ncia de uma classe com um nome, ou seja, uma String, basta utilizarmos generics da seguinte forma:

String classeNFe = this.prop.getProperty("nfe");
NFe nfe = (NFe) Class.forName(this.prop.getProperty("nfe")).newInstance();
Mais uma vez eu deixei o diagrama de classes dessa ideia aqui.