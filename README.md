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
  
29/09/2025 - Segundo Bimestre, Vambora.

https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638

Circuit breaker

O padrão Circuit Breaker ajuda a lidar com falhas que podem levar diferentes períodos de tempo para serem resolvidas quando um aplicativo se conecta a um serviço ou recurso remoto. Um disjuntor bloqueia temporariamente o acesso a um serviço com falha depois de detectar falhas. Essa ação impede repetidas tentativas malsucedidas para que o sistema possa se recuperar efetivamente. Esse padrão pode melhorar a estabilidade e a resiliência de um aplicativo.

Quais são os estados do circuit breaker?

Closed - Open - Half-Open

Closed, está tudo ok
Open, estado de falha
Half-open, Estado de alerta

 ___________________________________________________________________________________________________________________

 06/10/2025

**Resumo sobre características da arquitetura de software**

Quando uma empresa decide resolver um problema com software, inicia-se uma definição de requisitos, 
que normalmente foca nas funcionalidades do domínio do negócio. Porém, o arquiteto de software precisa considerar também as características da arquitetura, 
que vão além da funcionalidade e incluem aspectos críticos para o sucesso do sistema, como desempenho, segurança, escalabilidade, entre outros.

Essas características da arquitetura não são requisitos funcionais tradicionais e são essenciais para influenciar a estrutura do design do sistema, 
estando fora do domínio direto do problema. Elas podem ser explícitas (documentadas) ou implícitas (necessárias, mas não formalizadas), e devem ser cuidadosamente escolhidas para evitar complexidade excessiva.

As características da arquitetura podem ser divididas em três grandes grupos:

1. **Operacionais**: relacionadas ao desempenho do sistema, como disponibilidade, continuidade, confiabilidade, escalabilidade e robustez.
2. **Estruturais**: relacionadas à qualidade do código e da arquitetura, como modularidade, portabilidade, manutenção, configuração e extensibilidade.
3. **Transversais**: abrangem aspectos que atravessam o sistema, como acessibilidade, segurança, privacidade, autenticação, autorização, legalidade e usabilidade.

Não há uma lista universal definitiva para essas características, e muitas vezes termos semelhantes possuem definições diferentes dependendo do contexto. 
Organizações como a ISO oferecem algumas definições, mas a arquitetura de software ainda enfrenta ambiguidades e interpretações diversas.

Os arquitetos precisam fazer **trade-offs**, ou seja, equilibrar características que podem conflitar por exemplo, aumentar a segurança pode prejudicar o desempenho.
Por isso, a arquitetura ideal raramente maximiza todas as características, e a recomendação é buscar a "arquitetura menos pior", que é iterativa e ajustável ao longo do tempo, alinhando-se a práticas ágeis.


 ___________________________________________________________________________________________________________________
 
  07/10/2025

Quando uma empresa decide resolver um problema com software, ela começa definindo requisitos para o sistema. 
O arquiteto de software vai além dos requisitos funcionais do domínio e foca nas características da arquitetura, 
que são aspectos essenciais para o sucesso do sistema e influenciam seu design estrutural, mas não estão diretamente ligados à funcionalidade do negócio.

Características da arquitetura são diferentes dos requisitos funcionais e geralmente incluem fatores como desempenho, 
segurança, escalabilidade e manutenção. Elas precisam atender a três critérios: serem fora do domínio funcional, impactar a estrutura do design e ser essenciais para o sucesso da aplicação.

Essas características podem ser explícitas (documentadas) ou implícitas (entendidas pela experiência dos arquitetos). Elas abrangem diversas categorias:

* **Operacionais:** desempenho, escalabilidade, disponibilidade, confiabilidade, robustez, entre outras.
* **Estruturais:** modularidade, manutenção, portabilidade, configuração, reutilização, etc.
* **Transversais:** segurança, autenticação, autorização, usabilidade, legalidade, privacidade, entre outras.

Cada característica adiciona complexidade ao sistema, por isso o arquiteto deve escolher quais priorizar, 
buscando equilíbrio entre elas — o famoso trade-off. Por exemplo, melhorar a segurança pode impactar negativamente o desempenho.

Como exemplo, foi citada a exigência “Como na Itália”, que representa uma combinação única de disponibilidade, 
recuperabilidade e resiliência, mostrando que características da arquitetura podem ser específicas a contextos particulares.

