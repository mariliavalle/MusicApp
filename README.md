# Projeto Final - Curso de POO da Alura: Aplicação de Música e Podcasts

Este é o projeto final do curso de Programação Orientada a Objetos (POO) da Alura, desenvolvido em Java, com o objetivo de aplicar conceitos de POO para manipulação de músicas e podcasts, com uma análise simples de curtidas, reproduções e classificação.

O sistema simula a interação com músicas e podcasts, permitindo ao usuário reproduzir e curtir conteúdo. Com base nos dados de interações, o sistema classifica os itens e decide se são "sucesso absoluto" ou "excelentes opções para escutar depois".

## 📂 Estrutura do Projeto
O projeto está dividido em dois pacotes:

1. **Pacote principal:** Contém a classe principal (Main.java), que orquestra a execução do programa.
2. **Pacote modelos:** Contém as classes responsáveis pela modelagem dos objetos de áudio, como Musicas, Podcasts e a classe 
MinhasPreferidas que gerencia a avaliação desses objetos.


## 🛠️ Funcionalidades Implementadas
- **Reproduzir e Curtir:** As músicas e podcasts possuem métodos para contar o número de reproduções e curtidas.
- **Classificação:** Músicas e podcasts são classificados com base no número de reproduções e curtidas.
- **Avaliação:** Com base na classificação, o sistema determina se o áudio é um "sucesso absoluto" ou uma "excelente opção".



## 📚 Aprendizados
Este projeto permitiu consolidar vários conceitos importantes da Programação Orientada a Objetos. Alguns dos principais aprendizados incluem:

- **Uso de Herança e Polimorfismo:** Aprendi a criar uma hierarquia de classes usando herança, onde a classe Audio serve como classe base e é estendida pelas classes Musicas e Podcasts. Cada classe filha sobrescreve o método getClassificacao() para implementar uma lógica específica de classificação.

- **Encapsulamento:** A separação das responsabilidades de cada classe tornou o código mais modular e fácil de manter. Cada classe lida com uma parte específica do comportamento, como a música ou o podcast, e utiliza métodos getters e setters para manipulação segura dos atributos.

- **Classes Abstratas e Métodos:** A classe Audio serviu como base para os objetos de música e podcast. O uso de métodos abstratos e a sobrescrita de comportamentos foi essencial para entender como extender funcionalidades nas subclasses de forma clara e eficaz.

- **Coleções em Java:** Utilizei listas e arrays para armazenar e manipular os objetos, como no caso da gestão dos áudios preferidos. Isso me ajudou a entender o uso de coleções para organizar dados de forma dinâmica e eficiente.

- **Interação com o Usuário:** Embora o código não tenha uma interface gráfica, a interação com o usuário foi feita através de métodos simples que imitam o comportamento de reprodução e curtir, o que me permitiu praticar como lidar com entrada de dados e simular ações no terminal.
