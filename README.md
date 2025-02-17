# Calculadora Simples

Este é um projeto simples em Java que implementa uma calculadora capaz de realizar as seguintes operações matemáticas:

- Somar (`+`)
- Subtrair (`-`)
- Multiplicar (`*`)
- Dividir (`/`)
- Resto (`%`)

## Como usar

### Requisitos

- Java 8 ou superior instalado no seu computador.

### Passos

1. **Clone o repositório** ou baixe o código-fonte:
   
   ```bash
   git clone https://github.com/seu-usuario/calculadora.git

2. **Compile e execute o código:**

No terminal, navegue até o diretório onde o arquivo **Calculadora.java** está localizado e execute o seguinte comando para compilar:

  ```bash
   javac Calculadora.java

  ```
Para executar o programa:

  ```bash
   java Calculadora
  ```

3. **Interaja com o programa:**

O programa vai pedir para o usuário escolher a operação desejada (representada por um símbolo, como `+`, `-`, `*`, `/` ou `%`), seguido dos dois números sobre os quais a operação será realizada.

4. **Exemplo de execução:**

Ao rodar o programa, o usuário verá algo como:

  ```java
  No momento temos as seguintes operações disponíveis: somar(+), subtrair(-), multiplicar(*), dividir(/), resto(%)
  Qual operação (símbolo) deseja realizar: +
  Digite o primeiro número: 10
  Digite o segundo número: 5
  Resultado: 15.0
```
## Funcionalidades

- **Soma**: Adiciona dois números.
- **Subtração**: Subtrai o segundo número do primeiro.
- **Multiplicação**: Multiplica dois números.
- **Divisão**: Divide o primeiro número pelo segundo. A divisão por zero gera uma exceção.
- **Resto**: Retorna o resto da divisão do primeiro número pelo segundo.

## Como funciona

1. O programa solicita ao usuário que insira a operação matemática desejada, representada por um símbolo.
2. O usuário insere dois números.
3. A função `calcular` é chamada, e a operação é executada de acordo com o símbolo fornecido.
4. O resultado é exibido no console.

## Exceções

- O programa lança uma exceção (`IllegalArgumentException`) se o usuário fornecer uma operação desconhecida ou tentar realizar uma divisão por zero.






   