Além disso, a falta de definições claras no campo da arquitetura de software gera confusão, 
sendo importante que equipes usem uma linguagem comum para evitar mal-entendidos.

Por fim, arquitetos devem mirar na “arquitetura menos pior”, ou seja, um design iterativo que permita ajustes e 
não tente maximizar todas as características ao mesmo tempo, pois isso geralmente leva a soluções complicadas e ineficazes.

___________________________________________________________________________________________________________________

  13/10/2025

A arquitetura em camadas, ou n-tier, é um estilo comum por sua simplicidade, baixo custo e fácil entendimento. 
Ela organiza o sistema em camadas horizontais com funções específicas, como apresentação, negócio, 
persistência e banco de dados, o que facilita a especialização dos desenvolvedores e a organização do sistema. 
camadas podem ser implementadas de formas variadas, podendo estar combinadas ou separadas fisicamente.

Um aspecto fundamental é o isolamento das camadas, onde cada uma depende apenas da camada imediatamente abaixo, 
evitando acoplamento excessivo e facilitando a manutenção. Camadas podem ser fechadas, com acesso sequencial, 
ou abertas, permitindo saltos entre elas, sendo as fechadas recomendadas para maior isolamento e estabilidade.

Embora seja uma boa opção para sistemas pequenos ou quando o estilo arquitetural ainda não está definido, 
a arquitetura em camadas apresenta limitações para sistemas maiores, como dificuldade de manutenção, baixa agilidade, 
desempenho e escalabilidade devido ao caráter monolítico. Um problema comum é o antipadrão "sinkhole", 
quando requisições passam pelas camadas sem processamento relevante, desperdiçando recursos.

A arquitetura em camadas é adequada para sistemas simples, com restrições de tempo e orçamento, 
e equipes familiarizadas com o modelo, mas para sistemas mais complexos, arquiteturas modulares e distribuídas são mais indicadas.

___________________________________________________________________________________________________________________

 14/10/2025

  CORBA
    O CORBA funciona como um middleware para comunicação entre aplicações distribuídas, independentemente da linguagem ou plataforma. Ele usa um Object Request Broker (ORB),
    que gerencia a comunicação entre o cliente e o servidor,utilizando definições feitas em uma Interface Definition Language (IDL).
    O processo envolve a compilação de um arquivo IDL para gerar "stubs" do lado do cliente e "skeletons" do lado do servidor,que lidam com a tradução de chamadas e dados de forma transparente. 

  gRPC
    O gRPC funciona como um sistema de chamada de procedimento remoto (RPC) de alto desempenho, onde um cliente pode chamar um método diretamente em um servidor,
    como se fosse um objeto local. Isso é viável através da definição de um "contrato" de serviço usando Protocol Buffers (em arquivos .proto), que especifica os métodos, entradas e saídas.
    O compilador de Protocol Buffers gera código para cliente e servidor a partir desse contrato, facilitando a comunicação entre sistemas escritos em linguagens diferentes.
    A comunicação utiliza o protocolo HTTP/2, permitindo eficiência e recursos como multiplexação e streaming, o que torna o gRPC ideal para microsserviços e aplicações distribuídas.

Um monolito, na programação, é uma arquitetura de software onde toda a aplicação é construída como uma única unidade unificada, com todas as funcionalidades (como autenticação, pagamento, etc.) contidas em uma única base de código. Essa abordagem é simples para 
começar, pois facilita o desenvolvimento inicial e a implantação em um único pacote. No entanto, pode se tornar complexa, difícil de manter e escalar à medida que o projeto cresce. 

  Características
Unidade única: Todo o código (lógica de negócios, interface do usuário, acesso a dados) reside em um único aplicativo. 
Comunicação: As funcionalidades se comunicam diretamente dentro do mesmo sistema, o que pode tornar as consultas e chamadas internas rápidas. 
Implantação: Atualizações envolvem a implantação de toda a aplicação, ou seja, um único pacote de deploy. 

  Vantagens
Simplicidade inicial: É mais fácil e rápido começar um projeto novo com uma arquitetura monolítica. 
Desenvolvimento inicial simplificado: Menos complexidade no início e menos necessidade de comunicação entre equipes, pois tudo está em um só lugar. 
Gerenciamento mais simples: Gerenciar uma única infraestrutura é geralmente mais fácil e barato do que gerenciar múltiplas infraestruturas, como nos microsserviços. 

  Desvantagens
