# Design Patterns: Factory Method

## ✨ Introdução
- Se resume a soluções típicas para problemas comuns em um projeto de software. Elas podem ser aplicadas independentemente da linguagem.
- São como plantas pré-projetadas de uma construção, que você pode alterar para se adequar melhor na resolução de um problema recorrente em seu código. O que diferencia os padrões de projeto das funções e bibliotecas é que você não pode simplesmente copiá-los direto para seu programa, já que eles **não são um pedaço de código, mas sim um conceito que serve como uma solução**. Assim, para se implementar um padrão de projeto você deve seguir o conceito dos padrões escolhidos (dentre todos os existentes) e ajustá-lo ao problema que deseja resolver.

## 🧱 Princípios SOLID
O SOLID é uma sigla em inglês para cinco princípios de projeto que possuem o objetivo de fazer programas mais compreensíveis, flexíveis e sustentáveis. Não faz parte dos design patterns, mas por serem boas práticas que garantem diversos benefícios é bem comum de aprender ambos os temas ao mesmo tempo.
- “S” Single Responsibility Principle (Princípio de responsabilidade única): uma classe deve ter uma e apenas uma razão para mudar.
- “O” Open-Closed Principle (Princípio aberto/fechado): objetos devem estar disponíveis para extensão, mas fechados para modificação.
- “L” Liskov Substitution Principle (Princípio de substituição de Liskov): uma subclasse deve ser substituível por sua superclasse.
- “I” Interface Segregation Principle (Princípio de segregação de interface): uma classe não deve ser obrigada a implementar métodos e interfaces que não serão utilizadas.
- “D” Dependency Inversion Principle (Princípio de inversão de dependência): dependa de abstrações e não de implementações.

Os três principais padrões de projeto definidos pelo livro **“Design Patterns: Elements of Reusable Object-Oriented Software”** de 1994, escrito por GOF (Gang of Four: Rich Gamma, Richard Helm, Ralph Johnson e John Vlissides) são os **padrões criacionais, estruturais e comportamentais**. Esses padrões foram divididos e agrupados de acordo com a natureza do problema que eles solucionam.

## 📦 Tipos de Padrões de Projeto
1) Padrões criacionais: estes padrões oferecem diversas a**lternativas de criação de objetos, o que aumenta a flexibilidade e a reutilização de código**. Alguns dos principais padrões desse tipo são:
- Factory Method
- Abstract Factory
- Builder

2) Padrões estruturais: Nos mostram como **montar objetos e classes em estruturas maiores**, sem perder a eficiência e flexibilidade. Alguns dos principais padrões desse tipo são:
- Adapter
- Bridge
- Composite

3) Padrões comportamentais: Nos ajudam a trabalhar melhor com os **algoritmos e com a delegação de responsabilidades entre os objetos**. Os padrões que se destacam nesse tipo são:
- Chain of Responsibility
- Command
- Interpreter

## 🏭 Factory Method
- Tipo criacional
- Tem o objetivo de fornecer uma maneira flexivel e desacoplada de criar objetos sem precisar especificar suas classes concretas diretamente no código.
- Basicamente, **a lógica criacional é encapsulada dentro do *factory*** e, ou é fornecido um método que retorna um novo objeto criado (Padrão *Factory Method*) ou delega-se a criação do objeto para uma subclasse (Padrão *Abstract Factory*).
- O cliente não precisa conhecer as diferentes implementações da interface ou da classe. A única coisa que o cliente precisa conhecer é a *Factory* (*Factory Method* ou *Abstract Factory*) para que possa obter uma instância de uma das implementações da interface.
- Dessa forma, os clientes são desacoplados da criação de objetos. **Esse desacoplamento se dá em função da aplicação do princípio da inversão de dependência(SOLID).**
- Portanto, o padrão *Factory* possibilita desacoplar objetos de criação do sistema subjacente através do encapsulamento do código responsável pela criação de objetos. Isso tem como resultado também uma maior simplificação para os desenvolvedores quando é necessária a realização de refatoração no código, pois agora existe um único ponto onde as alterações podem ocorrer.
