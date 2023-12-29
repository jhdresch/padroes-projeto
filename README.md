# Factory Method


## Aplicabilidade

Use o Factory Method quando não souber de antemão os tipos e dependências exatas dos objetos com os quais seu código deve funcionar.

 O Factory Method separa o código de construção do produto do código que realmente usa o produto- Portanto, é mais fácil estender o código de construção do produto independentemente do restante do código.

Por exemplo, para adicionar um novo tipo de produto à aplicação, só será necessário criar uma nova subclasse criadora e substituir o método fábrica nela.

 Use o Factory Method quando desejar fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos.

 Herança é provavelmente a maneira mais fácil de estender o comportamento padrão de uma biblioteca ou framework. Mas como o framework reconheceria que sua subclasse deve ser usada em vez de um componente padrão?

A solução é reduzir o código que constrói componentes no framework em um único método fábrica e permitir que qualquer pessoa sobrescreva esse método, além de estender o próprio componente.

Vamos ver como isso funcionaria. Imagine que você escreva uma aplicação usando um framework de UI de código aberto. Sua aplicação deve ter botões redondos, mas o framework fornece apenas botões quadrados. Você estende a classe padrão Botão com uma gloriosa subclasse BotãoRedondo. Mas agora você precisa informar à classe principal UIFramework para usar a nova subclasse no lugar do botão padrão.

Para conseguir isso, você cria uma subclasse UIComBotõesRedondos a partir de uma classe base do framework e sobrescreve seu método criarBotão. Enquanto este método retorna objetos Botão na classe base, você faz sua subclasse retornar objetos BotãoRedondo. Agora use a classe UIComBotõesRedondos no lugar de UIFramework. E é isso!

 Use o Factory Method quando deseja economizar recursos do sistema reutilizando objetos existentes em vez de recriá-los sempre.

 Você irá enfrentar essa necessidade ao lidar com objetos grandes e pesados, como conexões com bancos de dados, sistemas de arquivos e recursos de rede.

Vamos pensar no que deve ser feito para reutilizar um objeto existente:

Primeiro, você precisa criar algum armazenamento para manter o controle de todos os objetos criados.
Quando alguém solicita um objeto, o programa deve procurar um objeto livre dentro desse conjunto.
...e retorná-lo ao código cliente.
Se não houver objetos livres, o programa deve criar um novo (e adicioná-lo ao conjunto de objetos).
Isso é muito código! E tudo deve ser colocado em um único local para que você não polua o programa com código duplicado.

Provavelmente, o lugar mais óbvio e conveniente onde esse código deve ficar é no construtor da classe cujos objetos estamos tentando reutilizar. No entanto, um construtor deve sempre retornar novos objetos por definição. Não pode retornar instâncias existentes.

Portanto, você precisa ter um método regular capaz de criar novos objetos e reutilizar os existentes. Isso parece muito com um método fábrica.



## Como  implement

 - Faça todos os produtos implementarem a mesma interface. Essa interface deve declarar métodos que fazem sentido em todos os produtos.

- Adicione um método fábrica vazio dentro da classe criadora. O tipo de retorno do método deve corresponder à interface comum do produto.

- No código da classe criadora, encontre todas as referências aos construtores de produtos. 

Um por um, substitua-os por chamadas ao método fábrica, enquanto extrai o código de criação do produto para o método fábrica. 

Pode ser necessário adicionar um parâmetro temporário ao método fábrica para controlar o tipo de produto retornado.

Neste ponto, o código do método fábrica pode parecer bastante feio. Pode ter um grande operador switch que escolhe qual classe de produto instanciar. 

Mas não se preocupe, resolveremos isso em breve.

- Agora, crie um conjunto de subclasses criadoras para cada tipo de produto listado no método fábrica- Sobrescreva o método fábrica nas subclasses e extraia os pedaços apropriados do código de construção do método base.