Dificuldade de manutenção: À medida que o código cresce, o monolito pode se tornar difícil de entender e manter. 
Conflitos de desenvolvimento: Com muitos desenvolvedores trabalhando na mesma base de código, aumenta a probabilidade de conflitos nas alterações. 
Atualizações restritivas: Para atualizar uma parte do sistema, é necessário implantar toda a aplicação, o que pode ser demorado. 
Dificuldade de escalar: Escalar partes específicas do sistema pode ser um desafio, pois a escala envolve todo o aplicativo. 

  Transações distribuídas
    Arquitetos e desenvolvedores têm por certo as transações em um mundo da arquitetura monolítica porque são muito simples e fáceis de gerenciar. 
    Os commits e rollbacks padrão, executados a partir das frameworks de persistência, utilizam as transações ACID (atomicidade, consistência, isolamento,
    durabilidade) para assegurar que os dados sejam atualizados de um modo correto para garantir uma alta consistência e integridade deles. Esse não é o caso nas arquiteturas distribuídas.
    As arquiteturas distribuídas contam com o que é chamado de consistência eventual para assegurar que os dados processados por unidades de implementação separadas estejam,
    em algum ponto não especificado no tempo, todos sincronizados com um estado consistente.
    Esse é um dos trade-offs da arquitetura distribuída: alta escalabilidade, desempenho e disponibilidade em troca da consistência e da integridade dos dados.

___________________________________________________________________________________________________________________

21/10/2025

A arquitetura em camadas, também chamada de arquitetura n-tier, é um dos estilos mais comuns por sua simplicidade, baixo custo e facilidade de entendimento. 
Ela organiza o sistema em camadas horizontais, cada uma com uma função específica, geralmente incluindo apresentação, negócio, persistência e banco de dados. 
Essa separação facilita a especialização dos desenvolvedores e mantém o sistema organizado. As camadas podem ser implementadas de formas variadas, podendo ser combinadas ou separadas fisicamente.

Um conceito importante nessa arquitetura é o isolamento das camadas, onde cada uma deve depender apenas da camada imediatamente inferior para evitar acoplamento excessivo e facilitar manutenção. 
Camadas podem ser fechadas (com acesso sequencial) ou abertas (permitindo saltos entre camadas), mas camadas fechadas são recomendadas para maior isolamento e estabilidade.

Apesar de ser um bom ponto de partida, principalmente para sistemas pequenos ou quando não há definição clara do estilo arquitetural, a arquitetura em camadas apresenta limitações para aplicações maiores. 
Ela pode se tornar difícil de manter, pouco ágil e ter baixo desempenho e escalabilidade devido à sua natureza monolítica. 
Um problema comum é o antipadrão chamado "sinkhole", onde as requisições apenas passam pelas camadas sem realizar lógica significativa, causando desperdício de recursos.

A arquitetura em camadas é ideal para sistemas simples, com restrições de tempo e orçamento, e equipes com familiaridade com o modelo. Para sistemas mais complexos e de maior escala, arquiteturas mais modulares e distribuídas são mais indicadas.

______________________________________________________________________________

04/11/2025

Um HashMap é uma estrutura de dados que armazena informações em pares de chave-valor, onde cada chave é única e está associada a um valor correspondente. A principal vantagem é a rapidez com que ele consegue adicionar, buscar e remover elementos, pois utiliza um método de hashing para encontrar o local de armazenamento de forma eficiente. Isso permite um desempenho geralmente em tempo constante, o que o torna ideal para buscar informações rapidamente, como um dicionário.

Como funciona:

Armazenamento: Ele armazena dados como pares (chave, valor). Por exemplo, você pode armazenar {"código postal": "12345-678"} onde "código postal" é a chave e "12345-678" é o valor.
Hashing: Quando você adiciona um par chave-valor, o valor da chave é processado por uma função hash, que retorna um código hash (um número).
Localização: Esse código hash é usado para determinar em qual local (ou "bucket") o par deve ser armazenado dentro da estrutura.
Recuperação: Para buscar um valor, o HashMap calcula novamente o código hash da chave fornecida e vai diretamente ao local correspondente para encontrar o valor.
Eficiência: Isso evita a necessidade de percorrer toda a lista de dados para encontrar um valor. A busca por um elemento é muito rápida, mesmo para um grande número de itens. 




























 
  
