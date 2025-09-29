# das-1-2025-2-a

* Princípios de projeto de código
* Padronização de código 
* Ocultmento de informação
* Coesão
* Acoplamento
_________________________________________________________________________________________________________________

*Abstração*

  Abstração é a formatar de forma compreensível todo o seu projeto.

*Ocultação de informação*

  Encapsulamento é quando não temos acesso a todos os componentes

*Coesão*

  Faz uma única tarefa, entidades não tem conecçao com banco, tela... , apenas representação dos dados

*Acoplamento*

  toda vez que é alterado uma parte do código, altera em outro ponto também (Dependencia)

___________________________________________________________________________________________________________________

**SOLID**

- Usar a orientação a objetos da maneira correta.
  S - Classe com responsabilidade única.
  O - Uma classe deve estar fechada para modificações e aberta para extensões.
  L - Trocar uma chamada de uma classe filho por outra classe filho mantém a funcionalidade do código.
  I - Uso de interface para comunicação entre as classes. Evita comunicação direta entre elas.
  D - Classe deve depender de uma abstração e não de implementação concreta.
      - Evitar extends entre classe pai e filho onde a classe filho pode assumir o papel de outra classe filho.
      - O método deve usar somente os seguintes métodos: de sua própria classe, de objetos passados como parâmetros, de objetos criados pelo próprio método, de atributos do próprio método. (Não usar variáveis globais)

Solid foi criado por Robert Martin, objetivo é usar a orientação a objetos de uma maneira correta.

* Sigle Responsability

MVC - M = Dados
      V = HTML
      C = Controlar a tela

Segregação de interfaces

Uma classe deve depender 

**O que é o principio de  inversão de dependência**

  Definição formal
Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
Você deve depender de interfaces e não de implementações concretas.
Isso facilita a troca de componentes (por exemplo, trocar um banco de dados ou um método de envio de email) sem alterar o restante do sistema.

  Quando utilizar herança
Utiliza-se herança na programação para reutilizar código, organizar classes numa hierarquia lógica do tipo "é um", e criar novas
classes que estendam e modifiquem o comportamento das classes existentes, promovendo especialização e evitando duplicação

___________________________________________________________________________________________________________________

26/08/2025

Livro: Fundamentos da arquitetura de software: uma abordagem de engenharia

* Características da arquitetura:
  -Requisitos não-funcionais

* Princípios do design:
  -Cada um tem seu repositorio de banco

* Desisões da arquitetura:
  -Quando escolhemos a melhor arquitetura para utilizar

  O papel do arquiteto de software é amplo e pode variar, mas existem oito expectativas principais que definem sua eficiência:

Tomar decisões arquiteturais que orientem as escolhas técnicas da equipe, equilibrando direção e autonomia, Analisar
continuamente a arquitetura para garantir que ela permaneça viável diante das mudanças tecnológicas e de negócio;
Manter-se atualizado com as tendências tecnológicas e do setor para tomar decisões de longo prazo acertadas;
Assegurar conformidade das equipes com as decisões e princípios arquiteturais para garantir a integridade do sistema;
Ter exposição diversificada a tecnologias, plataformas e linguagens para lidar com ambientes heterogêneos;
Conhecer o domínio do negócio, facilitando comunicação e alinhamento com stakeholders;
Desenvolver habilidades interpessoais para liderar, comunicar e facilitar o trabalho em equipe.

___________________________________________________________________________________________________________________

01/09/25

Expectativas de um Arquiteto
Definir o papel de um arquiteto de software se mostra tão difícil quanto definir a arquitetura de software. Pode variar desde um programador especializado até definir a direção técnica estratégica para a empresa. Em vez de perder tempo com a busca inútil de definir a função, recomendamos focar as expectativas de um arquiteto.

Existem oito expectativas principais para um arquiteto de software, independentemente de qualquer função, cargo ou descrição do trabalho:

* Tomar decisões de arquitetura
* Analisar continuamente a arquitetura
* Manter-se atualizado com as últimas tendências
* Assegurar a conformidade com as decisões
* Exposição e experiência diversificadas
* Ter conhecimento sobre o domínio do negócio
* Ter habilidades interpessoais
* Entender e lidar bem com questões políticas

___________________________________________________________________________________________________________________

Aula 02/09
Fundamentos da Arquitetura de Software - Pensamento Arquitetônico

Diferençca entre Arquitetura e Design

O arquiteto faz sua função primeiro, como, as características da arquitetura, estilo e estrutura dos componentes. um arquiteto é responsável por coisas como analisar os requisitos comerciais para extrair e definir as características da arquitetura, selecionar quais padrões e estilos da arquitetura se encaixariam no domínio do problema e criar componentes (blocos de construção do sistema). Então os artefatos criados a partir dessas atividades são passados para a equipe de desenvolvimento, responsável por criar diagramas de classes para cada componente, criar telas de interface do usuário e desenvolver e testar o código-fonte.

Como é a formação do conhecimento de um arquiteto modelo T?

O escopo dos detalhes técnicos difere entre desenvolvedores e arquitetos. Diferentemente de um desenvolvedor, que deve ter bastante profundidade técnica para realizar seu trabalho, um arquiteto de software deve ter uma grande amplitude técnica para pensar como arquiteto e ver as coisas de um ponto de vista da arquitetura. Como arquiteto, amplitude é mais importante do que profundidade. Como os arquitetos devem tomar decisões que combinam capacidades com restrições técnicas, um grande conhecimento de variadas soluções é valioso. Assim, para um arquiteto, o curso de ação inteligente seria sacrificar uma especialização duramente conquistada e usar esse tempo para ampliar seu portfólio

___________________________________________________________________________________________________________________
  
