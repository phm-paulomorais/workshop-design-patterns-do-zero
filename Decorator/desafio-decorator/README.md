Neste exerc�cio gostaria que voc� criasse um cache para uma classe que busca arquivos em XML.

Voc� vai usar o padr�o Decorator para essa tarefa, ou seja, n�o ir� alterar a classe que acessa o arquivo.

O sistema possui uma classe AgendaDAO que insere e busca os dados do arquivo. Veja abaixo como deve ser essa classe:

<img alt="AgendaDAO" title="Classe AgendaDAO" src="imagem/desafio-decorator-agendadao.png" width="200px" />

E a classe Contato:

<img alt="Contato" title="Classe Contato" src="imagem/desafio-decorator-contato.png" width="200px" />

O funcionamento � bem simples, para salvar um novo Contato voc� ir� pass�-lo no m�todo inserir de AgendaDAO. E para buscar um, passe o c�digo.

OBS: Se voc� quiser implementar essa busca em banco de dados, fique a vontade. O importante � ter acesso a uma fonte de dados externa.

A classe CacheAgendaDAO ir� decorar a AgendaDAO.

Voc� ir� decorar a inser��o e a busca da Agenda, para isso use um map, como abaixo:

Map<Integer, Contato> contatos;
Use a chave do mapa com o c�digo do contato.

Consegue usar o que aprendemos e criar todo esse sistema?

Dica: crie a classe AgendaDAO usando apenas o arquivo e esque�a que existir� cache, depois disso pronto, implemente o Decorator.