Agora que voc� viu a facilidade que o padr�o Builder traz para criar os seus objetos, vamos treinar um pouco mais adicionando atributos como datas e usando at� uma abstra��o.

Voc� precisa facilitar a cria��o de uma nota fiscal, que cont�m um n�mero, uma data de emiss�o e itens de produtos.

A data de emiss�o deve ser do tipo java.util.Date, por�m voc� ir� facilitar a cria��o desse objeto, aceitando no seu builder a data em String do formato dd/MM/yyyy.

O produto possui um nome, quantidade e valor. Este �ltimo do tipo BigDecimal mas, voc� deve aceitar esse valor como String ou como Double no builder.

Para deixar um pouco mais interessante, vamos pensar que podemos criar dois tipos de notas fiscais, uma para pessoa f�sica e outra para pessoa jur�dica.

A diferen�a entre esses duas classes est� no c�lculo do imposto, que para pessoa f�sica custa 7% do valor total e em pessoa jur�dica, 4%.

Vamos misturar alguns padr�es? Nessa ideia de c�lculo do imposto, podemos usar o Factory Method.

Vou deixar uma pista: se o c�culo do imposto � sempre da mesma forma, podemos criar um m�todo abstrato que recupera esse valor na superclasse NotaFiscal, e criar um m�todo nessa mesma classe que faz as contas.

E a �ltima dica �: voc� ter� apenas um builder, ent�o crie dois m�todos, um para criar cada inst�ncia, NotaFiscalPessoaFisica ou NotaFiscalPessoaJuridica.