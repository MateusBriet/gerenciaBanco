# gerenciaBanco

Este projeto é uma aplicação de console simples para gerenciamento bancário, desenvolvida em Java utilizando o Apache Maven. Ele foi criado como parte de uma aula prática de Linguagem Orientada a Objetos, com o objetivo de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO), como classes, objetos, atributos e métodos.

## Funcionalidades

A aplicação permite ao usuário:

*   **Cadastrar uma conta:** Informando nome, sobrenome e CPF.
*   **Consultar saldo:** Visualizar o saldo atual da conta.
*   **Realizar depósito:** Adicionar um valor ao saldo da conta.
*   **Realizar saque:** Retirar um valor do saldo da conta, com verificação de saldo suficiente.
*   **Sair:** Encerrar a aplicação.

## Estrutura do Projeto

O projeto `gerenciaBanco` é um projeto Maven padrão e possui a seguinte estrutura:

```
gerenciaBanco/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── mycompany/
    │               └── gerenciaBanco.java
    └── test/
        └── java/
            └── com/
                └── mycompany/
                    └── AppTest.java
```

*   `pom.xml`: Arquivo de configuração do Maven, que gerencia as dependências e o ciclo de vida do projeto.
*   `gerenciaBanco.java`: Contém a lógica principal da aplicação, incluindo a classe `ContaBancaria` e a classe `gerenciaBanco` com o método `main`.

## Como Compilar e Executar

Para compilar e executar este projeto, você precisará ter o Java Development Kit (JDK) e o Apache Maven instalados em sua máquina.

### Pré-requisitos

*   **Java Development Kit (JDK) 8 ou superior**
*   **Apache Maven 3.6.3 ou superior**

### Passos para Execução

1.  **Clone o repositório** (se estiver no GitHub) ou navegue até a pasta raiz do projeto `gerenciaBanco`.

2.  **Compile o projeto** usando Maven:
    ```bash
    mvn clean install
    ```

3.  **Execute a aplicação** a partir da linha de comando:
    ```bash
    mvn exec:java -Dexec.mainClass="com.mycompany.gerenciaBanco"
    ```

    Alternativamente, você pode executar o JAR gerado na pasta `target`:
    ```bash
    java -jar target/gerenciaBanco-1.0-SNAPSHOT.jar
    ```

    *Nota: O nome do arquivo JAR pode variar dependendo da versão do projeto definida no `pom.xml`.*

## Conceitos de POO Aplicados

*   **Classes e Objetos:** `ContaBancaria` é uma classe que define a estrutura e o comportamento de uma conta. Um objeto `conta` é instanciado a partir desta classe.
*   **Atributos:** `nome`, `sobrenome`, `cpf` e `saldo` são atributos da classe `ContaBancaria`, representando as características de uma conta.
*   **Métodos:** `consultarSaldo()`, `depositar()` e `sacar()` são métodos que encapsulam as operações que podem ser realizadas em uma `ContaBancaria`.
*   **Encapsulamento:** Os atributos da classe `ContaBancaria` são `private`, e o acesso a eles é feito através de métodos públicos, garantindo a integridade dos dados.

## Melhorias Futuras (Opcional)

Para tornar esta aplicação mais robusta e completa, algumas melhorias poderiam incluir:

*   **Persistência de Dados:** Salvar as informações das contas em um arquivo (CSV, JSON) ou banco de dados para que os dados não sejam perdidos ao encerrar a aplicação.
*   **Múltiplas Contas:** Permitir a criação e gerenciamento de múltiplas contas bancárias, talvez armazenadas em uma lista ou mapa.
*   **Interface Gráfica (GUI):** Desenvolver uma interface gráfica de usuário (com Swing, JavaFX ou web) para uma experiência mais amigável.
*   **Tratamento de Exceções:** Implementar um tratamento de exceções mais robusto para entradas inválidas do usuário (e.g., `InputMismatchException`).
*   **Testes Unitários:** Adicionar testes unitários para garantir o correto funcionamento das operações da `ContaBancaria`.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

