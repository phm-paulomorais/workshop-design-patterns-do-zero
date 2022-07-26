Sistemas com o padrão de injeção de dependência são muito comuns no dia a dia dos desenvolvedores, me arrisco a dizer que é o mais utilizado entre todos os outros - essa é apenas minha opinião.

Portanto, vamos imaginar um sistema de cadastro de filmes, para uma locadora.

Você irá utilizar o Weld para ser a implementação do container de injeção de dependência, no caso vamos utilizar o CDI.

Receba do usuário via JOptionPane o nome do filme e data de lançamento.

O filme possui, além do nome e data de lançamento, um tipo, para dizer se é antigo ou novo. Caso o filme tenha sido lançado a mais de 3 meses, é considerado antigo.

Grave em um arquivo xml os dados do filme.

Utilize um serviço separado para fazer a gravação do filme no arquivo. Você irá injetar esse serviço na classe de negócio dos filmes.