- Se houver muitos tipos de produtos e não fizer sentido criar subclasses para todos eles, você poderá reutilizar o parâmetro de controle da classe base nas subclasses.
Por exemplo, imagine que você tenha a seguinte hierarquia de classes: a classe base Correio com algumas subclasses: CorreioAéreo e CorreioTerrestre; as classes Transporte são Avião, Caminhão e Trem- Enquanto a classe CorreioAéreo usa apenas objetos Avião, o CorreioTerrestre pode funcionar com os objetos Caminhão e Trem- Você pode criar uma nova subclasse (por exemplo, CorreioFerroviário) para lidar com os dois casos, mas há outra opção- O código do cliente pode passar um argumento para o método fábrica da classe CorreioTerrestre para controlar qual produto ele deseja receber.

Se, após todas as extrações, o método fábrica base ficar vazio, você poderá torná-lo abstrato- Se sobrar algo, você pode tornar isso em um comportamento padrão do método.

## Prós e contras

### Prós
Você evita acoplamentos firmes entre o criador e os produtos concretos.

Princípio de responsabilidade única- 

Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.

Princípio aberto/fechado- Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.
### Contras
O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão- O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.

# Abstrat Factory


## Aplicabilidade

Use o Abstract Factory quando  seu  código  precisa  trabalhar  com  diversas  famílias  de  produtos  relacionados, mas  que  você  não  quer  depender  de classes concretas  daqueles produtos-eles podem  ser  desconhecidos  de  antemão  ou  você  simplesmente  quer  permitir  uma  futura  escalabilidade.

O Abstract Factory fornece a você  uma interface para a criação  de  objetos  de  cada  classe  das  famílias  de  produtos- Desde  que  seu  código  crie  objetos a partir  dessa interface, você  não  precisará  se  preocupar  em  criar  uma  variante  errada  de  um  produto  que  não  coincida  com  produtos  já  criados  por  sua  aplicação.

Considere  implementar o Abstract Factory quando  você  tem  uma  classe  com  um  conjunto  de  métodos  fábrica  que  desfoquem  sua  responsabilidade principal.

Em  um  programa  bem  desenvolvido  cada  classe é responsável  por  apenas  uma  coisa- Quando  uma  classe  lida  com  múltiplos  tipos  de  produto, pode  valer a pena  extrair  seus  métodos  fábrica  em  uma  classe  fábrica  solitária  ou  uma  implementação  plena do Abstract Factory.

## Como  implementar

Mapeie  uma  matriz  de  tipos  de  produtos  distintos versus as variantes  desses  produtos.

Declare interfaces de  produto  abstratas  para  todos  os  tipos  de  produto- Então, faça  todas as classes concretas  de  produtos  implementar  essas interfaces.

Declare a interface da  fábrica  abstrata  com  um  conjuntos  de  métodos  de  criação  para  todos  os  produtos  abstratos.
Implemente  um  conjunto  de classes fábricas  concretas, uma  para  cada  variante  de  produto.

Crie  um  código  de  inicialização  da  fábrica  em  algum  lugar  da  aplicação- Ele  deve  instanciar  uma  das classes fábrica  concretas, dependendo  da  configuração  da  aplicação  ou do ambiente  atual- Passe esse  objeto  fábrica  para  todas as classes que  constroem  produtos.

Escaneie o código e encontre  todas as chamadas  diretas  para  construtores  de  produtos- Substitua-as por  chamadas  para o método  de  criação  apropriado no objeto  fábrica.

## Prós e contras

### Prós
Você  pode  ter  certeza  que  os  produtos  que  você  obtém  de  uma  fábrica  são  compatíveis  entre  si.
Você  evita  um  vínculo forte entre  produtos  concretos e o código  cliente.
Princípio  de  responsabilidade  única- Você  pode  extrair o código  de  criação do produto  para  um  lugar, fazendo o código  ser  de  fácil  manutenção.

### Contras
O código  pode tornar-se mais  complicado do que  deveria  ser, uma  vez  que  muitas  novas interfaces e classes são  introduzidas  junto  com o padrão.
Princípio  aberto/fechado. Você  pode  introduzir  novas  variantes  de  produtos  sem  quebrar o código  cliente  existente.
