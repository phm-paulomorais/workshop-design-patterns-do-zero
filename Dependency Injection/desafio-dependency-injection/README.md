Sistemas com o padr�o de inje��o de depend�ncia s�o muito comuns no dia a dia dos desenvolvedores, me arrisco a dizer que � o mais utilizado entre todos os outros - essa � apenas minha opini�o.

Portanto, vamos imaginar um sistema de cadastro de filmes, para uma locadora.

Voc� ir� utilizar o Weld para ser a implementa��o do container de inje��o de depend�ncia, no caso vamos utilizar o CDI.

Receba do usu�rio via JOptionPane o nome do filme e data de lan�amento.

O filme possui, al�m do nome e data de lan�amento, um tipo, para dizer se � antigo ou novo. Caso o filme tenha sido lan�ado a mais de 3 meses, � considerado antigo.

Grave em um arquivo xml os dados do filme.

Utilize um servi�o separado para fazer a grava��o do filme no arquivo. Voc� ir� injetar esse servi�o na classe de neg�cio dos filmes.