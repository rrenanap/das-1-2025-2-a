# das-1-2025-2-a

Princípios de projeto de código
Padronização de código 
Ocultmento de informação
Coesão
Acoplamento

Abstração
  Abstração é a formatar de forma compreensível todo o seu projeto.

Ocultação de informação
  Encapsulamento é quando não temos acesso a todos os componentes

Coesão
  Faz uma única tarefa, entidades não tem conecçao com banco, tela... , apenas representação dos dados

Acoplamento
  toda vez que é alterado uma parte do código, altera em outro ponto também (Dependencia)

SOLID

Solid foi criado por Robert Martin, é usar a Orientação a objetos de uma maneira correta 

Sigle Responsability

MVC - M = Dados
      V = HTML
      C = Controlar a tela

Segregação de interfaces

Uma classe deve depender 

o que é o principio de  inversao de dependencia

  Definição formal
Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
Você deve depender de interfaces (ou abstrações) e não de implementações concretas.
Isso facilita a troca de componentes (por exemplo, trocar um banco de dados ou um método de envio de email) sem alterar o restante do sistema.

  Quando utilizar herança

      
